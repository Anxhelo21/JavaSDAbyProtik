package DesignPattern.templateFactoryMethod.factory;

import DesignPattern.templateFactoryMethod.entities.BoardGame;
import DesignPattern.templateFactoryMethod.Interface.Game;
import DesignPattern.templateFactoryMethod.Interface.GameFactory;

public class MonopolyGameCreator implements GameFactory {

    @Override
    public Game create() {
        return new BoardGame(
                "Monopoly",
                "Luck",
                8);
    }
}
