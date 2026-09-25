import java.util.Scanner;
class Customer
{
    int id=0;
    String cusName;
    String cusEmail;
    Node li;
    Customer(Node li)
    {
       this.li=li; 
    }
    Customer(int id,String name,String email)
    {
        this.id=id;
        this.cusName=name;
        this.cusEmail=email;
    }
    Scanner in=new Scanner(System.in);
    void createCustomer()
    {
        
        System.out.println("Enter the Customer Name ");
        String name=in.next();
        System.out.println("Enter the Customer Email ");
        String email=in.next();
         id++;
        Customer cus=new Customer(id,name,email);
        li.insertNode(in,cus);
        
        
    }
    void displayCustomer()
    {
        li.display();
    }
    void deleteCustomer()
    {
        li.deleteNote(in);
    }
}
class Node {
    Customer data;
    Node next;
    Node(Customer data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    Node()
    {
        
    }
    Node head=null,tail=null;
    void insertNode(Scanner in,Customer c)
    {
        
        Node obj=new Node(c,null);
        if(head==null)
        {
            head=obj;
            tail=obj;
        }
        else{
            tail.next=obj;
            tail=obj;
        }
         System.out.println("inserted"); 
        }
       
    
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println("Customer Id "+temp.data.id);
            System.out.println("Customer Name "+temp.data.cusName);
            System.out.println("Customer Email "+temp.data.cusEmail);
            temp=temp.next;
        }
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
    
}
    public class Main
    {
        public static void main (String[] args) 
        {
            Scanner s=new Scanner(System.in);
            Node in=new Node();
            Customer cus=new Customer(in);
            while(true)
            {
                
                System.out.println("1.Create Customer");
                System.out.println("2.Display Customer");
                System.out.println("3.Delete Customer");
                System.out.println("4.display");
                System.out.println("exit");
                int ch=s.nextInt();
                switch(ch)
                {
                  case 1:
                {
                    cus.createCustomer();
                    break;
                }  
                  case 2 :
                {
                    cus.displayCustomer();
                    break;
                }
                case 3 :
                {
                    cus.deleteCustomer();
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
