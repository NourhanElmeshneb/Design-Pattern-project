/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;


public class TaskManager_proxy implements TaskService_proxy{
    
     //override
    public void assignTask(String taskId, String userId) {
         System.out.println("Task " + taskId + " assigned to user " + userId);
    }
//override
    public void completeTask(String taskId) {
        System.out.println("Task " + taskId + " marked as completed.");
    }
}
