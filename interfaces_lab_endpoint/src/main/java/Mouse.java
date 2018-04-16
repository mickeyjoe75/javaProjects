public class Mouse implements IPeripheral {

    private String make;
    private String model;

    public Mouse(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String connect() {
        return "connected";
    }
}
