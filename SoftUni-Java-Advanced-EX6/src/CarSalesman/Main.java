package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Engine> engines=new HashMap<>();
       List<Cars> cars=new ArrayList<>();

        int lines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] input=sc.nextLine().split("\\s+");
            String model=input[0];
            String ePower=input[1];
            String eDisplacement="n/a";
            String eEfficiency="n/a";

            if (input.length == 4) {
                eDisplacement = input[2];
                eEfficiency = input[3];
            } else if (input.length == 3) {
                if (!Character.isDigit(input[2].charAt(0))) {
                    eEfficiency = input[2];
                } else {
                    eDisplacement = input[2];
                }
            }
            Engine engine=new Engine(model,ePower,eDisplacement,eEfficiency);
            engines.put(model,engine);
        }

        int carLines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < carLines; i++) {
            String[] input=sc.nextLine().split("\\s+");
            String model=input[0];
            String engine=input[1];
            String weight="n/a";
            String color="n/a";

            if (input.length == 4) {
                weight = input[2];
                color = input[3];
            } else if (input.length == 3) {
                if (!Character.isDigit(input[2].charAt(0))) {
                    color = input[2];
                } else {
                    weight = input[2];
                }
            }
            Cars car=new Cars(model,engines.get(engine),color,weight);
            cars.add(car);
        }

        cars.stream().forEach(e-> System.out.println(e));








    }
}
