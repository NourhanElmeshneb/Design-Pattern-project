
package selectedproject;

import java.util.Scanner;


public class SelectedProject {

 
    public static void main(String[] args) {
        // factory1
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task type (Bug, Feature, Improvement): ");
        String type = scanner.nextLine();

        try {
            Task_factory1 userTask = TaskFactory.createTask(type);

            System.out.println("Enter task title: ");
            userTask.setTitle(scanner.nextLine());

            System.out.println("Enter task description: ");
            userTask.setDescription(scanner.nextLine());

            System.out.println("Task created successfully!");
            userTask.displayDetails();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
        //facrory1
    //factory2
    User user1 = UserFactory.createUser(1);
      user1.performTask();
      
     User user2 = UserFactory.createUser(2);
      user2.performTask();
      
     User user3 = UserFactory.createUser(3);
      user3.performTask();  
      //factory2
      //////////////////////////////////////////////////
      //builder
      // Direct use of TaskBuilder
        TaskBuilder builder = new TaskBuilder();
        builder.Id(1).Title("Login Issue").Type("Bug").Priority("High").Assignee("Alice");
        Task_builder task1 = builder.build();

        System.out.println("Task 1:");
        System.out.println("ID: " + task1.getId());
        System.out.println("Title: " + task1.getTitle());
        System.out.println("Type: " + task1.getType());
        System.out.println("Priority: " + task1.getPriority());
        System.out.println("Assignee: " + task1.getAssignee());

        // Using Director for predefined tasks
        TaskDirector_builder director = new TaskDirector_builder();
        TaskBuilder featureBuilder = new TaskBuilder();
        director.buildFeatureTask(featureBuilder);
        Task_builder featureTask = featureBuilder.build();

        System.out.println("\nFeature Task:");
        System.out.println("Type: " + featureTask.getType());
        System.out.println("Priority: " + featureTask.getPriority());
        System.out.println("Description: " + featureTask.getDescription());
        System.out.println("Assignee: " + featureTask.getAssignee());
        
        //builder
    //////////////////////////////////////////////////////////////////
//singleton , adapter
TaskManager_single taskManager = TaskManager_single.getInstance();
        NotificationSystem_single notificationSystem = NotificationSystem_single.getInstance();

        // Set up external notification system
        ExternalNotificationService externalService = new ExternalNotificationService();
        ExternalNotificationAdapter adapter = new ExternalNotificationAdapter(externalService);
        notificationSystem.setExternalNotifier(adapter);

        // Create some tasks
        Task_single task2 = new Task_single("Fix Login Bug", "Critical issue with user login");
        Task_single task3= new Task_single ("Add Dark Mode", "Implement dark mode for better UI");

        // Add tasks
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        // Display tasks
        System.out.println("\nAll Tasks:");
        for (Task_single task : taskManager.getTasks()) {
            System.out.println("- " + task.getTitle() + ": " + task.getDescription());
        }

        // Display notifications
        System.out.println("\nAll Notifications:");
        for (String notification : notificationSystem.getNotifications()) {
            System.out.println("- " + notification);
        }
//adapter.sinleto
        /////////////////////////////////////////////////////////
        
       //proxy
         TaskService_proxy adminProxy = new TaskProxy("Admin");
        TaskService_proxy devProxy = new TaskProxy("Developer");
        TaskService_proxy testerProxy = new TaskProxy("Tester");

        // Admin can assign and complete tasks
        System.out.println("Admin is performing the tasks:");
        adminProxy.assignTask("T001", "U123");
        adminProxy.completeTask("T001");

        // Developer can complete tasks but cannot assign
        System.out.println("\nDeveloper is performing the tasks:");
        devProxy.assignTask("T002", "U456");
        devProxy.completeTask("T002");

        // Tester cannot assign or complete tasks
        System.out.println("\nTester is performing the tasks:");
        testerProxy.assignTask("T003", "U789");
        testerProxy.completeTask("T003");
       //proxy
       ////////////////////////////////////
    }
    
    

    }
    

