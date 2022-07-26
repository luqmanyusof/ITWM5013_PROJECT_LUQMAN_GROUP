public class SoftwareEngineer extends TechnicalEmployee {
    boolean codeAccess;
    TechnicalLead manager;

    public SoftwareEngineer(String name) {
        super(name);
    }

    public boolean getCodeAccess() {
        return this.codeAccess;
    }

    public void setCodeAccess(boolean access) {
        this.codeAccess = access;
    }

    public int getSuccessfulCheckIns() {
        return this.checkIns;
    }

    public Employee getManager() {
		return this.manager;
	}
}