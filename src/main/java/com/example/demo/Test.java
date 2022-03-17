package com.example.demo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RadioData data=  new RadioData();
		ArrayList checks=data.getChecks();

		checks.add("1");
		checks.add("2");
		checks.add("3");
		for(Object check:checks) {
			System.out.println(check);
		}

	}

}
