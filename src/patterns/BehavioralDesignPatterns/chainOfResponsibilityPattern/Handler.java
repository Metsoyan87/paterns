package patterns.BehavioralDesignPatterns.chainOfResponsibilityPattern;

public interface Handler {

    void handleRequest(int request);
    void setNextHandler(Handler nextHandler);
}
