package command.dispatcher;

import command.commands.Command;
import command.handlers.CommandHandler;

import java.util.List;

public class CommandDispatcherImpl implements CommandDispatcher {

    List<CommandHandler> commandHandlers;

    @Override
    public void execute(Command command) {
        for (CommandHandler handler : commandHandlers) {
            handler.execute(command);
        }
    }
}
