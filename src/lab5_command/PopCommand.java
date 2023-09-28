package lab5_command;

import java.util.Vector;

public class PopCommand implements Command {

    private VStack stackVector;
    private Object obj;

    public PopCommand(VStack stackVector) {
        this.stackVector = stackVector;
    }

    @Override
    public void execute() {
        obj = stackVector.pop();
    }

    @Override
    public void undo() {
        if(obj != null) {
            stackVector.push(obj);
        }
    }


}
