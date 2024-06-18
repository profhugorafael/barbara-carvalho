import model.User;
import service.MessageService;

public class Main {
    public static void main(String[] args) {
        MessageService<String> service = new MessageService<>();

        service.addToQueue("oi");
        service.addToQueue("hello world");
        service.addToQueue("testing...");

        service.print();

        service.addToQueue("other message");
        service.addToQueue("after frist print");

        service.print();

        MessageService<User> serviceForUsers = new MessageService<>();

        serviceForUsers.addToQueue(new User("bob", "bob@gmail.com", "123"));
        serviceForUsers.addToQueue(new User("martha", "martha@gmail.com", "123"));
        serviceForUsers.addToQueue(new User("alex", "alex@gmail.com", "123"));

        serviceForUsers.print();
    }
}
