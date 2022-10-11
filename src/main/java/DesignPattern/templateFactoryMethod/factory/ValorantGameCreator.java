package DesignPattern.templateFactoryMethod.factory;

import DesignPattern.templateFactoryMethod.entities.PCGame;
import DesignPattern.templateFactoryMethod.Interface.Game;
import DesignPattern.templateFactoryMethod.Interface.GameFactory;

public class ValorantGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new PCGame(
                "Valorant",
                "FPS",
                4,
                10,
                true);
    }
}
