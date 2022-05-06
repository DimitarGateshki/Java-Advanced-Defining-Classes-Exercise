package CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,Department> departmentMap=new HashMap<>();

        int lines=Integer.parseInt(sc.nextLine());
        String[] info;
        for (int i = 0; i <lines ; i++) {
             info=sc.nextLine().split("\\s+");
            String name=info[0];
            double salary=Double.parseDouble(info[1]);
            String position=info[2];
            String department=info[3];
            Employee employee;
            if (info.length==6){
                String email=info[4];
                int age=Integer.parseInt(info[5]);
                employee=new Employee(name,salary,position,department,email,age);
            }else if (info.length==4){
                employee=new Employee(name,salary,position,department);

            }else {
                try {
                    int age=Integer.parseInt(info[4]);
                    employee=new Employee(name,salary,position,department,age);
                }catch (NumberFormatException e){
                    String email=info[4];
                    employee=new Employee(name,salary,position,department,email);

                }
            }
            departmentMap.putIfAbsent(department,new Department(department));
            departmentMap.get(department).getWorkers().add(employee);
        }

        Department max=departmentMap.entrySet().stream()
                .max(Comparator.comparing(e->e.getValue().avrSalary())).get().getValue();
        System.out.printf("Highest Average Salary: %s%n",max.getName());

        max.getWorkers().stream()
                .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                .forEach(e-> System.out.println(e));


    }
}
