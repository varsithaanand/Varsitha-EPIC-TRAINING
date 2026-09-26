import java.util.Scanner;

class Node {
	Node prev;
	int data;
	Node next;


	Node(Node prev,int data,Node next) {
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	Node() {

	}
	Node head;
	Node tail;
	void insertNode(Scanner in)
	{
		System.out.println("Enter the number of data: ");
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			int val=in.nextInt();
			Node obj = new Node(null,val,null);
			if(head==null) {
				head=obj;
			}
			else {
				obj.prev=tail;
				tail.next=obj;
			}
			tail=obj;
		}
		System.out.print("Successfully inserted");
	}
	void insertMiddle(Scanner in)
	{
		System.out.println("Enter the data: ");
		int val= in.nextInt();
		System.out.println("Enter the pos: ");
		int pos= in.nextInt();
		Node obj=new Node(null,val,null);
		Node temp=head;
		if(pos==1)
		{
		    obj.next=temp;
		    head=obj;
		}
		else{
		    for(int i=0;i<pos-2;i++)
		    {
		        temp=temp.next;
		    }
		    if(temp.next==null)
		    {
		        tail=obj;
		        obj.prev=temp;
		        temp.next=obj;
		    }
		    else{
		    obj.next=temp.next;
		    obj.prev=temp;
		    obj.next.prev=obj;
		    temp.next=obj;
		    }
		    
		    
		}
		System.out.print("Successfully inserted");
	}
   
   void deleteNode(Scanner in)
	{
		System.out.println("Enter the pos: ");
		int pos = in.nextInt();
		Node extra=head;
		Node temp=head;
		if(pos==1)
		{
		    temp.next.prev=null;
		    head=temp.next;
		}
		else
		{
		    for(int i=0;i<pos-1;i++)
		    {
		        extra=temp;
		        temp=temp.next;
		    }
		   
		   if(temp.next==null)
		    {
		        extra.next=null;
		        tail=extra;
		    }
		    else{
		        extra.next=temp.next;
		        temp.next.prev=extra;
		   
		    }
		}
		
		
		System.out.print("Successfully deleted");
	}
	void displayReverse() {
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.prev;
		}

	}

	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}

	}

}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node in=new Node();
		while(true)
		{

			System.out.println("\n1.Insert a node");
			System.out.println("2.Insert a node in middle");
			System.out.println("3.delete a node");
			System.out.println("4.display");
			System.out.println("5.Reverse display");
			System.out.println("exit");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1: {
				in.insertNode(s);
				break;
			}
			case 2 :
			{
				in.insertMiddle(s);
				break;
			}
			case 3 :
			{
				in.deleteNode(s);
				break;
			}
			case 4 :
			{
				in.display();
				break;
			}
			case 5:
			{
				in.displayReverse();
				break;
			}
			default :
			{
				return;
			}
			}
		}

	}

}
