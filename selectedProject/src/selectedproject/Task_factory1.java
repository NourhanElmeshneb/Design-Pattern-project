/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;


//factory1
public abstract class Task_factory1 {
     private String title;
    private String description;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public abstract String getType();

    public void displayDetails() {
        System.out.println("[" + getType() + "] Title: " + title + ", Description: " + description);
    }
  //factory1
    
}
