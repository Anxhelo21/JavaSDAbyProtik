package javaAdancedFeaturesCoding.HashSetEx;

public class Main {
    public static void main(String[] args) {
        SDAHashSet<String> Sda = new SDAHashSet<>();
        Sda.add("Car");
        Sda.add("Train");
        Sda.add("Dumbo");
        Sda.remove("Train");
        System.out.println(Sda.contains("Dumbo"));
        System.out.println(Sda.size());
        Sda.printValues();
        Sda.clear();
        Sda.printValues();

    }
}
