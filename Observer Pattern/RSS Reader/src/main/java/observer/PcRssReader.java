package observer;

import entity.RssFeed;
import observee.Observee;

public class PcRssReader implements Observer {

    private String deviceInfo;
    private RssFeed rssFeed;

    public PcRssReader(String deviceInfo, RssFeed rssFeed) {
        this.deviceInfo = deviceInfo;
        this.rssFeed = rssFeed;
    }

    public void update() {
        System.out.println(deviceInfo + " :: New article: " + rssFeed.getLastArticleName() + " is up! Go and read it!");
    }
}
