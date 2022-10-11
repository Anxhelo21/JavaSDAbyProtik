package DesignPattern.Singleton;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Weapon weapon = new Weapon.WeaponBuilder()
                .name("Nice to meet ya")
                .damage(13)
                .durability(5)
                .build();

        Weapon weapon1 = new Weapon.WeaponBuilder()
                .name("AK-47")
                .durability(21)
                .build();
        System.out.println(weapon.toString());
        //        Thread thread1 =new Thread (() -> {
//            LazySimpleCounter counter = LazySimpleCounter.getInstance();
//            counter.increment();
//            System.out.println("From thread 1: -> "+counter.toString());
//        });
//
//        Thread thread2 = new Thread (() -> {
//            LazySimpleCounter counter = LazySimpleCounter.getInstance();
//            counter.increment();
//            System.out.println("From thread 2: -> "+counter.toString());
//        });
//
//        thread1.start();
//        thread2.start();

//        LazySimpleCounter counter = LazySimpleCounter.getInstance();
//        System.out.println("From Main -> "+counter.toString());

//        List<Integer> data = Arrays.asList(1, 3, 5, 10);
//        data.stream()
//                .filter((o) -> o == 5)
//                .collect(Collectors.toList());
////        User user = new StudentEntity();
//        User user = new User() {
//            @Override
//            public String getname() {
//                return "Aris";
//            }
//        };
//
//        User user2 = () ->
//        {
//            return "Armend";
//        };
//
//        User user3 = () ->"Armend";
//
//        System.out.println(user.getname());
//        System.out.println(user2.getname());
//        System.out.println(user3.getname());
    }
}
