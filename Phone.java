public class Phone {

    // attributs
    private String model;
    private String color;
    private double camera;

    public Phone(String model, String color, double camera) {

        this.model = model;
        this.color = color;
        this.camera = camera;

    }

    // comportements
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Model: " + this.model + "\n";
        output += "Color: " + this.color + "\n";
        output += "Camera: " + this.camera + "\n";

        return output;
    }

    @Override

    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }

        if (!(other instanceof Phone)) {
            return false;
        }
        Phone o = (Phone) other;

        return (o.model).equals(this.model) 
            && (o.color).equals(this.color)
            && o.camera == this.camera;

    }

}
