package service;

import data_base.DataBase;
import model.User;

import java.util.Arrays;

// TODO: 14.04.2023
//  Класс для пользователя.
//  Реализовать все методы
public class UserService {
    private int userId;
    private User[] newUser;
    DataBase dataBase = new DataBase();

    public int getUserID() {
        return userId;
    }

    @Override
    public String toString() {

        return "UserService{" +
                "userId=" + userId +
                ", newUser=" + Arrays.toString(newUser) +
                ", dataBase=" + dataBase +
                '}';
    }

    // TODO: 14.04.2023 Сохранить пользователя(User) в мини базе данных!!!
    public void createUser(User user) {
        Arrays.fill(dataBase.getUsers(), user);
    }
        // TODO: 14.04.2023 Добавить возможность изменить свойтсва пользователя!!!
        public void updateUser ( int id, User user){
            for (int i = 0; i < user.getId(); i++) {
                if (dataBase.getUsers()[i].getId() == id) {
                    dataBase.getUsers()[i].setId(user.getId());
                    dataBase.getUsers()[i].setEmail(user.getEmail());
                    dataBase.getUsers()[i].setName(user.getName());
                    dataBase.getUsers()[i].setPublications(user.getPublications());
                    dataBase.getUsers()[i].setFriends(user.getFriends());
                }
            }
        }
    }

