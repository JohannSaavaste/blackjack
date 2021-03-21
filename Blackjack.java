import java.util.*;

public class Blackjack {

    public static void main(String[] args) {
        String[] mastid = {"ruutu", "risti", "ärtu", "poti"};
        String[] väärtused = {"kaks", "kolm", "neli", "viis", "kuus", "seitse",
                "kaheksa", "üheksa", "kümme", "poiss", "emand", "kuningas", "äss"};

        Kaart[] algnePakk = new Kaart[52];
        int lugeja = 0;
        for (int i = 0; i < mastid.length; i++) {
            for (int j = 0; j < väärtused.length; j++) {
                String kirjeldus = mastid[i] + " " + väärtused[j];
                if (j < 9)
                    algnePakk[lugeja] = new Kaart(j+2, kirjeldus);
                else if (j == väärtused.length-1){
                    algnePakk[lugeja] = new Kaart(11, kirjeldus);
                } else {
                    algnePakk[lugeja] = new Kaart(10, kirjeldus);
                }
                lugeja++;
            }
        }
        //kontrollisin sellega kas teeb õiged kaardid:
        //Arrays.stream(algnePakk).iterator().forEachRemaining(System.out::println);

        List<Kaart> pakk = segaKaardid(algnePakk);

        Scanner input = new Scanner(System.in);
        System.out.print("Teretulemast mängu Blackjack! Alustamiseks sisesta panus: ");
        int panus = input.nextInt();
        System.out.println("Sinu panus on " + panus);

    }

    public static List<Kaart> segaKaardid(Kaart[] algnePakk) {
        List<Kaart> pakkListina = Arrays.asList(algnePakk);
        Collections.shuffle(pakkListina);
        return pakkListina;
    }

}
