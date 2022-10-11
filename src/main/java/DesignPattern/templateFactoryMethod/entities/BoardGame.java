package DesignPattern.templateFactoryMethod.entities;

import DesignPattern.templateFactoryMethod.Interface.Game;

public class BoardGame implements Game {
    protected String name;
    protected String type;
    protected int maxNumOfPlayers;

    public BoardGame(String name, String type, int maxNumOfPlayers) {
        this.name = name;
        this.type = type;
        this.maxNumOfPlayers = maxNumOfPlayers;
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
        return 2;
    }

    @Override
    public boolean isOnlineGame() {
        return false;
    }
}
