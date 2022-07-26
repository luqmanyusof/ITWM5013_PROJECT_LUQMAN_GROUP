

abstract public class Employee {
    String name;
    double salary, bonus;
    int employeeId;
    static int idCounter = 1;
    double techSalary = 75000;

    public Employee(String name, double salary) {
        this.employeeId = idCounter++;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.employeeId = idCounter++;
        this.name = name;
    }

    public double getBaseSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    abstract public Employee getManager();

    public boolean equals(Employee other) {
        return other.employeeId == this.employeeId;
    }

    public String toString() {
        return this.employeeId + " " + this.name;
    }

    abstract public String employeeStatus();

}
