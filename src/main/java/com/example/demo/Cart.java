package com.example.demo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="cart")

public class Cart {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column
private long id;

@Column(length=20, nullable=true)
private String name;


@Column(nullable=true)
private long num;

private static long sum;

private String hi;


public void setHi(Timestamp t) {
	SimpleDateFormat sf=new SimpleDateFormat("yyyy-mm-dd");
	String str=sf.format(t);
	this.hi=hi;

}


public String getHi() {

	return hi;
}


public static void setSum(long sum) {
	Cart.sum = sum;
}


public long getSum() {
	return sum;
}


public void setSum() {
	this.sum = this.sum+num;
}


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


public long getNum() {
	return num;
}


public void setNum(long num) {
	this.num = num;
}



}
