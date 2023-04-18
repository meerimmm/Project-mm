package service;

import data_base.DataBase;
import model.Publication;

// TODO: 14.04.2023
//  Класс для публикаций.
//  Реализовать все методы
public class PublicationService {
    private DataBase dataBase = new DataBase();
    private int pyblicationId;
    private int like;
    private int id;
    private String description;

    public PublicationService(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PublicationService() {
    }

    public PublicationService(int pyblicationId) {
        this.pyblicationId = pyblicationId;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getPyblicationId() {
        return pyblicationId;
    }

    @Override
    public String toString() {
        return "PublicationService{" +
                "dataBase=" + dataBase +
                ", pyblicationId=" + pyblicationId +
                ", like=" + like +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public void setPyblicationId(int pyblicationId) {
        this.pyblicationId = pyblicationId;

    }

    // TODO: 14.04.2023 Сохранить публикацию в мини базе данных (dataBase)!!!
    public void create(Publication publication) {
        this.addLikeToPublication(publication.getId(), 100);

    }

    // TODO: 14.04.2023 Добавить возможность изменить описание публикации!!!
    public void updateDescription(int id, String description) {
     this.updateDescription(1,"Here I'm changing the description!!!");
this.id=getId();
this.description=getDescription();
    }

    // TODO: 14.04.2023 Добавить возможность поставить лайк к публикации!!!
    public void addLikeToPublication(int publicationId, int like){
        this.addLikeToPublication(1234,1000);
        this.pyblicationId=getPyblicationId();
        this.like=getLike();
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
