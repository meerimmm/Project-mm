package service;

import data_base.DataBase;
import model.User;

// TODO: 14.04.2023
//  Класс для пользователя.
//  Реализовать все методы
public class UserService {
    private DataBase dataBase = new DataBase();

    // TODO: 14.04.2023 Сохранить пользователя(User) в мини базе данных!!!
    public void createUser(User user) {

    }

    // TODO: 14.04.2023 Добавить возможность изменить свойтсва пользователя!!!
    public void updateUser(int id, User user) {

    }

    public void addToFriends(int userId, User newUser) {

    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
