import model.Message;
import model.Publication;
import model.User;
import service.MessageService;
import service.PublicationService;
import service.UserService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        MessageService messageService = new MessageService();
        PublicationService publicationService = new PublicationService();


        User user = new User(1, "Meder", "meder@gmail.com");
        userService.createUser(user);
        userService.updateUser(1, new User(2, "MEDER", "meder.tynychbekov@gmail.com"));


        Message message = new Message(1, "2020", "This message is for your application", true, user);
        messageService.sendMessage(message);
        messageService.readMessage(1);


        Publication publication = new Publication(1, "photo", 0, "I'm writing description for my first application", user);
        publicationService.create(publication);
        publicationService.updateDescription(1, "Here I'm changing the description!!!");

        System.out.println(publication);
        System.out.println(publicationService);
        System.out.println(message);
        System.out.println(messageService);
        System.out.println(user);
        System.out.println(userService);
    }
}