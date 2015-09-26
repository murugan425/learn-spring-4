/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 20, 2015
 * @time	: 7:43:52 PM
 */
package com.tamil.learnspring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tamil.learnspring.model.Actor;

/**
 * @author Murugan_Nagarajan
 *
 */
@Component("actorDAO")
public class ActorDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcNamedTemplate;
	
	@Value("${GET_ACTORS_LIST}") private String getActorsList;
	@Value("${GET_ACTOR_BYNAME}") private String getActorByName;
	@Value("${DEL_ACTOR_BYID}") private String delActoryById;
	@Value("${INSERT_ACTOR}") private String insertActor;
	@Value("${UPDATE_SINGLE_ACTOR}") private String updateSingleActor;
	@Value("${INSERT_ACTOR_WITHID}") private String insertActorWithId;
		
	public List<Actor> getActorsList() {
		return jdbcTemplate.query(getActorsList, new RowMapper<Actor>() {

			public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
				Actor actor = new Actor();				
				actor.setActorId(rs.getInt("actor_id"));
				actor.setFirstName(rs.getString("first_name"));
				actor.setLastName(rs.getString("last_name"));
				actor.setLastUpdatedTime(rs.getTimestamp("last_update"));
				return actor;
			}
			
		});
	}

	/**
	 * @param userName
	 * @return List<Actor>
	 */
	public List<Actor> getActorsByName(String userName) {
		MapSqlParameterSource params = new MapSqlParameterSource("NAME",userName);
		return jdbcNamedTemplate.query(getActorByName, params, new RowMapper<Actor>() {

			public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
				Actor actor = new Actor();				
				actor.setActorId(rs.getInt("actor_id"));
				actor.setFirstName(rs.getString("first_name"));
				actor.setLastName(rs.getString("last_name"));
				actor.setLastUpdatedTime(rs.getTimestamp("last_update"));
				return actor;
			}		
		});
	}

	/**
	 * @param actorId
	 */
	public Integer deleteActorByID(Integer actorId) {
		MapSqlParameterSource params = new MapSqlParameterSource("ID",actorId);
		return (Integer)jdbcNamedTemplate.update(delActoryById, params);
	}

	/**
	 * @param actor1
	 * @return
	 */
	public Boolean createSingleActor(Actor actor) {
		BeanPropertySqlParameterSource bpsParams = new BeanPropertySqlParameterSource(actor);
		return (jdbcNamedTemplate.update(insertActor, bpsParams) == 1);
	}

	/**
	 * @param actorToUpdate
	 * @return
	 */
	public Boolean updateActor(Actor actorToUpdate) {
		BeanPropertySqlParameterSource bpsParams = new BeanPropertySqlParameterSource(actorToUpdate);
		return (jdbcNamedTemplate.update(updateSingleActor, bpsParams) == 1);
	}

	/**
	 * @param actorsToAdd
	 * @return
	 */
	@Transactional
	public int[] createActors(List<Actor> actorsToAdd) {
		SqlParameterSource[] actorsList = SqlParameterSourceUtils.createBatch(actorsToAdd.toArray());
		return jdbcNamedTemplate.batchUpdate(insertActorWithId, actorsList);
	}
}
