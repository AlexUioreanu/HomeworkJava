package TemaOOPAlexUio2;

/**
 * Class that contains the call number
 */
public class Call {
    private long phoneNumber;
    
    /**
     * Contructor
     * @param phoneNumber the number that a contact has
     */
    public Call(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
