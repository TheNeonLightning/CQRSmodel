package domain;

public class Image {
    String imageId;
    String userId;
    String image;
    String title;

    public Image(String userId,
                 String image,
                 String title) {
        this.userId = userId;
        this.image = image;
        this.title = title;
    }
}
