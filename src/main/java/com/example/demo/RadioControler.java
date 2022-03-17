package com.example.demo;

//ラジオボタンの送付
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RadioControler {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView checked2(ModelAndView mnv,
			@ModelAttribute("form") RadioData form) {
		//RadioDataクラスのインスタンスを生成し、チェックボタンの値を設定
		RadioData data = new RadioData();
		/*ArrayList checks=new ArrayList();
		checks.add("1");
		checks.add("2");
		checks.add("3");*/
		ArrayList checks = data.getChecks();
		mnv.addObject("SelectList", checks);
		mnv.setViewName("radio1");
		return mnv;
	}

	@RequestMapping(value = "/test", params = "submit", method = RequestMethod.POST)
	public ModelAndView checked(ModelAndView mnv,
			@ModelAttribute("form") RadioData form) {
		ArrayList<String> checkdata = form.getChecks();
		mnv.addObject("checkdata", checkdata);
		RadioData data = new RadioData();
		//FprmModelでチェックボックスにチェックをしている値を取得
		ArrayList checks = data.getChecks();
		mnv.addObject("SelectList", checks);
		mnv.setViewName("radio2");
		return mnv;
	}

	//test
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test1(ModelAndView mav) {
		//thとtableに値を持たせ繰り返せるか？

		//mav.addObject("SelectList", checks);
		mav.setViewName("test1");
		return mav;
	}

	//test
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ModelAndView test2(ModelAndView mav) {
		//thとtableに値を持たせ繰り返せるか？
		/*		ArrayList<Long> l=new ArrayList<Long>();
				ArrayList<Long> m=new ArrayList<Long>();
				for(long i=1;i<10;i++) {
					l.add(i);
					m.add(i*10);
					System.out.println("===="+m.get(0));
				}*/
		/*Iterable<Long> num1=l;
		Iterable<Long> num2=m;
		HashMap<Long,Long> h=new HashMap<Long,Long>();
		for(int i=0;i<=10;i++){

			h.put(l.get(i), m.get(i));
		}
		Iterable obj1=h;*/
		ArrayList<number> a = new ArrayList();

		for (long i=0; i < 10; i++) {
			number n = new number();
			n.setId(i+1);
			n.setName("test"+i);
			a.add(n);
		}
		Iterable obj1=a;
		//mav.addObject("obj1", l);
		System.out.println(a.get(0));
		mav.addObject("obj1",a );
		mav.setViewName("test1");
		return mav;
	}
}