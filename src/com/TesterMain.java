package com;

import java.util.ArrayList;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class TesterMain {
	
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
	//	Student s=new Student[3];
	/*	File f=new File("C:\\Users\\Revature1\\Desktop\\image1.png");
		if(f.exists())
		{
			System.out.println("The file exists");
		}
		else
		{
			System.out.println("File doesn't exists");
		}*/
		
		
		ArrayList <Student> al=new ArrayList <Student>();
		Student s1=new Student("d",126,"ehr");
		Student s2=new Student("be",127,"ewu");
		Student s3=new Student("c",128,"htr");
	
    	al.add(s1);
		al.add(s2);
		al.add(s3);
	//s1.addStudent(s);
		StudentDao sd=new StudentDao();
		sd.insertStudent(al);
		//sd.insertStudent(s2);
	//sd.insertStudent(s3);
		
		//sd.UpdateStudent("abc", 128);
		//Student s4=new Student("d",126,"rtug");
		//Student s5=new Student("e",127,"jhr");
	//	sd.insertStudent(s4);
		//sd.insertStudent(s5);
		//sd.DeleteStudent(124);
		List<Student> students=sd.selectStudent();
		for(Student i:students)
		{
		System.out.println("Name : "+i.getName()+" Roll No : "+i.getRollno()+" course : "+i.getCourse());;

		}
	}
}

//}
