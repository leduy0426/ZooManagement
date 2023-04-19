/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Random;

/**
 *
 * @author fpt
 */
public class Lion extends Animal{
    public static final double MAX_SPEED = 80;

    public Lion(String id, String name, int yob, double weigth) {
        super(id, name, yob, weigth);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showProfile() {
        String msg;
        msg = String.format("|%6s|%-15s|%4d|%4.1f|%5.1f|",id, name, yob, weigth, run());
        System.out.println(msg);        

    
    
    }

}
