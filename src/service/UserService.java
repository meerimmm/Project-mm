package service;

import data_base.DataBase;
import model.User;

// TODO: 14.04.2023
//  Класс для пользователя.
//  Реализовать все методы
public class UserService {
    private DataBase dataBase = new DataBase();
    private int id;
    private User user;
    private int userID;
    private User newUser;

    public UserService() {
    }

    public UserService(User user) {
        this.user = user;
    }

    public UserService(int id) {
        this.id = id;
    }

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "dataBase=" + dataBase +
                ", id=" + id +
                ", user=" + user +
                ", userID=" + userID +
                ", newUser=" + newUser +
                '}';
    }

    // TODO: 14.04.2023 Сохранить пользователя(User) в мини базе данных!!!
    public void createUser(User user) {
this.createUser(user);
this.user=getUser();

    }

    // TODO: 14.04.2023 Добавить возможность изменить свойтсва пользователя!!!
    public void updateUser(int id, User user) {
        this.id=id;
        this.user=user;
this.updateUser(id,user);
this.id=getId();
this.user=getUser();
    }

    public void addToFriends(int userId, User newUser) {
        this.userID=userId;
        this.newUser=newUser;
this.userID=getUserID();
this.newUser=getNewUser();
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
