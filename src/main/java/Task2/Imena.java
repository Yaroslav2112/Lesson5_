package Task2;

import java.util.*;

public class Imena {
    public static void main(String[] args) {
        ArrayList<String>imena1 = new ArrayList<String>();
        imena1.add("Andriy");
        imena1.add("Stepan");
        imena1.add("Roman");
        imena1.add("Ivan");
        imena1.add("Mukola");
        ArrayList<String>imena2 = new ArrayList<String>();
        imena2.add("Oleg");
        imena2.add("Sergiy");
        imena2.add("Yura");
        imena2.add("Oleg");
        imena2.add("Volodiya");
        imena2.add("Ruslan");
        imena1.addAll(imena2);
        System.out.println(imena1);
        System.out.println("розмір масиву: " + imena1.size());
        System.out.println("перший раз імя Олег зустрічається на позиції: " + imena1.indexOf("Oleg"));
        System.out.println("останній раз імя Олег зустрічається на позиції:" + imena1.lastIndexOf("Oleg"));
    }

    }

