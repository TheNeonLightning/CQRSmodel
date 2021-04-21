package command.commands;

import domain.Like;


public class LikeCommand implements Command {
    private final Like like;

    public LikeCommand(String userId,
                       String date) {
        like = new Like(userId, date);
    }

    public Like getLike() {
        return like;
    }
}
