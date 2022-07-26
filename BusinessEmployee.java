public class BusinessEmployee extends Employee {
    BusinessLead manager;
    double budget;
    public BusinessEmployee(String name) {
        super(name, 50000);
    }

    public double getBonusBudget() {
        return this.budget;
    }

    public String employeeStatus() {
        return this.getEmployeeId() + " " + this.getName() + " with a budget of " + this.getBonusBudget();
    }

    public Employee getManager() {
        return this.manager;
    }
}
