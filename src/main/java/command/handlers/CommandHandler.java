package command.handlers;

import command.commands.Command;


// Server side
public interface CommandHandler {
    void execute(Command command);
}
