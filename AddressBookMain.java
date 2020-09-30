package com.bridgelabz.problem;
import java.util.LinkedList;
public class AddressBookMain{
	private LinkedList<ContactPerson> contactPersonList;
	public AddressBookMain(){
		  contactPersonList=new LinkedList<>();
	}
	private void addContactPerson(String firstName,String lastName,String address,String city,String state,String zip,double phoneNumber,String email){
	         ContactPerson contactPerson=new ContactPerson(firstName,lastName,address,city,state,zip,phoneNumber,email);
	         contactPersonList.add(contactPerson);   
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
        }
 }
