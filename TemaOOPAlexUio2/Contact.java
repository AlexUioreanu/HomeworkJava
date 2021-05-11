package TemaOOPAlexUio2;

import org.apache.commons.lang3.ArrayUtils;

public class Contact {
    private int id;
    private int phoneNumber;
    private String firstName;
    private String lastName;
    private Message[] listmessage;
    private Call[] callHistory;

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
