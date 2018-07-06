package com.core.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("lavanya");
		list.add("prasanna");
		list.add("rishitha");
		list.add("naresh");
		list.add("naresh");
		list.add("lavanya");
		list.add("navven");
		list.add("prasanna");
		System.out.println(list);
		
		/*Collections.sort(list);
		//System.out.println(list);
		
		Object[] a=list.toArray();
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
			//System.out.println(a[0]);
		}*/
	/*	Iterator<String> i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/

	}

}
