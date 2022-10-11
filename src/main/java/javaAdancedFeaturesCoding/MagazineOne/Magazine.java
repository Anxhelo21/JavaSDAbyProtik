package javaAdancedFeaturesCoding.MagazineOne;

import java.util.HashSet;

public class Magazine {
    Integer cartridge;

    public Magazine(Integer cartridge) {
        this.cartridge = cartridge;
    }

    public void loadBullet(Integer bullet) {
        int extraBullet = 0;
        for (int i = 1; i <= bullet; i++) {
            if (cartridge < 31) {
                cartridge++;
            }else
                extraBullet++;
        }
        if (cartridge==31){
            System.out.println("Full Magazine, "+extraBullet+" extra bullets have been returned.");
        }
    }

    public boolean isLoaded(){
        return cartridge>=1;
    }

    public void shot(){
        cartridge--;
        System.out.println("BANG!");
    }

    public void printAmount(){
        System.out.println(cartridge);
    }
}
