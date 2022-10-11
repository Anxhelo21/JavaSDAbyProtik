package javaAdancedFeaturesCoding.MagazineOne;

public class Main {
    public static void main(String[] args) {
        Magazine ak47 = new Magazine(25);
        System.out.println(ak47.isLoaded());
        ak47.loadBullet(8);
        ak47.shot();
        ak47.printAmount();
    }
}
