package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FomControler {
	/*	@Autowired
		FomRepository repository;*/

	@RequestMapping(value = "/select1", method = RequestMethod.GET)
	public ModelAndView fmodel(
			//@ModelAttribute("formModel") Form fomdata,
			ModelAndView mav) {
			Map<String,String> m=this.getSelectedItems();
			for(int i=0;i<m.size();i++) {
				System.out.println("===="+m.get(i));

			}
		//mav.addObject("titleMsg", "selectbox");
		mav.addObject("selectItems", getSelectedItems());
		mav.setViewName("select1");
		mav.addObject("ans",2);
		//mav.addObject("title", "Select Page");
		//mav.addObject("msg", "複数選択のサンプル");
		//mav.addObject("value", "");

		//mav.addObject("allFeatures", Arrays.asList("xxx", "yyy"));
		//Iterable<FomData> list = repository.findAll();
		//mav.addObject("datalist", list);
		return mav;
	}

	@RequestMapping(value = "/select1", method = RequestMethod.POST)
	public ModelAndView search(
			@ModelAttribute("formModel") Form fomdata,
			@RequestParam("selectedItem")String s,
			ModelAndView mav) {
		//Map<String,String> s=fomdata.getSelectedItem();


		System.out.println("==="+s);
		//mav.addObject("checks", checks);
		mav.addObject("ans",3);
		mav.addObject("selectItems",getSelectedItems());
		mav.addObject("ans",s);
		mav.setViewName("select2");
		//FomData list=repository.findById(Long.parseLong(param));
		//mav.addObject("datalist",list);
		return mav;
	}
		private static  Map<String,String> getSelectedItems(){
		     Map<String, String> selectMap = new LinkedHashMap<String, String>();
		     selectMap.put("1", "選択肢Ａは、これですよ");
		     selectMap.put("2", "選択肢Ｂは、これですよ");
		     selectMap.put("3", "選択肢Ｃは、これですよ");
		     selectMap.put("4", "選択肢Ｄは、これですよ");
		     selectMap.put("5", "選択肢Ｅは、これですよ");
		     return selectMap;
		 }
}