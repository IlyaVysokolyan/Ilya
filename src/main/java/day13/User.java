package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username; //имя пользователя
    private List<User> subscriptions; //подписки

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
        System.out.println(this.getUsername() + " подписался на " + user.getUsername());
    }

    public boolean isSubscribed(User user) {
        for (User sub : subscriptions) {
            if (user.equals(sub)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
