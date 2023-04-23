package service;

import data_base.DataBase;
import model.Message;

import java.util.Arrays;

// TODO: 14.04.2023
//  Класс для сообщения.
//  Реализовать все методы
public class MessageService {
    private final DataBase dataBase = new DataBase();
    private String createDate;
    private int messageId;
    public int getMessageId() {
        return messageId;
    }
    public Message setMessageId(int messageId) {
        this.messageId = messageId;
        return null;
    }
    public MessageService() {
    }
    @Override
    public String toString() {
        return "MessageService{" +
                "messageId= "+messageId+
                "createDate='" + createDate + '\'' +
                '}';
    }
    //* TODO: 14.04.2023 Сохранить сообщение в мини базе данных (dataBase);!!!
    public void sendMessage(Message message) {
        Arrays.fill(dataBase.getMessages(), message);
    }
    //* TODO: 14.04.2023 Прочитать сообщение по ID!!!
    public void readMessage(int messageId) {
        for (int i = 0; i <dataBase.getMessages().length ; i++) {
            if (messageId==getMessageId()){
                dataBase.getMessages()[i]=setMessageId(messageId);
            }
        }
    }
}
