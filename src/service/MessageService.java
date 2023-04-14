package service;

import data_base.DataBase;
import model.Message;

// TODO: 14.04.2023
//  Класс для сообщения.
//  Реализовать все методы
public class MessageService {
    private DataBase dataBase = new DataBase();

    // TODO: 14.04.2023 Сохранить сообщение в мини базе данных (dataBase);!!!
    public void sendMessage(Message message) {

    }

    // TODO: 14.04.2023 Прочитать сообщение по ID!!!
    public void readMessage(int messageId){

    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
