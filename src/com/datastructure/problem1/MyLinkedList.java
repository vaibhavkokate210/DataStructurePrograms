package com.datastructure.problem1;

public class MyLinkedList<K>
{
	private INode head;
	private INode tail;
	
	public MyLinkedList() {
		super();
		this.head = null;
	}
	
	public void add(INode myNode)
	{
		if(tail==null)
			tail=myNode;
		if(head==null)
			head=myNode;
		else
		{
			tail.setNext(myNode);
			tail=myNode;
		}
	}
	
	
	public boolean search(K find)
	{
		INode tempNode=head;
		int flag=0;
		while(tempNode!=null)
		{
			if(tempNode.getKey().equals(find))
			{
				return true;
			}
			tempNode=tempNode.getNext();
		}
	    return false;
	}
	
	
	public void delete(K delete)
	{
		INode tempNode1=head;
		INode tempNode2=head;
		while(!tempNode1.getKey().equals(delete))
		{
			tempNode2=tempNode1;
			tempNode1=tempNode1.getNext();
		}
		tempNode2.setNext(tempNode1.getNext());
		tempNode1.setNext(null);
	}
	
	public void print()
	{
		StringBuilder sb=new StringBuilder("List = ");
		INode tempNode=head;
		while(tempNode!= null)
		{
			sb.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				sb.append("->");
			tempNode=tempNode.getNext();
		}
		System.out.println(sb);
	}
	public StringBuilder myText()
	{
		StringBuilder sb=new StringBuilder("Text = ");
		INode tempNode=head;
		while(tempNode!= null)
		{
			sb.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				sb.append(" ");
			tempNode=tempNode.getNext();
		}
		return sb;
	}
	public String toString() {
        return "MyLinkedListNodes {"+ head + "}" ;
    }
}
