package TemaOOPAlexUio2;

public class Main {
    public static void main(String[] args) {

        //SamsungGalaxyS6

        //creates the phone
        Phone firstPhone = new SamsungGalaxyS6("SamsungGalaxyS6", "Black", "Metal", 123123);
        // turns ON the phone
        firstPhone.turnOn();

        // adds contacts
        firstPhone.addContact(1, 11, "Vasile", "Pop");
        firstPhone.addContact(2, 12, "Ion", "Pop");
        //displays all the contacts from this phone
        firstPhone.listContacts();

        //sends a message to that phone number
        firstPhone.sendMessage(11, "Nu mai bea Vasile");
        // display all the messages from that specific phone number
        firstPhone.listMessages(11);

        //sends more messages
        firstPhone.sendMessage(12, "Hai acasa Ioane!");
        firstPhone.sendMessage(12, "Hai Ioane!");
        firstPhone.listMessages(12);

        //call that specific phone number
        firstPhone.call(11);
        firstPhone.call(12);
        firstPhone.call(12);
        //display all the calls history
        firstPhone.callHistory();

        //sees the battery level
        firstPhone.viewBattery();
        // charges the phone
        firstPhone.charge(10);
        firstPhone.viewBattery();

        //turns OFF the phone
        firstPhone.turnOff();

        //SamsungGalaxyS21
        Phone secondPhone = new SamsungGalaxyS21("SamsungGalaxyS21", "Blue", "Metal", 9573243);

        secondPhone.addContact(1, 13, "Vasilica", "Pop");
        secondPhone.addContact(2, 14, "Ioana", "Pop");
        secondPhone.listContacts();

        secondPhone.sendMessage(13, "Nu mai bea Vasilica");
        secondPhone.listMessages(13);

        secondPhone.sendMessage(14, "Hai acasa Ioana!");
        secondPhone.listMessages(14);

        secondPhone.call(13);
        secondPhone.callHistory();

        secondPhone.viewBattery();
        secondPhone.charge(2);
        secondPhone.viewBattery();

        //IphoneX
        Phone thirdPhone = new IphoneX("IphoneX", "Brown", "Metal", 231124);
        thirdPhone.turnOn();

        thirdPhone.addContact(1, 15, "Alex", "Pop");
        thirdPhone.addContact(2, 16, "Maria", "Pop");
        thirdPhone.listContacts();

        thirdPhone.sendMessage(15, "Nu mai bea Alex");
        thirdPhone.listMessages(15);

        thirdPhone.sendMessage(16, "Fa de mancare Maria ca viu acasa!");
        thirdPhone.listMessages(16);

        thirdPhone.call(15);
        thirdPhone.callHistory();

        thirdPhone.viewBattery();
        thirdPhone.charge(2);
        thirdPhone.viewBattery();

        thirdPhone.turnOff();

        //Iphone12ProMax
        Phone fourthPhone = new Iphone12ProMax("Iphone12ProMax", "Pink", "Metal", 233211124);
        fourthPhone.turnOn();

        fourthPhone.addContact(1, 17, "Alexandra", "Pop");
        fourthPhone.addContact(2, 18, "Marioara", "Pop");
        fourthPhone.listContacts();

        fourthPhone.sendMessage(17, "Da de mancare la animale Ale !");
        fourthPhone.listMessages(17);

        fourthPhone.sendMessage(18, "Fa de mancare Marioara ca viu acasa!");
        fourthPhone.listMessages(18);

        fourthPhone.call(17);
        fourthPhone.callHistory();

        fourthPhone.viewBattery();
        fourthPhone.charge(2);
        fourthPhone.viewBattery();

        fourthPhone.turnOff();
    }
}
