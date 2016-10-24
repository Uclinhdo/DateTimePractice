package practice;

/**
 * This class represents a person in the real world.
 * 
 * @author Linh Do, ldo@my.wctc.edu
 * @version 1.00
 */
public class Person {
    private String firstName;
    private String lastName;
    private int x; // the X-factor for this person.

    /**
     * Default constructor.
     */
    public Person() {
    }

    /**
     * Convenience constructor for quickly creating
     * and initializing an object.
     * 
     * @param firstName - not validated
     * @param lastName - not validated
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the last name of the person
     * @param lastName - not validated
     * @throws IllegalArgumentException if the last name is invalid.
     */
    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException();
        }else{
        this.lastName = lastName;
        }
    }
    
    
}
