package Google;

public class Parent {
    private String name;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Parent(String name, String date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.name,this.date);
    }
}
