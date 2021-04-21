package command.commands;

import domain.Image;


public class ImageCommand implements Command {

    private final Image image;

    ImageCommand(String userId,
                 String image,
                 String title) {
        this.image = new Image(userId, image, title);
    }

    public Image getImage() {
        return image;
    }
}
