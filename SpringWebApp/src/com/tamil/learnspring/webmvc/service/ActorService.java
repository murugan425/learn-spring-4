/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 26, 2015
 * @time	: 10:08:50 PM
 */
package com.tamil.learnspring.webmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.learnspring.webmvc.dao.ActorDAO;
import com.tamil.learnspring.webmvc.model.Actor;

/**
 * @author Murugan_Nagarajan
 *
 */
@Service("actorService")
public class ActorService {

	@Autowired
	private ActorDAO actorDao;
	
	public List<Actor> getActorsList() {
		return actorDao.getActorsList();
	}
	
}
