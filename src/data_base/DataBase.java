package data_base;

import model.Message;
import model.Publication;
import model.User;

/**
 * ЗДЕСЬ НЕЧЕГО НЕ ТРОГАТЬ.
 * ВСЁ УЖЕ ПОДГОТОВЛЕНО!!!
 */
public class DataBase {
    private User[] users = new User[100];
    private Message[] messages = new Message[100];
    private Publication[] publications = new Publication[100];
    public User[] getUsers() {
        return users;
    }
    public Message[] getMessages() {
        return messages;
    }

    public Publication[] getPublications() {
        return publications;
    }

    }

