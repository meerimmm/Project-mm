package service;

import data_base.DataBase;
import model.Message;

// TODO: 14.04.2023
//  Класс для сообщения.
//  Реализовать все методы
public class MessageService {
    private DataBase dataBase = new DataBase();
    private DataBase message;
    private DataBase messageId;
    private int messageId1;
    private String message1;

    public MessageService(String message1) {
        this.message1 = message1;
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public MessageService(int messageId1) {
        this.messageId1 = messageId1;
    }

    public int getMessageId1() {
        return messageId1;
    }

    public void setMessageId1(int messageId1) {
        this.messageId1 = messageId1;
    }

    public DataBase getMessage() {
        return message;
    }

    public DataBase getMessageId() {
        return messageId;
    }

    public void setMessageId(DataBase messageId) {
        this.messageId = messageId;

    }

    public MessageService() {

    }

    public void setMessage(DataBase message) {
        this.message = message;

    }

    @Override
    public String toString() {
        return "MessageService{" +
                "dataBase=" + dataBase +
                ", message=" + message +
                ", messageId=" + messageId +
                ", messageId1=" + messageId1 +
                '}';
    }

    // TODO: 14.04.2023 Сохранить сообщение в мини базе данных (dataBase);!!!
    public void sendMessage(Message message) {
       this.sendMessage(message);
       this.message=getDataBase();




    }
    // TODO: 14.04.2023 Прочитать сообщение по ID!!!
    public void readMessage(int messageId){
        this.readMessage(messageId);
        this.messageId=getDataBase();
        this.messageId1=getMessageId1();

    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
