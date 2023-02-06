package patterns.BehavioralDesignPatterns.chainOfResponsibilityPattern;

public class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("Request handled by ConcreteHandler1");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
