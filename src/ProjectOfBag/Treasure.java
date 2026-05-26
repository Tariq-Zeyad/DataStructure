/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectOfBag;

/**
 *
 * @author LTC2023
 */
public class Treasure {
    private String name;
    private int count;

    public Treasure(String name) {
        this.name = name;
        this.count = 1;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }
}

    
