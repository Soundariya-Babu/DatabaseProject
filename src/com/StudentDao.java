package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {
	public void insertStudent(ArrayList<Student> s)
	{
		Connection con=null;
		PreparedStatement ps=null;
	for(int i=0;i<s.size();i++) {
		try
		{
			
			con=DbUtil.getConnection();
		
			ps=con.prepareStatement("insert into Student values(?,?,?)");
			
	    	ps.setString(1, s.get(i).getName());
			ps.setInt(2, s.get(i).getRollno());
			ps.setString(3, s.get(i).getCourse());
			
			int rows = ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("error in inserting");
			}
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbUtil.closeConnection(con);
		}
		}
	}
	
    public void UpdateStudent(String course,int rollno)
	{
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			con=DbUtil.getConnection();
			ps=con.prepareStatement("update Student set course=? where rollno=?");
			ps.setString(1, course);
			ps.setInt(2, rollno);
			
			int rows = ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("Updated");
			}
			else
			{
				System.out.println("error");
			}
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		finally
		{
			DbUtil.closeConnection(con);
			}
		}

    public void DeleteStudent(int rollno)
	{
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			con=DbUtil.getConnection();
			ps=con.prepareStatement("delete from Student where rollno=?");
			
			ps.setInt(1, rollno);
			
			int rows = ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("deleted");
			}
			else
			{
				System.out.println("error");
			}
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		finally
		{
			DbUtil.closeConnection(con);
			}
		}
	public ArrayList <Student> selectStudent()
	{
		Connection con=null;
		PreparedStatement ps=null;
		ArrayList<Student> students= new ArrayList<Student>();
		try
		{
			con=DbUtil.getConnection();
			ps=con.prepareStatement("select * from Student");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				String name=rs.getString(1);
				int roll=rs.getInt(2);
				String dept=rs.getString(3);
				
				Student st= new Student(name,roll,dept);
				students.add(st);
				
			}
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		finally
		{
			DbUtil.closeConnection(con);
		}
		return students;
	}
	/*public void insertStudent1(Student s)
	{
		Connection con=null;
		PreparedStatement ps=null;
	
		try
		{
			
			con=DbUtil.getConnection();
		
			ps=con.prepareStatement("insert into Student values(?,?,?,?)");
			
	    	ps.setString(1, s.getName());
			ps.setInt(2,s.getRollno());
			ps.setString(3,s.getCourse());
			ps.setBlob(4, "C:\\Users\\Revature1\\Desktop\\image1.png");
			
			int rows = ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("error in inserting");
			}
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbUtil.closeConnection(con);
		}
		
	}*/

}
