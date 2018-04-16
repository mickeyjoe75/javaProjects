public abstract class Component {

    public String make;
    public String model;


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


    public String play(component) {
        return "Playing: " + component;
    }
}
