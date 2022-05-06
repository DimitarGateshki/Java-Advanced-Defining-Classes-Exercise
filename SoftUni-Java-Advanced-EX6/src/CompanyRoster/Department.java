package CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
        private String name;
        private List<Employee> workers;

        public Department(String name) {
            this.name = name;
            this.workers = new ArrayList<>();
        }

        public List<Employee> getWorkers() {
            return workers;
        }

        public double avrSalary(){
            double end=0;
            for (Employee worker:workers) {
                end+=worker.getSalary();
            }
            end/=workers.size();
            return end;
        }

        public String getName() {
            return name;
        }
    }


