package TemaOOPAlexUio2;

public interface Phone {
    /**
     * Interface that contains all the phone behaviors
     *
     * @param id          contains the id of the contact
     * @param phoneNumber contains the phone number of the contact
     * @param firstName   contains the first name of the contact
     * @param lastName    contains the last name of the contact
     */
    void addContact(int id, int phoneNumber, String firstName, String lastName);
    void listContacts();
    void sendMessage(int phoneNumber, String msg);
    void listMessages(int phoneNumber);
    void call(int phoneNumber);
    void callHistory();
    //In plus
    void viewBattery();
    void charge(int chargedHours);
    void turnOn();
    void turnOff();
}

