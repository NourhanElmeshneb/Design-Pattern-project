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
public interface  TaskService_proxy {
     void assignTask(String taskId, String userId);
    void completeTask(String taskId);
}
