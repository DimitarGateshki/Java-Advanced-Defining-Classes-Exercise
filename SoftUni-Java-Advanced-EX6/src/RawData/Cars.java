package RawData;

import java.util.Map;

public class Cars {
    private String name;
    private  int speed;
    private int power;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private String cargo;
    private Map<Double,Integer> tires;

    public Cars(String name, int speed, int power, int weight, String cargo, Map<Double, Integer> tires) {
        this.name = name;
        this.speed = speed;
        this.power = power;
        this.weight = weight;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Map<Double, Integer> getTires() {
        return tires;
    }

    public void setTires(Map<Double, Integer> tires) {
        this.tires = tires;
    }

    public Double tyresPressure(){
        double pressure=this.tires.keySet().stream().mapToDouble(v->v).sum();
        pressure=pressure/4;
        return pressure;
    }

    @Override
    public String toString() {
        String info=String.format("%s %.2f %s %d");
        return info;
    }
}
