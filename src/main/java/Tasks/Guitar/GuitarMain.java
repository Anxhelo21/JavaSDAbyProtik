package Tasks.Guitar;

public class GuitarMain {
    public static void main(String[] args) {

        Guitar[] arr = new Guitar[3];
        arr[0] = new Guitar(GuitarType.ELEKTRONIKE, 3, "Mirsona", 10);
        arr[1] = new Guitar(GuitarType.AKUSTIKE, 5, "Laver Bariut", 8);
        arr[2] = new Guitar(GuitarType.KLASIKE, 7, "MICHAEL Jackson", 9);

        GuitarImplementation nxt = new GuitarImplementation();
//        nxt.playGuitar(arr);
        try {
            System.out.println(nxt.findStringNr(arr));
        } catch (GuitarNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Good?");

        try {
            nxt.modifyString(arr, 7, 49);
        } catch (OwnerNotFoundException e) {
            e.printStackTrace();
        }


    }
}
