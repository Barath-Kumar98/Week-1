package com.p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//fnhdsfjsd;2334ds;bsdciudi;bdsiucdcsd;

//.*;

public class RegexEmail {
	public static void main(String[] args) {
		
		
		
		try
	      {
	    String str1 = "scjcnjsc@dsmma.com";
	    String str3 = "kaund@gmail.com";
	    String str2 = "djsdfddg";

	    FileOutputStream fos = new FileOutputStream("regex.txt");
	    DataOutputStream dos = new DataOutputStream(fos);

	    //fos.wri
	    dos.writeUTF(str1);
	    dos.writeUTF(str2);
	    dos.writeUTF(str3);

	    //any unwritten buffered data is written to destination(i..e file)
	    dos.flush();
	    
	    fos.close();
	    dos.close();
	    

	    FileInputStream fis = new FileInputStream("regex.txt");
	    DataInputStream dis = new DataInputStream(fis);
	    
	    List<String> list = new ArrayList<>();
	    String tempString = "";
	    for (int i =0; i<3; i++) {
//	    	tempString += dis.readUTF();
	    	list.add(dis.readUTF());
	    }
	    
	    
	    
	    //dis.readInt();//causes java.io.EOFException, 
	    //as we are reading beyond end of file
	 
	      dis.close();
	      fis.close();
		
		
		Pattern pt = Pattern.compile(".{0,}@.{0,}"); //number of email ids
		//one or more s


		int find_count = 0;

		
		for (String s: list) {
			Matcher mt = pt.matcher(s);  
			boolean b = mt.matches(); 
			
			if(b)
			{
				System.out.println(s);
				find_count++;
			}
		
		}
		System.out.println("Total number of occurrences:"+find_count);
		
	      }
	      catch(Exception et)
	      {
	          et.printStackTrace();
	      }
	}
}
