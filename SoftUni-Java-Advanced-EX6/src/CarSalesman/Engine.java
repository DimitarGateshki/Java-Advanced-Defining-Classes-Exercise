package CarSalesman;

public class Engine {
    private String model;
    private String power;
    private String displacement;
    private String efficiency;


    public Engine(String engineModel, String power, String efficiency, String displacement) {
        this.model = engineModel;
        this.power = power;
        this.efficiency = efficiency;
        this.displacement = displacement;
    }

    public String getModel() {
        return this.model;
    }

    public String getPower() {
        return this.power;
    }

    public String getDisplacement() {
        return this.displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }
}
