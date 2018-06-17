package observer;

import entity.RssFeed;

public class SmartphoneRssReader implements Observer {

    private String deviceInfo;
    private RssFeed rssFeed;

    public SmartphoneRssReader(String deviceInfo, RssFeed rssFeed) {
        this.deviceInfo = deviceInfo;
        this.rssFeed = rssFeed;
    }

    public void update() {
        System.out.println(deviceInfo + " :: Notification: New article - " + rssFeed.getLastArticleName() + " was published!");
    }
}
