package PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,Trainer> Trainers=new LinkedHashMap<>();
        List<String> names=new ArrayList<>();



        String[] info;
        String line= sc.nextLine();
        String tName;
        String pName;
        String type;
        int h;

        while (!line.equals("Tournament")){
            info=line.split("\\s+");
            tName=info[0];
            pName=info[1];
            type=info[2];
            h=Integer.parseInt(info[3]);
            if (!Trainers.containsKey(tName)){
                Pokemon pok=new Pokemon(pName,type,h);
                Trainer trainer=new Trainer(tName);
                trainer.addPokemon(pok);
                Trainers.put(tName,trainer);
                names.add(tName);

            }else {
                Pokemon pok=new Pokemon(pName,type,h);
                Trainers.get(tName).addPokemon(pok);
            }
            line=sc.nextLine();

        }
        line=sc.nextLine();
        while (!line.equals("End")){
            for (String e:names) {
                if (!Trainers.get(e).checkPokemons(line)){
                    Trainers.get(e).attack();
                }else {
                    Trainers.get(e).setNumberOfBadges(Trainers.get(e).getNumberOfBadges()+1);
                }
            }

            line=sc.nextLine();
        }




       Trainers.entrySet().stream() .sorted((b1, b2) -> Integer.compare(b2.getValue().getNumberOfBadges(), b1.getValue().getNumberOfBadges()))
               .forEach(e-> System.out.println(e.getValue()));










    }
}
