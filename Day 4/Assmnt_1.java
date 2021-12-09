package com.eg;


import java.sql.*;


public class AccountsEg {​​​​​​​​
    public static void main(String[] args) throws Exception {​​​​​​​​

    
    //*********************Day 4 Assigment 1******************
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection ct1 = DriverManager.getConnection("jdbc:mysql://localhost/tweets", "root", "orcl");
	Statement st1 = ct1.createStatement();
	ResultSet rs = st1.executeQuery("select * from tweet");

	
	while (rs.next()) {
	  int id = rs.getInt(1);
	  String name = rs.getString(2);
	  int likes = rs.getInt(3);
	
	
	  System.out.println(id + "\t" + name + "\t" + likes);
	}
    
	
    rs.close();
    st1.close();
    ct1.close();
	
    
    


    }​​​​​​​​
}​​​​​​​​
 











