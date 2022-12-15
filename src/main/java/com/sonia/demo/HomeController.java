package com.sonia.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("home")
//	@ResponseBody // you can print any text you want
//	public String home(HttpServletRequest req, HttpServletResponse res) 
	//public ModelAndView home(@RequestParam("aname") String myName) 
	
	public ModelAndView home(Alien alien)
	{
//		System.out.println("HI...................!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		// ßHttpSession session = req.getSession();
		// String name = req.getParameter("name");

		ModelAndView mv = new ModelAndView();

		//System.out.println("Hi " + myName);
		mv.addObject("obj", alien);
		mv.setViewName("home");

		return mv;

	}

}
