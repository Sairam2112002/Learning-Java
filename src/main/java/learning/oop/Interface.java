package learning.oop;

interface NotificationService {
    // Constant (public, static and final by default); can be only accessed using Interface name
    double pi = 3.14d;

    // Abstract method (public by default)
    void sendNotification();

    // Default method (definition can be added)
    default void printNotification() {
        System.out.println("This is a notification");
    }

    // Static method (definition can be added); can be only accessed using Interface name
    static void saveNotification() {
        System.out.println("Notification saved");
    }
}

interface Service {
    // Same Abstract method as in above interface
    void sendNotification();
}

// "WhatsappNotification" class is implementing both the above interfaces having the same abstract method
// If a class is implementing two interfaces that both have the same abstract method signature,
// the class is responsible for providing an implementation for that method only once.

class WhatsappNotification implements NotificationService, Service {
    // Abstract methods must be implemented
    @Override
    public void sendNotification() {
        System.out.println("Notification sent through WhatsApp");
    }

    // Default methods are optional to override; not mandatory
    @Override
    public void printNotification() {
        System.out.println("This is a WhatsApp notification");
    }
}

public class Interface {
    public static void main(String[] args) {
        WhatsappNotification notification = new WhatsappNotification();
        notification.sendNotification();
        System.out.println();

        notification.printNotification();
        System.out.println();

        System.out.println(NotificationService.pi);
        System.out.println();

        NotificationService.saveNotification();
    }
}
