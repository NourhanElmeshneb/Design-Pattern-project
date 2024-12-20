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
public class Task_builder {
    private int id;
    private String title;
    private String description;
    private String type; // Bug, Feature, Improvement
    private String assignee;
    private String priority; // High, Medium, Low
    private String status; // Open, In Progress, Completed

    public Task_builder(int id, String title, String description, String type, String assignee, String priority, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }
}
