package TemaOOPAlexUio2;

/**
 * Class that contains the call number
 */
public class Call {
    private int phoneNumber;
    
    /**
     * Contructor
     * @param phoneNumber the number that a contact has
     */
    public Call(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
