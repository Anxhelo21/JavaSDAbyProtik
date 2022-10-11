package Tasks.Guitar;

public class GuitarImplementation implements GuitarInterface     {

    @Override
    public void playGuitar(Guitar[] arr) {
        for (Guitar e: arr) {
            System.out.printf("Guitar is playing! - "+e.getOwner());
        }
    }

    @Override
    public Integer findStringNr(Guitar[] arr) throws GuitarNotFoundException {
        for (Guitar e:arr
             ) {
            if (e.getType().equals(GuitarType.ELEKTRONIKE))
                return e.getStringNr();
            }
        throw new GuitarNotFoundException();
    }

//    @Override
//    public Integer findStringNrAgain(Guitar arr[]) {
//        for (int i = 0; i< arr.length; i++){
//            if(arr[i].getType().equals(GuitarType.ELEKTRONIKE));
//            return arr[i].getStringNr();
//        }
//        return null;
//    }

    @Override
    public void modifyString(Guitar[] arr, Integer stringNr, Integer akorda) throws OwnerNotFoundException {
        for (Guitar e:arr) {
            if (e.getOwner().equals("Laver Bariu")){
                e.setStringNr(stringNr);
                e.setAkorda(akorda);
                System.out.println(e.getAkorda());
                System.out.println(e.getStringNr());
            }
        }
        throw new OwnerNotFoundException();
    }
}
