package domain;

public class Comment {
    String commentId;
    String userId;
    String text;
    String date;

    public Comment(String userId,
                   String text,
                   String date) {
        this.userId = userId;
        this.text = text;
        this.date = date;
    }
}
