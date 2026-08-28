package arrays;
import java.util.Scanner;
public class hackerranker1 {
    

    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                int x1=in.nextInt();
                int v1=in.nextInt();
                int x2=in.nextInt();
                int v2=in.nextInt();
                int x1count=0;
                int x2count=0;
                
                if(x2>x1 && v2>v1)
                {
                    System.out.print("NO");
                }
                else {
                    do {
                        x1+=v1;
                        x2+=v2;
                        
                        x1count+=1;
                        x2count+=1;
                    
                    }while(x1!=x2);
                }
                
                
                
                if(x1==x2 && x1count==x2count) {
                    System.out.println("YES");
                }
                
                
                
                
         }

}
