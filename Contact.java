package TemaOOPAlexUio2;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Class that contains the the contact with the list of messages and calls
 */
public class Contact {
    private int id;
    private int phoneNumber;
    private String firstName;
    private String lastName;
    private Message[] listmessage;
    private Call[] callHistory;

    /**
     * Constructor that contains even the list of messages and calls
     * @param id contains the id of the contact
     * @param phoneNumber contains the phone number of the contact
     * @param firstName contains the first name of the contact
     * @param lastName contains the last name of the contact
     */
    public Contact(int id, int phoneNumber, String firstName, String lastName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        listmessage = new Message[0];
        callHistory = new Call[0];
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public Message[] getListmessage() {
        return listmessage;
    }

    public void setListmessage(Message message) {
        listmessage = ArrayUtils.add(listmessage, message);
    }

    public Call[] getCallHistory() {
        return callHistory;
    }

    public void setCallHistory(Call call) {
        callHistory = ArrayUtils.add(callHistory, call);
    }
}
