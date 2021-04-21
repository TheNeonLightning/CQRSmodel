package command.handlers;

import command.commands.Command;
import command.commands.LikeCommand;
import domain.Like;


public class LikeCommandHandler implements CommandHandler {

    @Override
    public void execute(Command command) {
        if (command instanceof LikeCommand) {
            Like like = ((LikeCommand) command).getLike();
            generateLikeId(like);
            saveInDataStorage(like);
        }
    }

    private void generateLikeId(Like like) {
        // generating postId for post
    }

    private void saveInDataStorage(Like like) {
        // writing Image to data storage
    }
}
