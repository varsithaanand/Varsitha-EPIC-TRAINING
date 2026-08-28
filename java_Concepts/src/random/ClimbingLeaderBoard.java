package random;
import java.util.Scanner;
public class ClimbingLeaderBoard {
public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int n1=in.nextInt();
    int[] ranked=new int[n1];
    int[] temp=new int[n1];
    int k=0;
    
    for(int i=0;i<n1;i++)
    {
        ranked[i]=in.nextInt();
    }
    
    int n2=in.nextInt();
    int[] player=new int[n2];
    for(int i=0;i<n2;i++)
    {
        player[i]=in.nextInt();
    }
    for(int i=0;i<n1;i++)
    {
        boolean duplicate=false;
       for(int j=0;j<k;j++)
       {
             if(ranked[i]==temp[j])
             {
                 duplicate=true;
                 break;
             }
      } 
      if(!duplicate)
      {
          temp[k]=ranked[i];
          k++;
      }
    }
    

    for (int i = 0; i < n2; i++) {
        boolean found = false;

        for (int j = 0; j < k; j++) {
            if (player[i] >= temp[j]) {
                System.out.println(j + 1);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(k + 1);
        }
    } 
    
}
}