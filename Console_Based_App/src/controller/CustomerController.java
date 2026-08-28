package controller;
import java.util.*;
import model.CustomerModel;
import service.CustomerService;
public class CustomerController implements CustomerService{
int id=0;	
ArrayList<CustomerModel> cusArray=new ArrayList<>(); //dynamic adding and import util.ArrayList 

 public void createCustomer()
 {
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter the name");
	 String name=in.nextLine();
	 System.out.println("Enter the age");
	 int age=in.nextInt();
	 CustomerModel cm=new CustomerModel(id,name,age);
	 cusArray.add(cm);
	 System.out.println("Customer added sucessfully");
	 id++;
 }
 
 public void displayCustomer()
 {
	 for(CustomerModel x:cusArray) {
		 
			 System.out.println(x.getCusid()); 
		     System.out.println(x.getName());
		     System.out.println(x.getAge());
		 
	 }
 }
 
 
 public void updateCustomer()
 {
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter the choice 1.Change Name \n 2.Change age");
	 int ch=in.nextInt();
	 System.out.println("Enter the customer id ");
	 int id=in.nextInt();
	 switch(ch)
	 {
	 case 1:
	 {
		 System.out.println("Enter the name to change ");
		 in.nextLine();
		 String name=in.nextLine();
		 cusArray.get(id).setName(name);
		 System.out.println("Name changed successfully"); 
		 break;
	 }
	 case 2:
	 {
		 System.out.println("Enter the age to change ");
		 int age=in.nextInt();
		 cusArray.get(id).setAge(age);
		 System.out.println("age changed successfully"); 
		 break;
	 }
	 case 3:
	 {
		 return;
	 }
	 }
	 
	 
 }
 
 public void deleteCustomer()
 {
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter the customer id");
	 int id=in.nextInt();
	 int index=0;
	 for(CustomerModel cus:cusArray)
	 {
		 if(cus.getCusid()==id)
		 {
			 cusArray.remove(index);
			 System.out.println("Customer removed successfully");
			 break;
		 }
		 index++;
	 }
 }
 
}
