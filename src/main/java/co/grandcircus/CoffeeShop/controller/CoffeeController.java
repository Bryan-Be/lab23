package co.grandcircus.CoffeeShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	@RequestMapping("/reg-form")
	public ModelAndView formFiller() {
		
		return new ModelAndView("reg-form");
	}
	@RequestMapping("/submit-form")
	public ModelAndView submission(@RequestParam("firstName")String firstName,
			@RequestParam("lastName")String lastName,
			@RequestParam("eMail")String eMail,
			@RequestParam("phoneNumber")String phoneNumber,
			@RequestParam("passWord")String passWord) {			
		ModelAndView mv = new ModelAndView("congrats");	
		mv.addObject("firstName", firstName);
		return mv;
		}
	}
