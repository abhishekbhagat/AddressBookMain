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
        private void editContactPersonName(String firstName,String lastName){
		  for(ContactPerson contactPerson: contactPersonList) {
			  if(contactPerson.getFirstName().equals(firstName)&&contactPerson.getLastName().equals(lastName))
			  {
				  
			  }
			  
		  }
	  }
        public static void main(String[] args) {
	     AddressBookMain addressBookMain =new AddressBookMain();
	     addressBookMain.addContactPerson("ABHISHEK","BHAGAT", "DHANBAD,JHARKHAND","KATRASGARH","JHARKHAND","828113",7201563452,"abhishekbhagatrw@gmail.com");
    }
}
