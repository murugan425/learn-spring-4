/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 25, 2015
 * @time	: 2:32:48 PM
 */
package com.tamil.learnspring.webmvc.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tamil.learnspring.webmvc.constants.JSPFolderConstants;
import com.tamil.learnspring.webmvc.model.Actor;
import com.tamil.learnspring.webmvc.service.ActorService;

/**
 * @author Murugan_Nagarajan
 *
 */
@Controller
public class ManageActorController {
	
	@Autowired
	private ActorService actorService;
	
	@RequestMapping("/getactorslist")
	public ModelAndView getActorsList() {
		ModelAndView mv = new ModelAndView(JSPFolderConstants.displayFolder + "DisplayActors");
		Map<String, Object> model = mv.getModel();
		List<Actor> actorsList = actorService.getActorsList();
		model.put("actors", actorsList);
		return mv;
	}
}
