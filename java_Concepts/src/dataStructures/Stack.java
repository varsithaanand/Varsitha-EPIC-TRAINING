import java.util.Scanner;
class StackImplementation{
    int n = 10;
    int[] stack = new int[n];
    int top = -1;
    //push
    public void push(Scanner in){
        System.out.println("Enter a value: ");
        int val = in.nextInt();
        if(top>=n-1){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top] = val;
        }
        
    }
    
    public void pop()
    {
        if(top!=-1)
        {
            int val=stack[top--];
            System.out.println(val);
        }
        else{
            System.out.println("Stack underflow");
        }
        
        
    }
    
    public void display()
    {
        
            for(int i=top;i>=0;i--)
            {
            System.out.println(stack[i]);
               
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
        int ans=stack[top];
        System.out.println(ans);
        }
        
    }
    
    public boolean isEmpty()
    {
        if(top==-1)
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
		StackImplementation in=new StackImplementation();
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
                    in.isEmpty();
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
