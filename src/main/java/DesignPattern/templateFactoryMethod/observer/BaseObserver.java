package DesignPattern.templateFactoryMethod.observer;

import DesignPattern.templateFactoryMethod.entities.ChatChannel;

public abstract class BaseObserver {
    protected final ChatChannel channel;

    public BaseObserver(final ChatChannel chatChannel) {
        this.channel = chatChannel;
        this.channel.subscribe(this);
    }

    public abstract void handleMessage(String message, String userType);

    public abstract String getObserverType();

    public void sendMessage(final String message) {
        channel.sendMessage(message, getObserverType());
    }
}
