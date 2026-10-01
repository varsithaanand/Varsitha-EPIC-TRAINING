import java.util.Scanner;
class QueueImplementation{
    int n=6;
    int[] queue = new int[n];
    int front=-1;
    int rear=-1;
    void enQueue(Scanner in){
        if(rear==n-1){
            System.out.println("Queue Overflow");
        }
        else{
            if(front==-1){
                front=0;
            }
            System.out.println("Enter the value: ");
            queue[++rear] = in.nextInt();
        }
        
    }
    
    void deQueue(){
        if(front==-1){
            System.out.println("Queue Underflow");
        }
        else{
            System.out.println(queue[front]);
            front++;
             if(front>rear)
            {
            front=rear=-1;
            }
        }
        
    }
    
    void display()
    {
        if(front==-1){
            System.out.println("Queue Underflow");
        }
        else
        {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
        }
    }
}


public class Main
{
	public static void main(String[] args) {
		QueueImplementation qi = new QueueImplementation();
		Scanner in = new Scanner(System.in);
		while(true){
		    System.out.println("1)EnQueue\n2)Dequeue\n3)Display");
		    switch(in.nextInt()){
		        case 1:{
		            qi.enQueue(in);
		            break;
		        }
		        case 2:{
		            qi.deQueue();
		            break;
		        }
		        case 3:{
		            qi.display();
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
