package lab5_command;

import java.util.Stack;

public class CommandManager {

    private Stack<Command> historyCommands = new Stack<>();
    private Stack<Command> redoCommands = new Stack<>();
    private Mediator mediator;


    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void submit(Command command) {
        historyCommands.add(command);
        command.execute();
        mediator.update(); // I think I don't need update method() here
    }

    public void undo() {
        if(historyCommands.size() > 0) {
            Command recentCommand = historyCommands.pop();
            recentCommand.undo();
            redoCommands.add(recentCommand);
            mediator.update();
        }
    }

    public void redo() {
        if(redoCommands.size() > 0) {
            Command recentCommand = redoCommands.pop();
            historyCommands.add(recentCommand);
            recentCommand.execute();
            mediator.update();
        }
    }

    public Stack<Command> getHistoryCommands() {
        return historyCommands;
    }

    public Stack<Command> getRedoCommands() {
        return redoCommands;
    }
}
