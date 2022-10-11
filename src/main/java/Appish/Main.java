package Appish;

public class Main {
    public static void main(String[] args) {
        Poem poem1 = new Poem();
        Author author1 = new Author("Ibsen", "Norwegian");
        poem1.setCreator(author1);
        poem1.setStropheNumbers(10);

        Author author2 = new Author("Vlad", "Russian");
        Poem poem2 = new Poem(author2, 15);

        Poem poem3 = new Poem(new Author("Grubber", "German"), 4);

        Poem[] poems = new Poem[3];

        poems[0] = poem1;
        poems[1] = poem2;
        poems[2] = poem3;

        System.out.println("Winner, winner, chicken-dinner: "+findSurname(poems));

    }

    private static String findSurname(Poem[] poems) {
        String surname = "";
        int longestPoem = poems[0].getStropheNumbers();
        int index = 0;
        for(int i=1; i < poems.length; i++) {
            if(longestPoem < poems[i].getStropheNumbers()) {
                index = i;
                longestPoem = poems[i].getStropheNumbers();
            }
        }
        surname = poems[index].getCreator().getSurname();
        return surname;
    }
}
