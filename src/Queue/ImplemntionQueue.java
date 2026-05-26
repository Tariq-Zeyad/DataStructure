/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

public class ImplemntionQueue {

    public static void main(String[] args) {
        Deque names = new Deque<>();
        names.AddFirst("Rani");
        names.AddLast("Sara");
        names.AddFirst("Fouad");
        names.AddFirst("Tariq");
        System.out.println(names.removeFirat());
        System.out.println(names.size());
        int size=names.size();
        for (int i = 0; i <size; i++) {
            System.out.println("Ietm :"+size);
        }
        

    }

}
