import java.util.Scanner;
class Node
{
    
    int data;
    Node next;
    Node top=null;
    
    Node(int data ,Node next)
    {
        this.data=data;
        this.next=next;
    }
    Node()
    {
        
    }
    
    void push(Scanner in)
    {
       System.out.println("Enter the data: ");
       int data=in.nextInt();
       Node obj=new Node(data,top);
       top=obj;
       
    }
    
    public void pop()
    {
        if(top!=null)
        {
            int val=top.data;
            top=top.next;
            System.out.println(val);
        }
        else{
            System.out.println("Stack underflow");
        }
    }
    void display()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
    
    public void top()
    {
        if(isEmpty())
        {
            System.out.println(" Stack is underflow ");
        }
        else
        {
        int ans=top.data;
        System.out.println(ans);
        }
        
    }
    
    public boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        return false;
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
                System.out.println("2.Peak value");
                System.out.println("3.delete a node");
                System.out.println("4.display");
                System.out.println("5.Empty");
                System.out.println("exit");
                int ch=s.nextInt();
                switch(ch)
                {
                case 1:
                {
                    in.push(s);
                    break;
                }  
                case 2 :
                {
                    in.top();
                    break;
                }
                case 3 :
                {
                    in.pop();
                    break;
                }
                case 4 :
                {
                    in.display();
                    break;
                }
                case 5 :
                {
                    System.out.println(in.isEmpty());
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

