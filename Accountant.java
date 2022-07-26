public class Accountant extends BusinessEmployee {
    TechnicalLead techLead;
    public Accountant(String name) {
        super(name);
    }

    public TechnicalLead getTeamSupported() {
        return techLead;
    }

    public void supportTeam(TechnicalLead tl) {
        this.techLead = tl;
        for (int i = 0; i < tl.employeeReported.size(); i++) {
            SoftwareEngineer se = tl.employeeReported.get(i);
            this.budget =  this.budget + (se.getBaseSalary() + (se.getBaseSalary() * 0.1));
        }
    }

    public boolean approveBonus(double bonus) {
        if (techLead.employeeReported.size() == 0) {
            return false;
        }

        if(budget >= bonus) {
            return true;
        }

        return false;
    }

    public String employeeStatus() {
        return this.getEmployeeId() + " " + this.getName() + " with budget of " + this.getBonusBudget() + " is supporting " + this.techLead.getName();
    }
}
