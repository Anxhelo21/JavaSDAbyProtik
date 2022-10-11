package DesignPattern.templateFactoryMethod.factory;

import DesignPattern.templateFactoryMethod.Interface.GameFactory;

public class FactoryUtility {
    public static GameFactory getGameByType(String type){
        if ("PC".equals(type)){
            return new ValorantGameCreator();
        } else if ("Board".equals(type)){
            return new MonopolyGameCreator();
        }
        throw new RuntimeException(String.format("Type: %s not supported", type));
    }
}
