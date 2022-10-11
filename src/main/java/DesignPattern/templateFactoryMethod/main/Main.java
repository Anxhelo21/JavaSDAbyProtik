package DesignPattern.templateFactoryMethod.main;

import DesignPattern.templateFactoryMethod.Interface.Pizza;
import DesignPattern.templateFactoryMethod.decorator.Cheese;
import DesignPattern.templateFactoryMethod.decorator.Ham;
import DesignPattern.templateFactoryMethod.decorator.Mushroom;
import DesignPattern.templateFactoryMethod.entities.ChatChannel;
import DesignPattern.templateFactoryMethod.entities.Margarita;
import DesignPattern.templateFactoryMethod.observer.AdminObserver;
import DesignPattern.templateFactoryMethod.observer.BaseObserver;
import DesignPattern.templateFactoryMethod.observer.UserObserver;

public class Main {
    public static void main(String[] args) {
        final ChatChannel chatChannel = new ChatChannel("sda-chat");

        BaseObserver userA = new UserObserver(chatChannel, "andrew");
        BaseObserver userB = new UserObserver(chatChannel, "ala");
        BaseObserver adminA = new AdminObserver(chatChannel, "john");
        BaseObserver adminB = new AdminObserver(chatChannel, "ann");

        userA.sendMessage("Hello all");
        userB.sendMessage("Hi Andrew");
        adminA.sendMessage("ann they can't see what we write");
        adminB.sendMessage("Yes I know");
//        Pizza pizza = new Ham(new Mushroom(new Cheese(new Margarita())));
//        System.out.println(pizza.getName() +" " +pizza.getPrice());


//        Pupil pupil = new Pupil(
//                "Aris",
//                "Mamo",
//                "amamo@gmail.com",
//                38,
//                Arrays.asList(10,6,8));
//
//        Student st = new PupilAdapter(pupil);
//        System.out.println(st.getFullName());


//        GameFactory factory = FactoryUtility.getGameByType("PC");
//        System.out.println(factory.create().getName());
    }
}
