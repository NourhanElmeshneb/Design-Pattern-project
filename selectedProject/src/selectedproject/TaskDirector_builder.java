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
public class TaskDirector_builder {
    public void buildBugTask(TaskBuilder builder) {
        builder.Type("Bug")
               .Priority("High")
               .Status("Open")
               .Description("Fix critical login issue.")
               .Assignee("Developer A");
    }

    public void buildFeatureTask(TaskBuilder builder) {
        builder.Type("Feature")
               .Priority("Medium")
               .Status("Open")
               .Description("Add user profile feature.")
               .Assignee("Developer B");
    }
}
