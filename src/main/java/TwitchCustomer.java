public class TwitchCustomer implements TwitchObserver {
    private String name;
    private TwitchChannel hq;
    private String queuedSubscriber;

    public TwitchCustomer(String name, TwitchChannel hq){
        this.name = name;
        this.hq = hq;
        this.queuedSubscriber = hq.getSubscribeType();
    }

    @Override
    public void updateSubscriber(){
        queuedSubscriber = hq.getSubscribeType();
        System.out.println(name + " just received a notification.");
        System.out.println("They are now a " + queuedSubscriber + "!");
    }
}
