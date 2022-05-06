package Google;

public class Car {
    private String model;
    private int hp;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Car(String model, int hp) {
        this.model = model;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("%s %d",this.model,this.hp);
    }
}
