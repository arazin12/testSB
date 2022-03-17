package com.example.demo;

import java.util.ArrayList;

public class RadioData {

	private ArrayList<String> checks = new ArrayList<>();
	public RadioData() {
		checks.add("1");
		checks.add("2");
		checks.add("3");
	}

    public void setChecks(ArrayList<String> checks) {
        this.checks = checks;
    }

    public ArrayList<String> getChecks() {
        return checks;
    }
}