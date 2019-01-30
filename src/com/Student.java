package com;

import java.util.ArrayList;

public class Student {
private String name;
private int rollno;
private String course;
ArrayList <Student> al=new ArrayList<Student>();
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Student(String name, int rollno, String course) {
	this.name = name;
	this.rollno = rollno;
	this.course = course;
}
}
