package command.dispatcher;

import command.commands.Command;


// Server side
public interface CommandDispatcher {

    void execute(Command command);
}