package Behavioral.chainofresp.without;


class SupportTeam {
    public String handleRequest(String problem) {
        if("Password Reset".equals(problem)) {
            return "L1 Support engineer will handle this";
        } else if("Software Install".equals(problem)) {
            return "L2 support engineer will handle this";
        } else if("Wifi".equals(problem)){
            return "Network engineer";
        }
        return null;
    }
}

public class Runner {
    public static void main(String[] args) {
        SupportTeam supportTeam = new SupportTeam();
        System.out.println(supportTeam.handleRequest("Wifi"));
    }
}
