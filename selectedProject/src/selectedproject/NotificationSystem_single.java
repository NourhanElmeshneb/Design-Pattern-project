/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elmnshawy
 */
public class NotificationSystem_single {
    private static  NotificationSystem_single instance;
    private List<String> notifications;
    private ExternalNotifier_adapter externalNotifier; // Optional external notifier

    private  NotificationSystem_single() {
        notifications = new ArrayList<>();
    }

    public static synchronized NotificationSystem_single getInstance() {
        if (instance == null) {
            instance = new  NotificationSystem_single();
        }
        return instance;
    }

    public void setExternalNotifier(ExternalNotifier_adapter externalNotifier) {
        this.externalNotifier = externalNotifier;
    }

    public void sendNotification(String message) {
        notifications.add(message);
        System.out.println("Notification Sent: " + message);

        // Forward to external notifier if available
        if (externalNotifier != null) {
            externalNotifier.send(message);
        }
    }
    public List<String> getNotifications() {
        return notifications;
    }
}
