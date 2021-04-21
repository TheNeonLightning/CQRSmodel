package command.handlers;

import command.commands.Command;
import command.commands.ImageCommand;
import domain.Image;


public class ImageCommandHandler implements CommandHandler {

    @Override
    public void execute(Command command) {
        if (command instanceof ImageCommand) {
            Image image = ((ImageCommand) command).getImage();
            generateImageId(image);
            saveInDataStorage(image);
        }
    }

    private void generateImageId(Image image) {
        // generating postId for image
    }

    private void saveInDataStorage(Image image) {
        // writing Image to data storage
    }
}
