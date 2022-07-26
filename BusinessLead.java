import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee {
    int headCount = 10;
    ArrayList<Accountant> employeeReported = new ArrayList<>();

    public BusinessLead(String name) {
        super(name);
    }

    public boolean hasHeadCount() {
        return employeeReported.size() < this.headCount;
    }

    public boolean addReport(Accountant accountant, TechnicalLead tl) {
        if (this.hasHeadCount()) {
            employeeReported.add(accountant);
            this.budget = this.budget + (1.1 * accountant.getBaseSalary());
            accountant.supportTeam(tl);
            return true;
        }

        return false;
    }

    public boolean requestBonus(Employee employee, double bonus) {
        if(this.budget <=  bonus) {
            this.budget = this.budget - bonus;
            employee.bonus = bonus;
            return true;
        }

        return false;
    }

    public String getTeamStatus() {

		String strOutput = this.getEmployeeId() + " " + this.getName();
		
        if (this.employeeReported.size() == 0) {
			strOutput = strOutput + "none employee reported to.";
		}
		else {
			strOutput = strOutput + "is managing:\n";
            for (int i = 0; i < employeeReported.size(); i++) {
                Accountant acc = employeeReported.get(i);
                strOutput = strOutput + "\t" + acc.getEmployeeId() + " " + acc.getName();
            };
		}
		
		return strOutput;
    }

    public Employee getManager() {
		return null;
	}
}
