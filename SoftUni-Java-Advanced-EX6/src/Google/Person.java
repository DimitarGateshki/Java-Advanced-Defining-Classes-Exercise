package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Pokemon> pokemons;
    private List<Children> children;
    private List<Parent> parents;

    public Person(String name) {
        this.name = name;
        this.parents=new ArrayList<>();
        this.pokemons=new ArrayList<>();
        this.children=new ArrayList<>();
    }

    public void addChild(Children child){
        this.children.add(child);
    }
    public void addParent(Parent child){
        this.parents.add(child);
    }
    public void addPokemon(Pokemon child){
        this.pokemons.add(child);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(this.name + System.lineSeparator());
        sb.append("Company:"+System.lineSeparator());
        if (this.getCompany()!=null){
            sb.append(this.company+System.lineSeparator());
        }
        sb.append("Car:"+System.lineSeparator());
        if (this.getCar()!=null){
            sb.append(this.car+System.lineSeparator());
        }
        sb.append("Pokemon:"+System.lineSeparator());
        for (Pokemon p:pokemons) {
            sb.append(p+System.lineSeparator());
        }
        sb.append("Parents:"+System.lineSeparator());
        for (Parent p:parents) {
            sb.append(p+System.lineSeparator());
        }
        sb.append("Children:"+System.lineSeparator());
        for (Children p:children) {
            sb.append(p+System.lineSeparator());
        }

        return sb.toString();
    }
}
