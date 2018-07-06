package com.core.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* Vector<String> v=new Vector<String>();
  v.addElement("lavanya");
  v.addElement("lavanya");
  v.addElement("prasanna");
  v.addElement("rishitha");
  String a[]=new String[v.size()];
  v.copyInto(a);
  System.out.println(v);
  
 //System.out.println(a);
  for(String m:a)
  {
	  System.out.println(m);
  }*/
		List<String>li=new ArrayList<String>();
	//	li.add("anantha");
		li.add("varam");
		li.add("srinu");
		li.add("lav");
		li.add("prassu");
		li.contains("lav");
		ArrayList<String> al=new ArrayList<String>();
		al.add("anantha");
		al.add("bhanu");
		//li.addAll(al);
		//al.clear();
		
		//System.out.println(li);
		
		/*ArrayList<String>l=(ArrayList<String>) ((ArrayList<String>) li).clone();
		System.out.println(l);
		System.out.println(li);*/
		
		/*Iterator<String>i=li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
	}

}
