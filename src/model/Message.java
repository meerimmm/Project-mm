package model;

/**
 * ЗДЕСЬ НЕЧЕГО НЕ ТРОГАТЬ.
 * ВСЁ УЖЕ ПОДГОТОВЛЕНО!!!
 */
public class Message {
    private int id;
    private User user;
    private String createDate;
    private String message;
    private boolean isRead;
    public Message(int id, String createDate, String message, boolean isRead,  User user) {
        this.id = id;
        this.createDate = createDate;
        this.message = message;
        this.isRead = isRead;
        this.user = user;
    }
    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", createDate='" + createDate + '\'' +
                ", message='" + message + '\'' +
                ", isRead=" + isRead +
                '}';
    }
}
