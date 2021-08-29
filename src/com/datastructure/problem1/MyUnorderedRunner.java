package com.datastructure.problem1;

import java.util.Scanner;

public class MyUnorderedRunner
{
	public static void main(String[] args) 
	{
		String text="Do it till you get it";
		MyLinkedList list=new MyLinkedList();
		String []word=text.split(" ");
		for(String str:word)
		{
			MyNode<String> node=new MyNode<>(str);
			list.add(node);
		}
		System.out.println(list.myText());
		System.out.println("Enter word tobe searched : ");
		Scanner sc=new Scanner(System.in);
		String search=sc.nextLine();
		if(list.search(search))
		{
			list.delete(search);
		}
		else
		{
			MyNode<String> node=new MyNode<>(search);
			list.add(node);
		}
		System.out.println(list.myText());
	}

}
