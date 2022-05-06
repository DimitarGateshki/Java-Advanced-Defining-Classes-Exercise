package CarSalesman;

import java.util.Map;

public class Cars {
    private String model;
    private Engine engine;
    private String weight;
    private String color;


    public String getEngineModel() {
        return this.engine.getModel();
    }
    public String getEngineDisplacement() {
        return this.engine.getDisplacement();
    }
    public String getEnginePower() {
        return this.engine.getPower();
    }
    public String getEngineEfficiency() {
        return this.engine.getEfficiency();
    }


    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Cars(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        String info=String.format
                ("%s:%n%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s",this.model,getEngineModel(),getEnginePower(),getEngineEfficiency(),getEngineDisplacement(),this.color,this.weight);
        return info;
    }
}
