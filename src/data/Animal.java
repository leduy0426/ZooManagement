/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author fpt
 */
public abstract class Animal implements Comparable<Animal>{
    protected String id;
    protected String name;
    protected int yob;
    protected double weigth;

    public Animal(String id, String name, int yob, double weigth) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.weigth = weigth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + ", yob=" + yob + ", weigth=" + weigth + '}';
    }
    
    public abstract double run();
    
    public abstract void showProfile();
    
        @Override
    public int compareTo(Animal that) {
           return this.id.compareToIgnoreCase(that.id);
        
    }
    
}

