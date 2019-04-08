import java.util.*;

public class TwitchChannel implements TwitchSubject{
    Set<TwitchObserver> twitchSet;
    String subscribeType;
    String name;

    public TwitchChannel(String name, String subscribeType){
        twitchSet = new HashSet<TwitchObserver>();
        this.subscribeType = subscribeType;
        this.name = name;
    }

    @Override
    public void addObserver(TwitchObserver TO){
        twitchSet.add(TO);
    }

    @Override
    public void removeObserver(TwitchObserver TO){
        twitchSet.remove(TO);
    }

    @Override
    public void notifyUser(){
        for(TwitchObserver o : twitchSet) {
            o.updateSubscriber();
        }
    }

    public void setSubType(String newSub){
        System.out.println("Twitch Headquarters: Channel set to " + name + ".");
       // System.out.println("Twitch Headquarters: " + name + " is the " + newSub + " of the channel.");
        subscribeType = newSub;
        notifyUser();
    }

    public String getSubscribeType(){
        return subscribeType;
    }

    public Set<TwitchObserver> getTwitchSet(){
        return twitchSet;
    }


}
