package OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        List<Person> people=new ArrayList<>();

        int lines=Integer.parseInt(sc.nextLine());
        String[] info;
        int age;
        Person person;
        for (int i = 0; i < lines; i++) {
            info=sc.nextLine().split("\\s+");
            age=Integer.parseInt(info[1]);
            person=new Person(info[0],age );
            people.add(person);
        }

        people.stream().filter(e->e.getAge()>30).sorted(Comparator.comparing(p->p.getName()))
                .forEach(e-> System.out.printf("%s - %d%n",e.getName(),e.getAge()));

    }
}
