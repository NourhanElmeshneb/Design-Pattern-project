/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;

//factory2
public class Tester extends User {
     public Tester() {
        setName("Alaa");
        setRole("Tester");
    }

    @Override
    public void performTask() {
        System.out.println("Tester :" + getName() + " is testing the application.");
    }
}
//factory2