import java.util.Scanner;

class Node{
    int data;
    Node prev,next;
    
    public Node(Node prev,int data,Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    Node()
    {
        
    }
    
    Node head=null,tail=null;
    public void insertNode(Scanner in){
        System.out.println("Enter the no of data: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the val: ");
            int val = in.nextInt();
            Node obj = new Node(null,val,null);
            if(head==null)
            {
               head=obj;
               
            }
            else{
                tail.next=obj;
                obj.prev=tail;
               
            }
            tail=obj;
            head.prev=obj;
            obj.next=head;
        }
    }
    
    void display(){
        Node temp = head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=head);
    }
    
    
    void displayReverse()
    {
        Node temp = tail;
        do{
            System.out.println(temp.data);
            temp=temp.prev;
        }while(temp!=tail);
    }
    
    void insertMiddle(Scanner in)
    {
        System.out.println("enter the data"); 
        int data=in.nextInt();
        System.out.println("enter the pos"); 
        int pos=in.nextInt();
        Node newNode=new Node(null,data,null);
        if(pos==1)
        {
            newNode.prev=head.prev;
            newNode.next=head;
            head.prev=newNode;
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
                newNode.prev=tail;
                tail.next=newNode;
                tail=newNode;
                head.prev=tail;
                newNode.next=head;
            }
            else{
               newNode.next=temp.next;
               newNode.prev=temp;
               temp.next.prev=newNode;
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
            head.prev=tail;
            tail.next=head;
        }
        else
        {
            Node temp=head;
            Node extra=head;
            for(int i=0;i<pos-1;i++)
            {
                extra=temp;
                temp=temp.next;
            }
            if(temp.next==head)
            {
                extra.next=head;
                head.prev=extra;
                tail=extra;
            }
            else{
               extra.next=temp.next;
               temp.next.prev=temp.prev;
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
				System.out.println("5.display reverse");
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
                case 5 :
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
