import java.util.Scanner;

class Node {
	int data;
	Node next;


	Node(int data,Node next) {
		this.data = data;
		this.next = next;
	}
	Node() {

	}
	Node head=null;
	Node tail=null;
	void insertNode(Scanner in)
	{
		System.out.println("Enter the number of data: ");
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			int val=in.nextInt();
			Node obj = new Node(val,null);
			if(head==null) {
				head=obj;
			}
			else {
				tail.next=obj;
			}
			tail=obj;
			obj.next=head;
		}
		System.out.print("Successfully inserted");
	}
	
   
  

	void display()
	{
		Node temp=head;
		do{
		    System.out.println(temp.data);
		    temp=temp.next;
		}
		while(temp!=head);

	}
	
	void insertMiddle(Scanner in)
    {
        System.out.println("enter the data"); 
        int data=in.nextInt();
        System.out.println("enter the pos"); 
        int pos=in.nextInt();
        Node newNode=new Node(data,null);
        if(pos==1)
        {
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }
        else
        {
            Node temp=head;
            for(int i=0;i<pos-2;i++)
            {
                temp=temp.next;
            }
            if(temp.next==head)
            {
                tail.next=newNode;
                tail=newNode;
                newNode.next=head;
            }
            else{
               newNode.next=temp.next;
               temp.next=newNode; 
            }
            
        }
        
        
        System.out.println("inserted"); 
    }
    
    void deleteNode(Scanner in)
    {
        System.out.println("enter the pos"); 
        int pos=in.nextInt();
        if(pos==1)
        {
            head=head.next;
            tail.next=head;
        }
        else
        {
            Node temp=head;
            Node prev=head;
            for(int i=0;i<pos-1;i++)
            {
                prev=temp;
                temp=temp.next;
            }
            if(temp.next==head)
            {
                prev.next=head;
            }
            else{
               prev.next=temp.next;
            }
            
            
        }
        
        
        System.out.println("Deleted"); 
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
                System.out.println("exit");
                int ch=s.nextInt();
                switch(ch)
                {
                case 1:
                {
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
                default :
                {
                      return;
                }
                
                }
            }
        
	}

}
