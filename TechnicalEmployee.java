abstract public class TechnicalEmployee extends Employee {
    int checkIns;

    public TechnicalEmployee(String name) {
        super(name, 75000);
    }

    public String employeeStatus() {
        return this.employeeId + " " + this.name + " has successful " + this.checkIns + " check ins";
    }

    public int checkIn() {
        return this.checkIns++;
    }

    abstract public Employee getManager();
    
}
