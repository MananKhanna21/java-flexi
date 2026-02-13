class Employee {
    String id;
    String name;
    String role;
    double baseSalary;
    double salary;

    Employee(String i, String n, String r, double b) {
        id = i;
        name = n;
        role = r;
        baseSalary = b;
    }

    void calculateSalary() {
        switch (role) {
            case "Manager":
                salary = baseSalary + baseSalary * 0.2;
                break;
            case "Developer":
                salary = baseSalary + baseSalary * 0.1;
                break;
            case "Designer":
                salary = baseSalary + baseSalary * 0.05;
                break;
            case "Intern":
                salary = 1000;
                break;
            default:
                salary = baseSalary;
        }
    }

    void applyDeduction(double d) {
        salary -= d;
    }

    void display() {
        System.out.println(id + " " + name + " " + role + " " + salary);
    }
}

class Payroll {
    Employee emp[] = new Employee[10];
    int count = 0;

    void addEmployee(Employee e) {
        emp[count] = e;
        count++;
    }

    void calculateAll() {
        for (int i = 0; i < count; i++) {
            emp[i].calculateSalary();
            emp[i].display();
        }
    }

    Employee findById(String id) {
        for (int i = 0; i < count; i++) {
            if (emp[i].id.equals(id)) return emp[i];
        }
        return null;
    }
}

public class salary {
    public static void main(String[] args) {
        Payroll p = new Payroll();

        Employee e1 = new Employee("E1", "Manan", "SDE", 40000);
        Employee e2 = new Employee("E2", "Kaushik", "Manager", 60000);

        p.addEmployee(e1);
        p.addEmployee(e2);

        p.calculateAll();

        e1.applyDeduction(2000);
        e1.display();
    }
}
