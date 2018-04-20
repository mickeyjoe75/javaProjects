package device_management;

public abstract class InputDevice {
        private String type;
        private int numberOfKeys;
        private String data;

        public InputDevice(String type, int numberOfKeys) {
            this.type = type;
            this.numberOfKeys = numberOfKeys;
        }

    public String sendData() {
        return data;
    }
}
