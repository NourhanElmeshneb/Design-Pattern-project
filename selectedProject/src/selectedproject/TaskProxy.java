/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;

/**
 *
 * @author Elmnshawy
 */
public class TaskProxy implements TaskService_proxy {
    private TaskManager_proxy taskManager = new TaskManager_proxy();
    private String currentUserRole;

    public TaskProxy(String role) {
        this.currentUserRole = role;
    }

 //override
    public void assignTask(String taskId, String userId) {
        if ("Admin".equalsIgnoreCase(currentUserRole)) {
            taskManager.assignTask(taskId, userId);
        } else {
            System.out.println("Access Denied: Only Admin can assign tasks.");
        }
    }

   //override
    public void completeTask(String taskId) {
        if ("Admin".equalsIgnoreCase(currentUserRole) || "Developer".equalsIgnoreCase(currentUserRole)) {
            taskManager.completeTask(taskId);
        } else {
            System.out.println("Access Denied: You don't have permission to complete tasks.");
        }
    

    }
}
