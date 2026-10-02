import java.util.Scanner;
class QueueImplementation{
    int n=6;
    int[] queue = new int[n];
    int front=-1;
    int rear=-1;
    void enQueue(Scanner in){
        if((rear+1)%n==front){
            System.out.println("Queue Overflow");
        }
        else{
            if(front==-1){
                front=0;
            }
            System.out.println("Enter the value: ");
            
            queue[(++rear%n)] = in.nextInt();
            
        }
    
        
    }
    
    void deQueue(){
        if(front==-1){
            System.out.println("Queue Underflow");
        }
        else{
            System.out.println("Deleted data is: "+queue[front%n]);
            front++;//7
            if(front>rear){
                front=-1;
                rear=-1;
            }
        }
    }
    
    void displayQueue(){
        if(front==-1){
            System.out.println("Queue is empty");
        }
        else{
            // System.out.println("The Rear value is: "+rear);
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i%n]);
            }
           // System.out.println(queue[rear]);
        }
        
   
}


public class Main
{
	public static void main(String[] args) {
		QueueImplementation qi = new QueueImplementation();
		Scanner in = new Scanner(System.in);
		while(true){
		    System.out.println(" 1)EnQueue\n 2)DeQueue\n 3)DisplayQueue\n");
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
		            qi.displayQueue();
		            break;
		        }
		    }
		}
	}
}
