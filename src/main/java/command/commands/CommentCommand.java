package command.commands;

import domain.Comment;


public class CommentCommand implements Command {
    private final Comment comment;

    public CommentCommand(String userId,
                          String text,
                          String date) {
        comment = new Comment(userId, text, date);
    }

    public Comment getComment() {
        return comment;
    }
}
