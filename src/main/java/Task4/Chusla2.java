package Task4;

import java.util.ArrayList;

public class Chusla2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1= new ArrayList<Integer>();
        for (int i =1; i<=100; i++) {
            al1.add(i);
        }
        System.out.println(al1);
        ArrayList<Integer> al2= new ArrayList<Integer>();
        Integer a =0;
        int counter = 0;
        for (int i=0; i<al1.size(); i++) {
            a = al1.get(i);
            if (a%3==0) {
               counter++;
            };
        }
        System.out.println("кількість чисел, кратних 3 становить: " + counter);
    }
}
