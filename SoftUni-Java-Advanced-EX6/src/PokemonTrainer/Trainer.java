package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }
    public void addPokemon(Pokemon pok){
        this.pokemons.add(pok);

    }
    public boolean checkPokemons(String el){
        for (Pokemon e:this.pokemons) {
            if (e.getElement().equals(el)){
                return true;
            }
        }
        return false;

    }
    public  void attack(){
        this.pokemons.forEach(e->e.setHealth(e.getHealth()-10));
        this.pokemons=this.pokemons.stream().filter(e->e.getHealth()>0).collect(Collectors.toList());
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",this.name,this.numberOfBadges,this.pokemons.size());
    }
}
