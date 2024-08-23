package org.example;

import javax.xml.transform.Source;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Cat c = new Cat("cat1",12);
   Cat c1 = new Cat("cat1", 12);
   Cat c2 = new Cat("cat3", 22);

       // using @ToString
        System.out.println(c);

        // using getter and setter
        System.out.println(c1.getName());
        c1.setName("tommy");
        System.out.println(c1.getName());

        // using @EqualsandhashCode
        System.out.println(c.equals(c1));

        Calculator calc = new Calculator();
        int sum = calc.add(2, 1);
        System.out.println(sum);

     try {


         int dividebyresult = calc.division(10, 2);
         System.out.println(dividebyresult);
     } catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     }

    }
}