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
public class ExternalNotificationAdapter implements ExternalNotifier_adapter{
    private ExternalNotificationService externalService;

    // Constructor to initialize the external service
    public ExternalNotificationAdapter(ExternalNotificationService externalService) {
        this.externalService = externalService;
    }

    @Override
    public void send(String message) {
        // Adapts the message format to work with the external service
        externalService.sendExternalNotification(message);
    }
    
}
    

