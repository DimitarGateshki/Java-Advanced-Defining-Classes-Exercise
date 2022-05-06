package Google;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,Person> people=new LinkedHashMap<>();




        String[] info;
        String line= sc.nextLine();
        String pName;
        String name;
        String dateJob;
        double salary;
        int speed;

        while (!line.equals("End")){
            info=line.split("\\s+");
            pName=info[0];
            if (!people.containsKey(pName)){
                people.put(pName,new Person(pName));
            }
            name=info[2];
            switch (info[1]){
                case "company":
                    dateJob=info[3];
                    salary=Double.parseDouble(info[4]);
                    Company company=new Company(name,dateJob,salary);
                    people.get(pName).setCompany(company);
                    break;
                    case "pokemon":
                        dateJob=info[3];
                        Pokemon pokemon=new Pokemon(name,dateJob);
                        people.get(pName).addPokemon(pokemon);
                    break;
                    case "parents":
                        dateJob=info[3];
                        Parent parent=new Parent(name,dateJob);
                        people.get(pName).addParent(parent);
                    break;
                    case "children":
                        dateJob=info[3];
                        Children children=new Children(name,dateJob);
                        people.get(pName).addChild(children);
                    break;
                    case "car":
                        speed=Integer.parseInt(info[3]);
                        Car car=new Car(name,speed);
                        people.get(pName).setCar(car);
                    break;
            }
            line=sc.nextLine();


        }
        line=sc.nextLine();
        System.out.println(people.get(line));













    }
}
