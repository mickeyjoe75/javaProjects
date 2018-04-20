package device_management;

import behaviours.IInput;

public class Mouse extends InputDevice implements IInput {

    public Mouse(String type, int numberOfKeys) {
        super(type,numberOfKeys);
    }

    @Override
    public String sendData(String data) {
        return "Click " + data;
    }
}
