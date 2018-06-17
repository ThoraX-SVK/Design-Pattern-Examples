package entity;

import observee.Observee;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class RssFeed {

    private Observee observee;
    private List<String> articles = new ArrayList<>();

    public RssFeed(Observee observee) {
        this.observee = observee;
    }

    public void publishToFeed(String article) {
        articles.add(article);
        observee.notifyObservers();
    }

    public void subscribeToRssChannel(Observer observer) {
        observee.add(observer);
    }

    public void unsubscribeFromRssChannel(Observer observer) {
        observee.remove(observer);
    }

    public String getLastArticleName() {
        return articles.get(articles.size() - 1);
    }
}
