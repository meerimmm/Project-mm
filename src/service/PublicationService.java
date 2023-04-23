package service;

import data_base.DataBase;
import model.Publication;

import java.util.Arrays;

// TODO: 14.04.2023
//  Класс для публикаций.
//  Реализовать все методы
public class PublicationService {
    private final DataBase dataBase = new DataBase();
    private int pyblicationId;
    private int like;
    private int id;
    private String description;

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public PublicationService() {
    }


    public int getLike() {
        return like;
    }

    public int getPyblicationId() {
        return pyblicationId;
    }


    @Override
    public String toString() {
        return "PublicationService{" +
                "dataBase=" + getDataBase() +
                ", pyblicationId=" +getPyblicationId()  +
                ", like=" + getLike()+
                ", id=" + getId()+
                ", description='" + getDescription()+ '\'' +
                '}';
    }
    Publication publication=new Publication();
    // TODO: 14.04.2023 Сохранить публикацию в мини базе данных (dataBase)!!!
    public void create(Publication publication) {
        Arrays.fill(dataBase.getPublications(), publication);
    }
    // TODO: 14.04.2023 Добавить возможность изменить описание публикации!!!
    public void updateDescription(int id, String description) {
        for (int i = id; i < dataBase.getPublications().length; i++) {
            if (id== publication.getId()){
                dataBase.getPublications()[i].setDescription(description);
            }
            }
        }
    // TODO: 14.04.2023 Добавить возможность поставить лайк к публикации!!!
   public void addLikeToPublication(int publicationId, int like){
       for (int i = 0; i <dataBase.getPublications().length; i++) {
           if (like==publication.getLike()){
               dataBase.getPublications()[i].setPublicationId(publicationId);
           }
           }
       }
    public DataBase getDataBase() {
        return dataBase;
    }
}
