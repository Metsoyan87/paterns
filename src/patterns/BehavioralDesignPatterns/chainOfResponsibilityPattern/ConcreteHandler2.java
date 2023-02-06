package patterns.BehavioralDesignPatterns.chainOfResponsibilityPattern;

public class ConcreteHandler2 implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("Request handled by ConcreteHandler2");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
