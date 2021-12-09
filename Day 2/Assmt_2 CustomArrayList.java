package com.eg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class MyCustomArrayList<T> extends ArrayList<T>{
	 private static final long serialVersionUID = 1L;
	 
	 public MyCustomArrayList()
	 {
	 }
	 
	 private boolean addElement(T obj)
	 {
	  boolean added = false;
	int num_of_occurrences = Collections.frequency(this, obj);
	if(num_of_occurrences<2)
	  {
	   added = super.add(obj);
	  }
	  
	  return added;  
	 }
	 
	 
	 private boolean addElement(int index, T obj)
	 {
	  boolean added = false;
	  int num_of_occurrences = Collections.frequency(this, obj);
	if(num_of_occurrences<2)
	  {
	   super.add(index, obj);
	  }
	  
	  return added;    
	 }
	 
	 
	 
	 @Override
	 public boolean add(T obj)
	 {
	  return addElement(obj);
	 }
	 
	 @Override
	 public void add(int index, T obj)
	 {
	  addElement(obj);
	 }
	 
	 @Override
	 public boolean addAll(Collection<? extends T> coll)
	 {
	  boolean added_all_elements = true;
	  for(T element:coll)
	  {
	   added_all_elements = addElement(element);
	  }
	  
	  return added_all_elements;
	 }
	 
	 @Override
	 public boolean addAll(int index, Collection<? extends T> coll)
	 {
	  boolean added_all_elements = true;
	  for(T element:coll)
	  {
	   added_all_elements = addElement(index, element);
	  }
	  
	  return added_all_elements;
	 }
	 
	 
}


public class CustomArrayList {

	public static void main(String[] args) {
		  MyCustomArrayList<String> cArrayList = new MyCustomArrayList<String>();
		  cArrayList.add("abc");
		  cArrayList.add("abc");
		  cArrayList.add("abc");
		  cArrayList.add("abc");
		  
		  System.out.println(cArrayList);
		  

		 }
	
}
