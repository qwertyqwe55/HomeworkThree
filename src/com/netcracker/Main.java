package com.netcracker;

import com.netcracker.chapter9.Question;
import com.netcracker.chapter9.time.Clock;
import com.netcracker.chapter9.time.WorldClock;
import com.netcracker.combolock.Combolock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================3.1========================");
        List<Product> products = new ArrayList<>();
        products.add(new Product("Coffe",50,false));
        products.add(new Product("Tea",20,false));
        CashRegister cashRegister = new CashRegister(100,products);
        System.out.println("Method give change without tax: " + cashRegister.giveChange());


        System.out.println("=====================3.2========================");
        List<Product> products1 = new ArrayList<>();
        products1.add(new Product("Coffe",50,true));
        products1.add(new Product("Tea",20,true));
        CashRegister cashRegister1 = new CashRegister(100,20,products1);
        System.out.println("Method givechange with tax = 20%: " + cashRegister1.giveChange());
        System.out.println("Final summa tax: " + cashRegister1.getTotalTax());

        System.out.println("=====================3.4========================");
        Paper paper = new Paper();
        paper.cutInHalf();
        System.out.println(paper);
        paper.cutInHalf();
        System.out.println(paper);
        paper.cutInHalf();
        System.out.println(paper);
        paper.cutInHalf();
        System.out.println(paper);
        System.out.println("=====================3.6========================");
        Person dima = new Person("Dima");
        Person john = new Person("John");
        Person artem = new Person("Artem");
        Person petya = new Person("Petya");

        dima.befrined(john);
        dima.befrined(artem);
        dima.befrined(petya);
        System.out.println("List of friends: " + dima.getFieldNames());
        dima.unfriend(artem);
        System.out.println("Friends of friend after unfriend method: " + dima.getFieldNames());
        System.out.println("=====================3.7========================");
        System.out.println("Count of friend: " + dima.getCountFriend());
        System.out.println("=====================3.8========================");
        System.out.println("Test class Student:");
        new StudentTester().testStudent();
        System.out.println("=====================3.9========================");
        Battery battery = new Battery(2000);
        System.out.println("Capacity battery: " + battery);
        battery.drain(1000);
        System.out.println("Capacity battery after remaining on 1000: " + battery.getRemainingCapacity());
        battery.charge();
        System.out.println("Capacity battery after full charge: " + battery);

       System.out.println("=====================8.1========================");
        Combolock combolock = new Combolock(5,6,25);
        combolock.turnRight(5);
        combolock.turnRight(1);
        combolock.turnLeft(20);
        if(combolock.open()) System.out.println("Combolock is open");;

     System.out.println("=====================Example 9.1========================");
     Scanner in = new Scanner(System.in);

      Question q = new Question();
      q.setText("Who was the inventor of Java?");
      q.setAnswer("James Gosling");

      q.display();
      System.out.print("Your answer: ");
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
        System.out.println("=====================9.2========================");
        Clock clock = new Clock();
        System.out.println("Local time: " + clock.getTime());
        WorldClock worldClock = new WorldClock(5);
        System.out.println("Time UTC+5: " + worldClock.getTime());
        System.out.println("=====================9.3========================");
        clock.setAlarm("21:43");
        if(clock.Alarm()) System.out.println("BIP-BIP-BIP....");
        worldClock.setAlarm("22:18");
        if(worldClock.Alarm()) System.out.println("Other world time alarm: BIP-BIP");
    }
}
