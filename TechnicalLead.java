import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    int headCount = 4;
    ArrayList<SoftwareEngineer> employeeReported = new ArrayList<>();
    Accountant acc;

    public TechnicalLead(String name) {
        super(name);
        this.salary = this.techSalary * 1.3;
    }

    public boolean hasHeadCount() {
        return employeeReported.size() < this.headCount;
    }

    public boolean addReport(SoftwareEngineer softEng) {
        if (this.hasHeadCount()) {
            employeeReported.add(softEng);
            return true;
        }

        return false;
    }

    public boolean approveCheckIn(SoftwareEngineer softEng) {
        if ((softEng.getManager().employeeId == this.employeeId) && softEng.getCodeAccess()) {
            return true;
        }

        return false;
    }

    public boolean requestBonus(Employee employee, double bonus) {
        
        if(this.acc.approveBonus(bonus)) {
            employee.bonus = bonus;
            return true;
        }

        return false;
    }

    public String getTeamStatus() {

		String strOutput = this.getEmployeeId() + " " + this.getName() + " has " + this.checkIns + " successful check ins and ";
		
        if (this.employeeReported.size() == 0) {
			strOutput = strOutput + "none employee reported to.";
		}
		else {
			strOutput = strOutput + "is managing:\n";
            for (int i = 0; i < employeeReported.size(); i++) {
                SoftwareEngineer se = employeeReported.get(i);
                strOutput = strOutput + "\t" + se.getEmployeeId() + " " + se.getName()+" has " + se.checkIns + " successful check ins. \n";
            };
		}
		
		return strOutput;
    }

    public Employee getManager() {
		return null;
	}
}
