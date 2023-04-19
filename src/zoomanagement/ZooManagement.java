/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoomanagement;

import data.Animal;
import data.AnimalListManager;
import data.Cheetah;
import data.Lion;

/**
 *
 * @author fpt
 */
public class ZooManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalListManager animalListManager = AnimalListManager.getInstance();
        Lion x1 = new Lion("Z1234", "ST", 2000, 50.0);
        x1.showProfile();
        Animal x = new Cheetah("z1255", "Bao", 2024, 60.0);
        
        Animal[] arr = {x1, x};
       
        animalListManager.removeAnimal();
        animalListManager.printAnimalListAscendingByID();
        animalListManager.searchAnimalById("Z1245");
        
        
    }
    
}
