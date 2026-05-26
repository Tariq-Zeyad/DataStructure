/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectOfBag;

/**
 *
 * @author LTC2023
 */


import java.util.Random;
import java.util.Scanner;

public class TreasureChestApp {

    static Bag<Treasure> chest = new Bag<>(10);

    static void addTreasure(String name) {
        for (int i = 0; i < chest.size(); i++) {
            Treasure t = chest.get(i);
            if (t.getName().equalsIgnoreCase(name)) {
                t.increment();
                return;
            }
        }
        chest.add(new Treasure(name));
    }

    static void removeTreasure(String name) {
        for (int i = 0; i < chest.size(); i++) {
            Treasure t = chest.get(i);
            if (t.getName().equalsIgnoreCase(name)) {
                t.decrement();
                if (t.getCount() == 0) {
                    chest.remove(i);
                }
                return;
            }
        }
        System.out.println("Treasure not found!");
    }

    static void display() {
        if (chest.isEmpty()) {
            System.out.println("Chest is Empty");
            return;
        }
        for (int i = 0; i < chest.size(); i++) {
            Treasure t = chest.get(i);
            System.out.println(t.getName() + " : " + t.getCount());
        }
    }

    static void mostFrequent() {
        if (chest.isEmpty()) return;

        Treasure max = chest.get(0);
        for (int i = 1; i < chest.size(); i++) {
            if (chest.get(i).getCount() > max.getCount()) {
                max = chest.get(i);
            }
        }
        System.out.println("Most Frequent Treasure: "
                + max.getName() + " (" + max.getCount() + ")");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random r = new Random();
        String[] init = {"Sword", "Shield", "Gold", "Map", "Potion"};

        // Random distribution at start
        for (int i = 0; i < 5; i++) {
            addTreasure(init[r.nextInt(init.length)]);
        }

        while (true) {
            System.out.println("\n1.Add 2.Remove 3.Display 4.Most Frequent 5.Exit");
            System.out.print("Choose: ");
            int ch = in.nextInt();
            in.nextLine();

            if (ch == 1) {
                System.out.print("Treasure name: ");
                addTreasure(in.nextLine());

            } else if (ch == 2) {
                System.out.print("Treasure name: ");
                removeTreasure(in.nextLine());

            } else if (ch == 3) {
                display();

            } else if (ch == 4) {
                mostFrequent();

            } else if (ch == 5) {
                break;
            }
        }
        in.close();
    }
}

