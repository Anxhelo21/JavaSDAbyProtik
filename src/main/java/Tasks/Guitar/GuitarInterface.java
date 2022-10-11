package Tasks.Guitar;

public interface GuitarInterface {

    void playGuitar(Guitar[] arr);
    Integer findStringNr(Guitar[] arr) throws GuitarNotFoundException;
    void modifyString(Guitar[] arr,Integer stringNr, Integer akorda) throws OwnerNotFoundException;


}
