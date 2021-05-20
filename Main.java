package TemaObjContainersAlexUio;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lista dupa varsta:");
        afisare(initializareListaDupaVarsta());

        System.out.println("Lista dupa nume:");
        afisare(initializareListaDupaNume());

        Persoana persoana1 = new Angajat("Alex", 82);
        persoana1.setHobbyList(initializareHobbyuri1());

        Persoana persoana2 = new Angajat("Vasile", 22);
        persoana2.setHobbyList(initializareHobbyuri2());

        Map<Persoana, List<Hobby>> listMap = new HashMap<>();
        listMap.put(persoana1, persoana1.getHobbyList());
        listMap.put(persoana2, persoana2.getHobbyList());

        afisareHobbyuriPersDinMap(persoana1, listMap);
    }


    private static void afisareHobbyuriPersDinMap(Persoana persoana, Map<Persoana, List<Hobby>> listMap) {
        System.out.println("Nume persoana: " + persoana.getName());
        for (Persoana persoana1 : listMap.keySet()) {
            if (persoana1.equals(persoana)) {
                for (Hobby hobby : persoana1.getHobbyList()) {
                    System.out.println("Hobby-ul este <" + hobby.getName() + "> si se practica in tarile: " + hobby.getTaraList());
                }
            }
        }
    }


    private static List<Hobby> initializareHobbyuri1() {
        List<Hobby> hobbyList = new ArrayList<>();
        Hobby hobby1 = new Hobby("Parapanta", 10);
        hobby1.addAdresa("Eroilor");
        hobby1.addAdresa("Unirii");
        hobby1.addTara("Somalia");
        hobby1.addTara("Romania");

        Hobby hobby2 = new Hobby("Pescuit", 500);
        hobby2.addAdresa("Bucium");
        hobby2.addAdresa("Mihai Viteazu");
        hobby2.addTara("Germania");
        hobby2.addTara("India");

        hobbyList.add(hobby1);
        hobbyList.add(hobby2);

        return hobbyList;
    }


    private static List<Hobby> initializareHobbyuri2() {
        List<Hobby> hobbyList = new LinkedList<>();
        Hobby hobby3 = new Hobby("Stat", 1000);
        hobby3.addAdresa("Cosbuc");
        hobby3.addAdresa("Observator");
        hobby3.addTara("Grecia");
        hobby3.addTara("Norvegia");

        Hobby hobby2 = new Hobby("Pescuit", 500);
        hobby2.addAdresa("Bucium");
        hobby2.addAdresa("Mihai Viteazu");
        hobby2.addTara("Germania");
        hobby2.addTara("India");

        hobbyList.add(hobby2);
        hobbyList.add(hobby3);

        return hobbyList;
    }


    public static void afisare(Set<Persoana> lista) {
        Iterator<Persoana> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Persoana persoana = iterator.next();
            System.out.println("Nume: " + persoana.getName());
            System.out.println("Varsta: " + persoana.getAge());
        }
    }


    public static Set<Persoana> initializareListaDupaVarsta() {
        TreeSet<Persoana> lista = new TreeSet<Persoana>(new PersoanaAgeComparator());

        Persoana persoana1 = new Angajat("Alex", 82);
        Persoana persoana2 = new Angajat("Vasile", 22);
        Persoana persoana3 = new Angajat("Ion", 72);
        Persoana persoana4 = new Student("Ioana", 52);
        Persoana persoana5 = new Student("Cristina", 33);
        Persoana persoana6 = new Somer("Lenuta", 44);
        Persoana persoana7 = new Somer("Mirabela", 21);

        lista.add(persoana1);
        lista.add(persoana2);
        lista.add(persoana3);
        lista.add(persoana4);
        lista.add(persoana5);
        lista.add(persoana6);
        lista.add(persoana7);

        return lista;
    }


    public static TreeSet<Persoana> initializareListaDupaNume() {
        TreeSet<Persoana> lista = new TreeSet<>(new PersoanaNameComparator());

        lista.add(new Angajat("Alex", 82));
        lista.add(new Angajat("Vasile", 22));
        lista.add(new Angajat("Ion", 72));
        lista.add(new Student("Ioana", 52));
        lista.add(new Student("Cristina", 33));
        lista.add(new Somer("Lenuta", 44));
        lista.add(new Somer("Mirabela", 21));

        return lista;
    }
}

