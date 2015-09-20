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
import org.springframework.stereotype.Component;

import com.tamil.learnspring.model.Actor;

/**
 * @author Murugan_Nagarajan
 *
 */
@Component("actorDAO")
public class ActorDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("${GET_ACTORS_LIST}")
	private String getActorsList;
	
	public List<Actor> getActorsList() {
		System.out.println(getActorsList);
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
}
