/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;

//factory2
public class Developer extends User {
      public Developer() {
        setName("Nour");
        setRole("Developer");
    }

    @Override
    public void performTask() {
        System.out.println("Developer : " + getName() + " is writing code.");
    } 
    
}
//factory2