import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    Node()
    {
        
    }
    Node head=null,tail=null;
    void insertNode(Scanner in)
    {
        int n=in.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("enter the data"); 
        int data=in.nextInt();
        Node obj=new Node(data,null);
        if(head==null)
        {
            head=obj;
            tail=obj;
        }
        else{
            tail.next=obj;
            tail=obj;
        }
        }
        System.out.println("inserted"); 
    }
    
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            System.out.println(temp.next);
            temp=temp.next;
        }
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
        }
        else{
            Node temp=head;
            for(int i=0;i<pos-2;i++)
            {
                temp=temp.next;
            }
            if(temp.next==null)
            {
                tail=newNode;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        System.out.println("inserted"); 
    }
    
    void deleteNote(Scanner in)
    {
        System.out.println("enter the pos"); 
        int pos=in.nextInt();
        Node temp=head;
        Node prev=null;
        if(pos==1)
        {
            head=temp.next;
        }
        else
        {
          for(int i=0;i<pos-1;i++)
          {
            prev=temp;
            temp=temp.next;
          }
          prev.next=temp.next;
          if(prev.next==null)
          {
              tail=prev;
          }
          
        }
       System.out.println("deleted"); 
    }
    void displayReverse()
    {
        Node temp=tail;
        while(temp!=head)
        {
            System.out.println(temp.data);
            //System.out.println(temp.next);
            temp=temp.next;
        }
    }
}
public class Main
    {
        public static void main (String[] args) {
            Node in=new Node();
            Scanner s=new Scanner(System.in);
            while(true)
            {
                
                System.out.println("1.Insert a node");
                System.out.println("2.Insert a node in middle");
                System.out.println("3.delete a node");
                System.out.println("4.display");
                System.out.println("exit");
                int ch=s.nextInt();
                switch(ch)
                {
                  case 1:{
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
                    in.deleteNote(s);
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
