package domain;

import java.util.List;

public class Post {
    String postId;
    String userId;
    Image image;
    List<Comment> comments;
    List<Like> likes;
}
