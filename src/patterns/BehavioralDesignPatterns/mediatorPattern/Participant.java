package patterns.BehavioralDesignPatterns.mediatorPattern;

public abstract class Participant {
    public abstract void sendMsg(String msg);
    public abstract void setname(String name);
    public abstract String getName();
}
