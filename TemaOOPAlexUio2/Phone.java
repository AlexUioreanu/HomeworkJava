package TemaOOPAlexUio2;

public interface Phone {
    void addContact(Contact contact);
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

