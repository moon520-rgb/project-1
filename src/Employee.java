public class Employee {
    String name;
    private int monSalary;

    public Employee(String name, int salary) {
        this.name = name;
        this.monSalary = salary;
    }

    public int getSalary() {
        return monSalary;
    }

    public void setSalary(int salary) {
        this.monSalary = salary;
    }
    public int getAnnual(){
         return monSalary*12;

    }
}
