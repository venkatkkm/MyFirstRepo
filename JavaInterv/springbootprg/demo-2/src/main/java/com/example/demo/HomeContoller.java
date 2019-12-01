package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContoller {

	/*
	 * @RequestMapping("home") public void home() {
	 * System.out.println("my home controller"); }
	 */
	
	/*
	 * @RequestMapping("/home")
	 * 
	 * public String home(HttpServletRequest req) { HttpSession session =
	 * req.getSession(); String name = req.getParameter("name");
	 * System.out.println("hi "+name); session.setAttribute("name", name); return
	 * "home.jsp"; }
	 */
	
	//If you remove that req,resp and session by mvc
	/*
	 * @RequestMapping("/home") public ModelAndView home(@RequestParam("name")
	 * String myName) { ModelAndView mv = new ModelAndView();
	 * System.out.println("hi " + myName); mv.addObject("name", myName);
	 * mv.setViewName("home.jsp"); return mv; }
	 */
	
	//If we want to accept request data as an Object
	@RequestMapping("/home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home.jsp");
		return mv;
	}
	
	 
}
