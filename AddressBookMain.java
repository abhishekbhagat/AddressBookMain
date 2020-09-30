package com.bridgelabz.problem;
import com.bridgelabz.problem.ContactPerson;
import java.util.LinkedList;
import java.util.Scanner;
public class AddressBookMain{
	  private LinkedList<ContactPerson> contactPersonList;
	  public AddressBookMain()
	  {
		  contactPersonList=new LinkedList<>();
	  }
	  
	  private void addContactPerson(String firstName,String lastName,String address,String city,String state,String zip,double phoneNumber,String email){
	         ContactPerson contactPerson=new ContactPerson(firstName,lastName,address,city,state,zip,phoneNumber,email);
	         contactPersonList.add(contactPerson);   
	  }
	  private void editContactPerson(){
		  System.out.println("Enter the First Name of a person you want to delete");
		  Scanner sc =new Scanner(System.in);
		  String firstName=sc.next();
		  System.out.println("Enter the Last Name of a person you want to delete");
		  String lastName=sc.next();
		  for(ContactPerson contactPerson: contactPersonList) {
			  if(contactPerson.getFirstName().equals(firstName)&&contactPerson.getLastName().equals(lastName)){
				  
			  }
			  
		  }
	  }
	  private void deleteContactPerson(){
		  System.out.println("Enter the First Name of a person you want to delete");
		  Scanner sc =new Scanner(System.in);
		  String firstName=sc.next();
		  System.out.println("Enter the Last Name of a person you want to delete");
		  String lastName=sc.next();
		  for(ContactPerson contactPerson:contactPersonList){
			  if(contactPerson.getFirstName().equals(firstName)&&contactPerson.getLastName().equals(lastName)){
				  contactPersonList.remove(contactPerson);
			  }
		  }
	  }
          public static void main(String[] args) {
	         System.out.println("Welcome to Address Book Program");
	         AddressBookMain addressBookMain =new AddressBookMain();
	         Scanner sc =new Scanner(System.in);
	         System.out.println("Enter the First Name ");
	         String firstName=sc.next();
	         System.out.println("Enter the last Name ");
	         String lastName=sc.next();
	         System.out.println("Enter the address ");
	         String address=sc.next();
	         System.out.println("Enter the  city ");
	         String city=sc.next();
	         System.out.println("Enter the state ");
	         String state=sc.next();
	         System.out.println("Enter the zip ");
	         String zip=sc.next();
	         System.out.println("Enter the phoneNumber ");
	         double phoneNumber=sc.nextDouble();
	         System.out.println("Enter the email ");
	         String email=sc.next();
	         addressBookMain.addContactPerson(firstName,lastName ,address,city,state,zip, phoneNumber,email);
	         addressBookMain.editContactPerson();
	         addressBookMain.deleteContactPerson();
           }
}
