/*
* Name: Paolo Tous      -- ID: 101325245
* Name: Yukina Ishiguro -- ID: 101274311
* Name: Satabdi Sangma  -- ID: 101287632

 */
package comp2130_assignment2;


public class ContactManager {
    
    private int numContacts;
    private int maxContacts;
    private Contact[] contactList;
    
    
    public ContactManager(int maxContacts){
        numContacts = 0;
        this.maxContacts = maxContacts;
        contactList = new Contact[maxContacts];
        
    }
    
    public boolean addContact(String firstName, String lastName, String homePhone, String workPhone, Address homeAddress,
    String email, MyDate birthday, String notes){
        
        if(numContacts < maxContacts){
            contactList[numContacts] = new Contact(firstName, lastName, homePhone, workPhone, homeAddress, email, birthday, notes);
            numContacts++;
            return true;
        }
        
        return false;
    }
    
    public Contact[] getContacts(){
        return contactList;
    }
    
    public int getNumContacts(){
        return numContacts;
    }
    
    public Contact findContact(String firstN, String lastN){
        for(int i = 0; i < numContacts; i++){
            if(firstN.equals(contactList[i].getFirstName()) && lastN.equals(contactList[i].getLastName())){
                return contactList[i];
            }
        }
        
        return null;
    }
   
   
}
