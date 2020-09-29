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
	     AddressBookMain addressBookMain =new AddressBookMain();
	     addressBookMain.addContactPerson("ABHISHEK","BHAGAT", "DHANBAD,JHARKHAND","KATRASGARH","JHARKHAND","828113",720156345,"abhishekbhagatrw@gmail.com");
    }
}
