/*package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repositories.FomDataRepository;

@Controller
public class QuizControler {
	@Autowired
	FomDataRepository repository;

	@RequestMapping(value = "/quiz1", method = RequestMethod.GET)
	public ModelAndView quizIn(Animal animal,
			ModelAndView mav) {
		mav.addObject("animalCheckBox",getCheckBoxAnimal());
		mav.addObject("animal",animal);
		return mav;
	}

	@RequestMapping(value = "/quiz2", method = RequestMethod.POST)
	public ModelAndView quizOut(ModelAndView mav,Animal animal) {
		mav.addBOject("animal",animal.getSelectAnimals());
		return mav;
	}
	private Map<String ,String> getCheckBoxAnimal(){

	    Map<String, String> checkBoxAnimal = new LinkedHashMap<String , String>();

	    checkBoxAnimal.put("dolphin", "いるか");
	    checkBoxAnimal.put("rabbit", "うさぎ");
	    checkBoxAnimal.put("penguin", "ぺんぎん");
	    return checkBoxAnimal;
	  }

}*/