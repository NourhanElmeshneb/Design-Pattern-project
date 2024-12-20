/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;
//factory1
public class TaskFactory {
     public static Task_factory1 createTask(String type) {
        switch (type.toLowerCase()) {
            case "bug":
                return new Bug();
            case "feature":
                return new Feature();
            case "improvement":
                return new Improvement();
            default:
                throw new IllegalArgumentException("Invalid task type: " + type);
        }
    }
}
//factory1