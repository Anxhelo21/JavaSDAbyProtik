package DesignPattern.templateFactoryMethod.observer;

import DesignPattern.templateFactoryMethod.entities.ChatChannel;

public class UserObserver extends BaseObserver{
    private final String userName;

    public UserObserver(final ChatChannel chatChannel, final String userName) {
        super(chatChannel);
        this.userName = userName;
    }

    @Override
    public void handleMessage(final String message, final String userType) {
        if (!userType.equals("ADMIN")) {
            System.out.println("User Name: "+userName + ", type: "+userType+" , message: " + message+".");
        }
    }

    @Override
    public String getObserverType() {
        return "USER";
    }
}
