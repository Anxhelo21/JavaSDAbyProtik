package DesignPattern.templateFactoryMethod.Interface;

public interface Game {
    String getName();
    String getType();
    int getMaxNumOfPlayers();
    int getMinNumOfPlayers();
    boolean isOnlineGame();
}
