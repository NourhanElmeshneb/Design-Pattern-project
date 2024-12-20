/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;

//singleton

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class TaskManager_single {
    
     private static TaskManager_single instance; 
    private NotificationSystem_single notificationSystem;// The single instance of TaskManager
    

    
    private List<Task_single> tasks;           // List to hold tasks
// Database connection details
    private final String DB_URL = "jdbc:mysql://localhost:3306/NOURHAN";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "your_password";
    
    // Private constructor to prevent external instantiation
    private TaskManager_single() {
        tasks = new ArrayList<>();
        notificationSystem = NotificationSystem_single.getInstance();
    }

    // Method to get the instance of TaskManager
    public static  TaskManager_single getInstance() {
        if (instance == null) {
            instance = new TaskManager_single(); // Create the single instance if it doesn't exist
        }
        return instance;
    }
// Method to establish a database connection
    private Connection connect() throws Exception {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    // Add a task to the list
    public void addTask(Task_single task) {
        tasks.add(task);
        notificationSystem.sendNotification("New task added: " + task.getTitle());
       
    }
    // Save task to the database
       
    
    // Get the list of tasks
    public List<Task_single> getTasks() {
        return tasks;
    }
}
//sigleton