package TemaOOPAlexUio2;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Class that has specific properties, contains the list of contacts, extends a general class(Iphone) and implements the Phone methods
 */
public class SamsungGalaxyS6 extends Samsung {
    final private int IMEI;
    private Contact[] listContacts;

    /**
     * Contructor that contains even the list of the contacts
     *
     * @param name     contains the name of the phone
     * @param color    contains the color of the phone
     * @param material contains the material of the phone
     * @param imei     contains the imei of the phone
     */
    public SamsungGalaxyS6(String name, String color, String material, int imei) {
        super(name, color, material);
        this.IMEI = imei;
        listContacts = new Contact[0];
    }

    /**
     * Method that adds a contact in a list
     *
     * @param id          contains the id of the contact
     * @param phoneNumber contains the phone number of the contact
     * @param firstName   contains the first name of the contact
     * @param lastName    contains the last name of the contact
     */
    @Override
    public void addContact(int id, int phoneNumber, String firstName, String lastName) {
        if (isOn() == true) {
            if (getBatteryLife() > 0) {
                Contact contact = new Contact(id, phoneNumber, firstName, lastName);
                listContacts = ArrayUtils.add(listContacts, contact);
            } else {
                System.out.println("You must to charge your " + getName());
            }
        } else {
            System.out.println("You can't add Contacts if your  " + getName() + " is OFF. Turn it ON! ");
        }
    }

    /**
     * Method that display the list of contacts
     */
    @Override
    public void listContacts() {
        if (isOn() == true) {
            if (getBatteryLife() > 0) {
                for (Contact contact : listContacts) {
                    System.out.println(contact.getFirstName());
                }
            } else {
                System.out.println("You must to charge your " + getName());
            }
        } else {
            System.out.println("You can't list Contacts if your " + getName() + " is OFF. Turn it ON! ");
        }
    }

    /**
     * Method that adds a message to a specific number in the list
     *
     * @param phoneNumber contains the phone number that you write
     * @param msg         contains the meesage that you add in the list to that specific phone number
     */
    @Override
    public void sendMessage(int phoneNumber, String msg) {
        if (isOn() == true) {
            if (getBatteryLife() > 0) {
                if (msg.length() < 500) {
                    for (Contact contact : listContacts) {
                        if (phoneNumber == contact.getPhoneNumber()) {
                            Message message = new Message(msg);
                            contact.setListmessage(message);
                            setBatteryLife(getBatteryLife() - 1);
                        }
                    }
                }
            } else {
                System.out.println("You must to charge your " + getName());
            }
        } else {
            System.out.println("You can't send message if your " + getName() + " is OFF. Turn it ON! ");
        }
    }

    /**
     * Method that  display the list of message from a specific phone number
     *
     * @param phoneNumber contains that phone number that you add
     */
    @Override
    public void listMessages(int phoneNumber) {
        if (isOn() == true) {
            if (getBatteryLife() > 0) {
                for (Contact contact : listContacts) {
                    if (contact.getPhoneNumber() == phoneNumber) {
                        for (Message message : contact.getListmessage()) {
                            System.out.println("The phone number is: " + contact.getPhoneNumber() + " - " + message.getMessage());
                        }
                    }
                }
            } else {
                System.out.println("You must to charge your " + getName());
            }
        } else {
            System.out.println("You can't list Messages if your " + getName() + " is OFF. Turn it ON! ");
        }
    }

    /**
     * Method that calls a specific number from a list of contacts
     *
     * @param phoneNumber contain the phone number
     */
    @Override
    public void call(int phoneNumber) {
        if (isOn() == true) {
            if (getBatteryLife() > 0) {
                for (Contact contact : listContacts) {
                    if (contact.getPhoneNumber() == phoneNumber) {
                        Call call = new Call(phoneNumber);
                        contact.setCallHistory(call);
                        System.out.println("It's calling the number: " + call.getPhoneNumber());
                        setBatteryLife(getBatteryLife() - 2);
                    }
                }
            } else {
                System.out.println("You must to charge your " + getName());
            }
        } else {
            System.out.println("You can't call if your " + getName() + " is OFF. Turn it ON! ");
        }
    }

    /**
     * Method that displays the list of calls
     */
    @Override
    public void callHistory() {
        if (isOn() == true) {
            if (getBatteryLife() > 0) {
                for (Contact contact : listContacts) {
                    for (Call call : contact.getCallHistory()) {
                        System.out.println("Phone number: " + call.getPhoneNumber());
                    }
                }
            } else {
                System.out.println("You must to charge your " + getName());
            }
        } else {
            System.out.println("You can't see your call History if your " + getName() + " is OFF. Turn it ON! ");
        }
    }

    /**
     * Method that displays the battery
     */
    @Override
    public void viewBattery() {
        if (isOn() == true) {
            if (getBatteryLife() > 0) {
                System.out.println("You battery level is: " + getBatteryLife());
            } else {
                System.out.println("You must to charge your " + getName());
            }
        } else {
            System.out.println("You can't see your battery level if your " + getName() + " is OFF. Turn it ON! ");
        }
    }

    /**
     * Method that charges the phone in hours
     *
     * @param chargedHours contains the number of hours
     */
    @Override
    public void charge(int chargedHours) {
        if (getBatteryLife() <= 10 && getBatteryLife() >= 0) {
            if (chargedHours + getBatteryLife() <= 10) {
                setBatteryLife(getBatteryLife() + chargedHours);
                System.out.println("You charge your battery: " + chargedHours + " hours");
            } else {
                System.out.println("You overcharge!");
            }
        }
    }

    /**
     * Method that turns on the phone, without which it cannot work
     */
    @Override
    public void turnOn() {
        if (getBatteryLife() > 0) {
            setOn(true);
            System.out.println("You turn your " + getName() + " ON ! :D");
        } else {
            System.out.println("Charge your " + getName() + " if you want to turn it ON !");
        }
    }

    /**
     * Method that turns off the phone, which disables all the functions
     */
    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("You turn your " + getName() + " OFF !");
    }
}
