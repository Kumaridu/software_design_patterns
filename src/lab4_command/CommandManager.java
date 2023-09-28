package lab4_command;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    List<Command> commands = new ArrayList<>();

    public void submit(Command command) {
        commands.add(command);
        command.execute();
    }
}
