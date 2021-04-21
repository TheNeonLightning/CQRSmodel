package command.handlers;

import command.commands.Command;
import command.commands.CommentCommand;
import domain.Comment;


public class CommentCommandHandler implements CommandHandler {

    @Override
    public void execute(Command command) {
        if (command instanceof CommentCommand) {
            Comment comment = ((CommentCommand) command).getComment();
            generateLikeId(comment);
            saveInDataStorage(comment);
        }
    }

    private void generateLikeId(Comment comment) {
        // generating postId for post
    }

    private void saveInDataStorage(Comment comment) {
        // writing Image to data storage
    }
}
