package RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cars> flamable=new ArrayList<>();
        ArrayList<Cars> fragile=new ArrayList<>();


        int lines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] info=sc.nextLine().split("\\s+");
            String name=info[0];
            int speed=Integer.parseInt(info[1]);
            int power=Integer.parseInt(info[2]);
            int weight=Integer.parseInt(info[3]);
            String type=info[4];

            double t1Pressure=Double.parseDouble(info[5]);
            int t1Age=Integer.parseInt(info[6]);
            double t2Pressure=Double.parseDouble(info[7]);
            int t2Age=Integer.parseInt(info[8]);
            double t3Pressure=Double.parseDouble(info[9]);
            int t3Age=Integer.parseInt(info[10]);
            double t4Pressure=Double.parseDouble(info[11]);
            int t4Age=Integer.parseInt(info[12]);
            Map<Double,Integer> tires=new LinkedHashMap<>();
            tires.put(t1Pressure,t1Age);
            tires.put(t2Pressure,t2Age);
            tires.put(t3Pressure,t3Age);
            tires.put(t4Pressure,t4Age);

            Cars car=new Cars(name,speed,power,weight,type,tires);
            if (type.equals("flamable")){
                flamable.add(car);
            }else {
                fragile.add(car);
            }
        }



        String command= sc.nextLine();

        if (command.equals("flamable")){
            for (Cars car:flamable) {
                if (car.getPower()>250){
                    System.out.println(car.getName());
                }
            }

        }else {
            for (Cars car:fragile) {

                if (car.tyresPressure()<1){
                    System.out.println(car.getName());
                }
            }

        }




    }
}
