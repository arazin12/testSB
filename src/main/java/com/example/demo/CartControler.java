/*package com.example.demo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repositories.CartRepository;

@Controller
public class CartControler {
	@Autowired
	CartRepository repository;

	@Autowired
	HttpSession session;

	@RequestMapping(value = "/cart2", method = RequestMethod.GET)
	public ModelAndView carttouroku(
			@ModelAttribute("formModel") Cart cart,
			ModelAndView mav) {
	        mav.addObject("cart", cart);
		mav.setViewName("cart");
		mav.addObject("title", "find Page");
		Timestamp t=new Timestamp(System.currentTimeMillis());
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-mm-dd");
		String str=sf.format(t);
		mav.addObject("msg", str);
		//mav.addObject("value", "");

	   // mav.addObject("allFeatures", Arrays.asList("xxx", "yyy"));
		//Iterable<FomData> list = repository.findAll();
		//mav.addObject("datalist", list);
		return mav;
	}

	@RequestMapping(value = "/cart", method = RequestMethod.POST)
	public ModelAndView fmodel(
			@ModelAttribute("formModel") Cart cart,
			ModelAndView mav) {
		// List<String> checks = .getChecks();
	        mav.addObject("cart",cart);
		mav.setViewName("cart2");
		mav.addObject("title", "find Page");
		mav.addObject("msg", "Cartaのサンプル");
		ArrayList c=(ArrayList)session.getAttribute("data");
		if(c==null) {
			c=new ArrayList();
		}
		c.add(cart);
		Iterable cc=c;
		session.setAttribute("data",cc);
		//mav.addObject("value", "");
		mav.addObject("data2",cc);
		mav.addObject("formModel",new Cart());
		System.out.println("-----"+c.size());
	   // mav.addObject("allFeatures", Arrays.asList("xxx", "yyy"));
		//Iterable<FomData> list = repository.findAll();
		//mav.addObject("datalist", list);
		return mav;
	}






	@RequestMapping(value = "/fom2", method = RequestMethod.POST)
	public ModelAndView search(
			@ModelAttribute("formModel")Cart fomdata,
			ModelAndView mav) {
		ArrayList c=(ArrayList)session.getAttribute("data");
		c.add(fomdata);
		Iterable cc=c;
		session.setAttribute("data", cc);
		mav.addObject("data2",cc);

		// List<String> checks = fomdata.getChecks();
	       // mav.addObject("checks", checks);
		//mav.addObject("formModel",fomdata);
		mav.setViewName("fom2");
		//FomData list=repository.findById(Long.parseLong(param));
		//mav.addObject("datalist",list);
		return mav;
	}


}*/