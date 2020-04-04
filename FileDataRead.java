import java.io.*;
import java.util.*;
public class FileDataRead
{
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	Node head;
	public void insert(String data)
	{
		int data1=Integer.parseInt(data);
		Node node = new Node(data1);
		Node p=head;
		if(head==null)
		head = node;
		else{
			while(p.next!=null){
			p=p.next;
			}
			p.next=node;
		}
		
	}
	public void printall()
	{
		Node n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static void main(String ar[])
	{
		FileDataRead fr=null;
		BufferedReader br=null;
		String a;
		try{
			fr=new FileDataRead();
			br=new BufferedReader(new FileReader("data.txt"));
		while((a=br.readLine())!=null)
		{
			fr.insert(a);
			
		}
		br.close();
		fr.printall();
		}
		catch(Exception e){}
		
	}
		
		
}