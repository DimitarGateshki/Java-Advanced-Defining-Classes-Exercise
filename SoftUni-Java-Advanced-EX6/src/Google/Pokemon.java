package Google;

public class Pokemon {
    private String name;
    private String element;


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.name,this.element);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }



    public Pokemon(String name, String element) {
        this.name = name;
        this.element = element;
    }
}
