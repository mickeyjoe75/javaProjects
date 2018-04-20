package device_management;

import behaviours.IInput;

public class KeyBoard extends InputDevice implements IInput {

    public KeyBoard(String type, int numberOfKeys) {
        super(type, numberOfKeys);
    }

    @Override
    public String sendData(String dataInput) {
        return "Type "+ dataInput;
    }
}
