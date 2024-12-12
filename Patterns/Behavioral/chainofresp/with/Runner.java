package Behavioral.chainofresp.with;

abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract String handleRequest(String problem);
}

class L1SupportEngineer extends Handler{

    @Override
    public String handleRequest(String problem) {
        if("Password Reset".equals(problem)) {
            return "L1 Support engineer will handle this";
        } else
            return nextHandler.handleRequest(problem);
    }
}

class L2SupportEngineer extends Handler{

    @Override
    public String handleRequest(String problem) {
        if("Software Install".equals(problem)) {
            return "L2 support engineer will handle this";
        }  else
            return nextHandler.handleRequest(problem);
    }
}

class NetworkEngineer extends Handler{

    @Override
    public String handleRequest(String problem) {
        if("Wifi".equals(problem)){
            return "Network engineer";
        } else
            return "Problem cannot be resolved";
    }
}

public class Runner {
    public static void main(String[] args) {
        L1SupportEngineer l1SupportEngineer = new L1SupportEngineer();
        L2SupportEngineer l2SupportEngineer = new L2SupportEngineer();
        NetworkEngineer networkEngineer = new NetworkEngineer();

        l1SupportEngineer.setNextHandler(l2SupportEngineer);
        l2SupportEngineer.setNextHandler(networkEngineer);

        System.out.println(l1SupportEngineer.handleRequest("Wifi"));

    }
}
