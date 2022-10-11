public class ConditionalStatements {
    public static void main(String[] args) {
 //       int nrMuaj = 1;
        float temp = 36.5f;
        String tempString = String.valueOf(temp);

 //       if(nrMuaj == 1) {
 //           System.out.println("Janar!");
 //       } else if (nrMuaj==2) {
 //           System.out.println("Shkurt!");
 //       } else if (nrMuaj==3) {
 //           System.out.println("Mars!");
 //       } else {
 //           System.out.println("Ky muaj nuk ekziston!");
 //       }

        switch(tempString){
            case "36.5":
                System.out.println("January!");
                break;
            case "37.2":
                System.out.println("February!");
                break;
            case "38.2":
                System.out.println("March!");
                break;
            default:
                System.out.println("This month doesn't exist!");
        }


    }
}
