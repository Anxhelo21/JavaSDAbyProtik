package DesignPattern.templateFactoryMethod.observer;

import DesignPattern.templateFactoryMethod.entities.ChatChannel;

public class AdminObserver extends BaseObserver{
    private final String adminName;

    public AdminObserver(final ChatChannel chatChannel, final String adminName) {
        super(chatChannel);
        this.adminName = adminName;
    }

    @Override
    public void handleMessage(final String message, final String userType) {
        System.out.println("User Name: "+adminName + ", type: "+userType+" , message: " + message+".");
    }

    @Override
    public String getObserverType() {
        return "ADMIN";
    }
}
