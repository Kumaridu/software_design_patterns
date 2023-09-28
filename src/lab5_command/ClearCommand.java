package lab5_command;

import java.util.Stack;

public class ClearCommand implements Command {

    private VStack stackVector;
    private Stack copyValue;


    public ClearCommand(VStack stackVector) {
        this.stackVector = stackVector;
        copyValue = new Stack<>();
    }

    @Override
    public void execute() {
        copyValue.addAll(stackVector.getStackVector());
        stackVector.clear();
    }

    @Override
    public void undo() {
        stackVector.getStackVector().addAll(copyValue);
    }
}
