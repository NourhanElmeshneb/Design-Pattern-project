/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;

//factory2
public class Admin extends User {
     public Admin() {
        setName("Rana");
        setRole("Admin");
    }

    @Override
    public void performTask() {
        System.out.println("Admin: " + getName() + " is managing system settings.");
    }
}
//factory2