/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 25, 2015
 * @time	: 2:59:02 PM
 */
package com.tamil.learnspring.webmvc.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tamil.learnspring.webmvc.constants.JSPFolderConstants;


/**
 * @author Murugan_Nagarajan
 *
 */
@Controller
public class BasicController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return JSPFolderConstants.basicFolder+"Home";
	}
	
	@RequestMapping("/systemdown")
	public String showSystemDown() {
		return JSPFolderConstants.basicFolder+"SystemDown";
	}
	
	@RequestMapping("/session")
	public String showSessionObj(HttpSession session) {
		session.setAttribute("userName", "Murugan");
		return JSPFolderConstants.basicFolder+"SessionObj";
	}
	
	@RequestMapping("/modelandview")
	public ModelAndView showModelViewObj() {
		ModelAndView mv = new ModelAndView(JSPFolderConstants.basicFolder+"ModelViewObj");
		Map<String, Object> model = mv.getModel();
		model.put("userName", "Murugan Tamil");
		return mv;
	}
	
	@RequestMapping("/model")
	public String showModelObj(Model model) {
		model.addAttribute("userName", "Murugan");
		return JSPFolderConstants.basicFolder+"ModelObj";
	}
	
	@RequestMapping("/modeltojstl")
	public String showModelObjViaJSTLTag(Model model) {
		model.addAttribute("userName", "<b>Murugan</b>");
		return JSPFolderConstants.basicFolder+"JSTLDisplay";
	}
	
	@RequestMapping("/sqlquery")
	public String showDataViaSQLJSTLTag() {
		return JSPFolderConstants.dataFolder+"SQLQueryBinding";
	}
	
}
