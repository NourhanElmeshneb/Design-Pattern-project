/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;


public class TaskBuilder {
    private int id;
    private String title;
    private String description;
    private String type;
    private String assignee;
    private String priority;
    private String status;

    public TaskBuilder Id(int id) {
        this.id = id;
        return this;
    }

    public TaskBuilder Title(String title) {
        this.title = title;
        return this;
    }

    public TaskBuilder Description(String description) {
        this.description = description;
        return this;
    }

    public TaskBuilder Type(String type) {
        this.type = type;
        return this;
    }

    public TaskBuilder Assignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    public TaskBuilder Priority(String priority) {
        this.priority = priority;
        return this;
    }

    public TaskBuilder Status(String status) {
        this.status = status;
        return this;
    }

    public Task_builder build() {
        return new Task_builder(id, title, description, type, assignee, priority, status);
    }
}
