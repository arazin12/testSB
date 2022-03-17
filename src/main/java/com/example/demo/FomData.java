/*package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="fomData")

public class FomData {

	private List<String> checks = new ArrayList<>();
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column
private long id;

@Column(length=20, nullable=true)
private String name;

@Column(nullable=true)
private String sei;

@Column(nullable=true)
private String check;

@Column(nullable=true)
private long select1;

@Column(nullable=true)
private String select2;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSei() {
	return sei;
}

public void setSei(String sei) {
	this.sei = sei;
}

public long getSelect1() {
	return select1;
}

public void setSelect1(String select1) {
	this.select1 = Long.parseLong(select1);
}

public String getSelect2() {
	return select2;
}

public void setSelect2(String select2) {
	this.select2 = select2;
}

private List<String> features;
public List<String> getFeatures() {
    return features;
}

public void setFeatures(List<String> features) {
    this.features = features;
}


public List<String> getChecks() {
    return checks;
}
public void setChecks(List<String> checks) {
    this.checks = checks;
}

public String getCheck() {
	return check;
}

public void setCheck(String check) {
	this.check = check;
}

}
*/