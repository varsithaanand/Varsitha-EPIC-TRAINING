package billing;
import java.util.Scanner;
import controller.CustomerController;
import service.CustomerService;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		CustomerService cc=new CustomerController();
		while(true)
		{
			System.out.println("Enter the choice ");
			int ch=in.nextInt();
			switch(ch)
			{
			case 1:{
				cc.createCustomer();
				break;
			}
			case 2:{
				cc.displayCustomer();
				break;
			}
			case 3:{
				cc.updateCustomer();
				break;
			}
			case 4:
			{
				cc.deleteCustomer();
				break;
			}
			}
		}
		

	}

}
