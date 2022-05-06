package Google;

public class Company {
    private String name;
    private String position;
    private double salary;

    @Override
    public String toString() {
        return String.format("%s %s %.2f",this.name,this.position,this.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}
