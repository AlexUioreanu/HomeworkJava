package TemaOOPAlexUio2;

public class Main {
    public static void main(String[] args) {

        //SamsungGalaxyS6
        Contact contact1 = new Contact(1, 11, "Vasile", "Pop");
        Contact contact2 = new Contact(2, 12, "Ion", "Pop");

        Phone firstPhone = new SamsungGalaxyS6("SamsungGalaxyS6", "Black", "Metal", 123123);
        firstPhone.turnOn();

        firstPhone.addContact(contact1);
        firstPhone.addContact(contact2);
        firstPhone.listContacts();

        firstPhone.sendMessage(11, "Nu mai bea Vasile");
        firstPhone.listMessages(11);

        firstPhone.sendMessage(12, "Hai acasa Ioane!");
        firstPhone.sendMessage(12, "Hai Ioane!");
        firstPhone.listMessages(12);

        firstPhone.call(11);
        firstPhone.call(12);
        firstPhone.call(12);
        firstPhone.callHistory();

        firstPhone.viewBattery();
        firstPhone.charge(10);
        firstPhone.viewBattery();

        firstPhone.turnOff();

        //SamsungGalaxyS21
        Contact contact3 = new Contact(1, 13, "Vasilica", "Pop");
        Contact contact4 = new Contact(2, 14, "Ioana", "Pop");

        Phone secondPhone = new SamsungGalaxyS21("SamsungGalaxyS21", "Blue", "Metal", 9573243);

        secondPhone.addContact(contact3);
        secondPhone.addContact(contact4);
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
        Contact contact5 = new Contact(1, 15, "Alex", "Pop");
        Contact contact6 = new Contact(2, 16, "Maria", "Pop");

        Phone thirdPhone = new IphoneX("IphoneX", "Brown", "Metal", 231124);
        thirdPhone.turnOn();

        thirdPhone.addContact(contact5);
        thirdPhone.addContact(contact6);
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
        Contact contact7 = new Contact(1, 17, "Alexandra", "Pop");
        Contact contact8 = new Contact(2, 18, "Marioara", "Pop");

        Phone fourthPhone = new Iphone12ProMax("Iphone12ProMax", "Pink", "Metal", 233211124);
        fourthPhone.turnOn();

        fourthPhone.addContact(contact7);
        fourthPhone.addContact(contact8);
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
