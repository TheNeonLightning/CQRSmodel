package domain;

public class Like {
    String likeId;
    String userId;
    String date;

    public Like(String userId,
                String date) {
        this.userId = userId;
        this.date = date;
    }
}
