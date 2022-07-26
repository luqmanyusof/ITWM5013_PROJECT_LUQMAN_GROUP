public class Main {
    public static void main(String[] args) {
        System.out.println("Program started...");

        TechnicalLead CTO = new TechnicalLead("Yusof");
        System.out.println(CTO.getTeamStatus());

        SoftwareEngineer se1 = new SoftwareEngineer("Hakim");
        System.out.println(se1.toString());

        SoftwareEngineer se2 = new SoftwareEngineer("Luqman");
        System.out.println(se2.toString());

        CTO.addReport(se1);
        CTO.addReport(se2);
        System.out.println(CTO.getTeamStatus());

        Accountant ac1 = new Accountant("Fathin");
        ac1.supportTeam(CTO);
        System.out.println(ac1.employeeStatus());
    }
}