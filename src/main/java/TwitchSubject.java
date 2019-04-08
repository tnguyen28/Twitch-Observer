public interface TwitchSubject {
    public void addObserver(TwitchObserver TO);
    public void removeObserver(TwitchObserver TO);
    public void notifyUser();
}
