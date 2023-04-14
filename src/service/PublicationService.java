package service;

import data_base.DataBase;
import model.Publication;

// TODO: 14.04.2023
//  Класс для публикаций.
//  Реализовать все методы
public class PublicationService {
    private DataBase dataBase = new DataBase();

    // TODO: 14.04.2023 Сохранить публикацию в мини базе данных (dataBase)!!!
    public void create(Publication publication) {

    }

    // TODO: 14.04.2023 Добавить возможность изменить описание публикации!!!
    public void updateDescription(int id, String description) {

    }

    // TODO: 14.04.2023 Добавить возможность поставить лайк к публикации!!!
    public void addLikeToPublication(int publicationId, int like){
        
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
