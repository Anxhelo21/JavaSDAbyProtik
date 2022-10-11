package DesignPattern.templateFactoryMethod.entities;

import DesignPattern.templateFactoryMethod.Interface.Game;

public class PCGame implements Game {

    protected String name;
    protected String type;
    protected int maxNumOfPlayers;
    protected int minNumOfPlayers;
    protected boolean online;

    public PCGame(String name,
                  String type,
                  int maxNumOfPlayers,
                  int minNumOfPlayers,
                  boolean online) {
        this.name = name;
        this.type = type;
        this.maxNumOfPlayers = maxNumOfPlayers;
        this.minNumOfPlayers = minNumOfPlayers;
        this.online = online;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMaxNumOfPlayers() {
        return maxNumOfPlayers;
    }

    @Override
    public int getMinNumOfPlayers() {
        return minNumOfPlayers;
    }

    @Override
    public boolean isOnlineGame() {
        return online;
    }
}
