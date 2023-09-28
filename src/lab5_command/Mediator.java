package lab5_command;

import javax.swing.*;

public class Mediator {

    private CommandManager commandManager;
    private VStack vStack;
    private JButton JButtonPush;
    private JButton JButtonPop;
    private JButton JButtonRedo;
    private JButton JButtonUndo;
    private JButton JButtonClear;


    public Mediator(CommandManager commandManager, VStack vStack,
                    JButton JButtonPush, JButton JButtonPop, JButton JButtonRedo,
                    JButton JButtonUndo, JButton JButtonClear) {
        this.commandManager = commandManager;
        this.vStack = vStack;
        this.JButtonPush = JButtonPush;
        this.JButtonPop = JButtonPop;
        this.JButtonRedo = JButtonRedo;
        this.JButtonUndo = JButtonUndo;
        this.JButtonClear = JButtonClear;
        update();
    }

    public void update() {
        if(vStack.getSize() == 0) {
            JButtonPop.setEnabled(false);
            JButtonClear.setEnabled(false);
        } else {
            JButtonPop.setEnabled(true);
            JButtonClear.setEnabled(true);
        }
        if(commandManager.getHistoryCommands().size() == 0) {
            JButtonUndo.setEnabled(false);
        } else {
            JButtonUndo.setEnabled(true);
        }
        if(commandManager.getRedoCommands().size() == 0) {
            JButtonRedo.setEnabled(false);
        } else {
            JButtonRedo.setEnabled(true);
        }
    }

}
