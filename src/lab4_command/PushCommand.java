package lab4_command;

import java.util.Vector;

public class PushCommand implements Command {

    private VStack stackVector;
    private Object obj;

    PushCommand(VStack vector, Object obj) {
        this.stackVector = vector;
        this.obj = obj;
    }


    @Override
    public void execute() {
        stackVector.getStackVector().insertElementAt(obj, 0);
    }
}
