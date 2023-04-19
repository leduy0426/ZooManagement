/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


import java.util.*;
import tool.Tools;


/**
 *
 * @author fpt
 */
public class AnimalListManager {
    private static AnimalListManager instance = null;
    private ArrayList<Animal> animalList = new ArrayList();
    private static Scanner sc = new Scanner(System.in);
    private AnimalListManager(){
        
    }
    
    public static AnimalListManager getInstance(){
        if(instance == null) {
            instance = new AnimalListManager();
        }
        return instance;
    }
    
    public void addNewLion(){
        String id, name;
        int yob;
        double weigth;
        int pos; //lưu vị trí khi thấy id
        
        do {  
            id = Tools.getID("Input ID(ZXXXX): ", "Your input must be under" 
                + "the format of ZXXXX, Z stands for a digit",
                "^[Z|z]\\d{4}$");
            pos = searchAnimalById(id);
            if (pos >=0 )
                System.out.println("The lion is already exists."
                            + "Input another one!");
            
        } while (pos != -1);
    
        name = Tools.getString("Input lion name: ", "The lion name is required!");
        yob = Tools.getAnInteger("Input lion yob (2000..2023): ", "Yob is from 2000..2023!", 2000, 2023);
        weigth = Tools.getADouble("Input lion weigth(0.1->200.0): ", "Weigth is from 0.1 to 200.0!", 0.1, 200.0);
        animalList.add(new Lion(id, name, yob, weigth));
        System.out.println("A lion profile is added sucessfully");
        
    }
    
    
     public void addNewCheetah(){
        String id, name;
        int yob;
        double weigth;
        int pos; //lưu vị trí khi thấy id
        
        do {  
            id = Tools.getID("Input ID(ZXXXX): ", "Your input must be under" 
                + "the format of ZXXXX, Z stands for a digit",
                "^[Z|z]\\d{4}$");
            pos = searchAnimalById(id);
            if (pos >=0 )
                System.out.println("The lion is already exists."
                            + "Input another one!");
            
        } while (pos != -1);
       
    
        name = Tools.getString("Input lion name: ", "The lion name is required!");
        yob = Tools.getAnInteger("Input lion yob (2000..2023): ", "Yob is from 2000..2023!", 2000, 2023);
        weigth = Tools.getADouble("Input lion weigth(0.1->200.0): ", "Weigth is from 0.1 to 200.0!", 0.1, 200.0);
        animalList.add(new Lion(id, name, yob, weigth));
        System.out.println("A lion profile is added sucessfully");
        
    }
     
     public int searchAnimalById(String animalId){
         int pos;
         if (animalList.isEmpty())
             return -1;
         for (int i = 0; i < animalList.size(); i++) {
             if(animalList.get(i).getId().equalsIgnoreCase(animalId))
                 return i;
             
         }
         return -1;
     }
     
     public void searchAnimalByID(String animalID) {
         String id;
         Animal x;
         id = Tools.getString("Input animal id: ", "Animal id is required!");
                 x = searchAnimalObjectByID(id);
           if (x == null)
               System.out.println("Not found!!!");
           else {
               System.out.println("Here is the animal " + " that you want to search");
               x.showProfile();
           }
                 
     }
     
     public Animal searchAnimalObjectByID(String animalID) {
         if (animalList.isEmpty())
             return null;
         for (int i = 0; i < animalList.size(); i++) {
             if (animalList.get(i).getId().equalsIgnoreCase(animalID))
                 return animalList.get(i);
             
           
         }
           return null;
             
     }
     
     public void updateAnimal(){
         String id;
         String tmpName;
         Animal x;
          id = Tools.getString("Input animal id: ", "Animal id is required!");
                 x = searchAnimalObjectByID(id);
           if (x == null)
               System.out.println("Not found!!!");
           else {
               System.out.println("Here is the animal before updating");
               x.showProfile();
               System.out.println("You are required to input a new name");
               tmpName = Tools.getString("Input new name: ", "Name is required!");
               x.setName(tmpName);
                 
     }
    
}
     
     public void removeAnimal() {
         String id;
         int pos;
         id = Tools.getString("Input animal id: ", "Animal id is required!");
         pos = searchAnimalById(id);
         if (pos == -1)
             System.out.println("Not found!!!");
         else{
             animalList.remove(pos);
             System.out.println("The selected animal is removed successfully!");
         }
     }
     
     public void printAnimalListAscendingByID(){
         if (animalList.isEmpty()){
             System.out.println("The list is emty. Nothing to print");
         return;
     }
         Collections.sort(animalList);
         System.out.println("Here is the pet list");
         String header =  String.format("|%6s|%-15s|%4s|%4s|%4s","id", "name", "yob", "weigth");
         System.out.println(header);
         for (int i = 0; i < animalList.size(); i++) {
             animalList.get(i).showProfile();
             
         }
}
}
