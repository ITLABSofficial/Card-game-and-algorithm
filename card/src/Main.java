import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean start = true;
        Scanner scan = new Scanner(System.in);

        while (start) {
            String cardtypes[] = {"Apades", "Hearts", "Diamonds", "Clubs"};
            String cardNumber[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "R", "K"};
            int deck[] = new int[52];


            //System.out.println(total(seedeck( cardtypes, cardNumber)));
            computing(total(seedeck( cardtypes, cardNumber)),start);

            boolea(start);

            System.out.println("you wanna one more game? 'if you want one more ' press any number, 'no thanks ' press 4");
            int moore= scan.nextInt();
            if(moore==4){
                start=false;
            }

        }

        scan.close();
    }

    public static boolean boolea(boolean start) {
        return false;
    }

    public static void computing(int total, boolean start) {
        start=true;
        System.out.println(total);
        if(total==21){
            System.out.println("You win ");
            start=false;
        }
        else if (total>21){
            System.out.println("you lost, try again ");
            start=false;
        }
        else{
            System.out.println("wanna one more card?");

        }
        boolea(start);
    }

    public static int  total(int []random_card_number) {
        Scanner scan=new Scanner(System.in);
        int total=0;
        for(int i=0;i<3;i++){
            if(random_card_number[i]>=9){
                random_card_number[i]=10;
                total=random_card_number[i]+total;
            } else if (random_card_number[i]==0) {
                System.out.println("1 or 11");
                int select= scan.nextInt();
                random_card_number[i]= select;
                total=random_card_number[i]+total;
            }
            else {
                total=random_card_number[i]+total+1;
            }

        }


        return total;

















       /* total=random_card_number+total;
        if(random_card_number>=9){
            random_card_number=10;
            total=total+random_card_number;
        }
        else if(random_card_number == 0){
            System.out.println("1 or 11");
            int select=scan.nextInt();
            random_card_number=select;
            total=total+random_card_number;

        }
        System.out.println(total+"  total");
        return total; */
    }

    private static void shuffledeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int temp = deck[i];
            int randomnumber = (int) (Math.random() * 52);
            deck[i] = deck[randomnumber];
            deck[randomnumber] = temp;
        }
    }

    public static int []seedeck(String[] cardtypes, String[] cardNumber) {
        int random_card_number=0;
        int acsses[]=new int [3];
        for(int i =0;i<3;i++){
            int random_card_type_number = (int) (Math.random()*4 );
            String cardtype = cardtypes[random_card_type_number];
            random_card_number = (int) (Math.random() * 13);
            String cardnumber = cardNumber[random_card_number];
            acsses[i]=random_card_number;
            System.out.println(cardtype + " " + cardnumber);

        }
        return acsses;

    }

    private static void seedeckonemore(int[] deck, String[] cardtypes, String[] cardNumber) {
        int random_card_type_number = (int) (Math.random() * 4);
        String cardtype = cardtypes[random_card_type_number];
        int random_card_number = (int) (Math.random() * 13);
        String cardnumber = cardNumber[random_card_number];
        System.out.println(cardtype + " " + cardnumber);
    }

    private static void makedeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }
}
