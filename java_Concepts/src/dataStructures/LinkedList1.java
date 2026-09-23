package dataStructures;
import java.util.Scanner;
class Node
{
	int data;
	Node address;
	
	Node(int data,Node address)
	{
		this.data=data;
		this.address=address;
	}
	Node head=null,prev=null;
	Node()
	{
		
	}
	void insert(Scanner in)
	{
		
		System.out.println("Enter the no of Data: ");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			int val=in.nextInt();
			Node obj =new Node(val,null);
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
		Node temp=head;
		while(temp!=null)
		{
		    System.out.println(temp.data);
		    System.out.println(temp.address);
		    temp=temp.address;
		}
	}
	
	void insertANode(Scanner in){
        System.out.println("Enter the position");
        int n = in.nextInt();//2
        System.out.println("Enter the value: ");
        int val = in.nextInt();//55
        Node newNode = new Node(val,null);
        Node temp = head;//1000
        for(int i=0;i<n-2;i++){
            temp=temp.address;
        }
        newNode.address = temp.address;
        temp.address = newNode;
    }
    
}
public class LinkedList1 {

	public static void main(String[] args) {
		
    Scanner in=new Scanner(System.in);
    Node n=new Node();
    n.insert(in);
	n.display();
	n.insertANode(in);
	n.display();
	}

}
