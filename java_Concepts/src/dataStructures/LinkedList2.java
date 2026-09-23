package dataStructures;
import java.util.Scanner;
class Node1
{
	int data;
	Node1 address;
	Node1(int data,Node1 address)
	{
		this.data=data;
		this.address=address;
	}
	Node1()
	{
		
	}
	Node1 head=null,prev=null;
	void insert(Scanner in)
	{
		System.out.println("Enter the no of values to enter");
		int n=in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			//System.out.println("Enter the no");
			int data=in.nextInt();
			Node1 obj=new Node1(data,null);
			if(head==null)
			{
				head=obj;
				prev=obj;
				
			}
			else
			{
				prev.address=obj;
				prev=obj;
			}
			
		}
	}
	
	void display()
	{
		Node1 temp=head;
		while(temp!=null)
		{
		    System.out.println(temp.data);
		    System.out.println(temp.address);
		    temp=temp.address;
		}
	}
	void insertANode(Scanner in){
        System.out.println("Enter the value: ");
        int val = in.nextInt();//55
        System.out.println("Enter the position: ");
        int pos = in.nextInt();//4
        
        Node1 newNode = new Node1(val,null);//8000
        if(pos==1){
            newNode.address = head;
            head = newNode;
        }
        else{
        Node1 temp = head;//1000
        
        for(int i=0;i<pos-2;i++){
            temp=temp.address;
        }
        if(temp.address==null)
        {
        	prev=newNode;
        }
        newNode.address = temp.address;
        temp.address = newNode;
        }
        
    }
		
	}

public class LinkedList2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Node1 n=new Node1();
		n.insert(in);
		n.display();
        n.insertANode(in);
        n.display();
	}

}
