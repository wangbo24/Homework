import java.util.*;

class Card{
    int rank;
    String color;

    public Card(int rank,String color){
        this.rank = rank;
        this.color = color;
    }
    @Override
    public String toString() {
        String val;
        switch (rank) {
            case 1:val = "A";
            break;
            case 11:val = "J";
            break;
            case 12:val = "Q";
            break;
            case 13:val = "K";
            break;
            default:
                val = String.valueOf(rank);
        }
        return String.format("[%s %s]",color,val);
    }
}

public class DeckDemo {
    public static final String[] color = {"♥","♦","♣","♠"};
    public static List<Card> creatCard(){
        List<Card> deck = new ArrayList<>(52);
        for(int i = 0;i < 4;i++){
            String colo = color[i];
            for(int j =1;j<=13;j++){
                Card card = new Card(j,colo);
                deck.add(card);
            }
        }
        return deck;
    }

    public static void shuffle(List<Card> deck){
        Random random;
        random = new Random();
        for(int i=deck.size()-1;i>0;i--){
            swap(deck,i,random.nextInt(i));
        }
    }
    public static void swap(List<Card> deck,int i,int j){
        Card tmp = deck.get(i);
        deck.set(i,deck.get(j));
        deck.set(j,tmp);
    }

    public static void send(List<Card> deak,List<List<Card>> persons, int numberCard,int numberPerson){
        for(int i = 0;i < numberPerson;i++){
            persons.add(new ArrayList<>());
        }
        for(int i = 0; i < numberCard; i++){
            for(int j = 0; j < numberPerson; j++){
                Card card = deak.remove(0);
                persons.get(j).add(card);
            }
        }
    }

    public static void main(String[] args) {
        List<Card> deck = creatCard();
        System.out.println(deck);
        shuffle(deck);
        System.out.println(deck);
        List<List<Card>> persons = new ArrayList<>();
        send(deck,persons,16,3);
        System.out.println(deck);
        System.out.println(persons.get(0));
        System.out.println(persons.get(1));
        System.out.println(persons.get(2));
        System.out.println(persons.get(3));
        System.out.println(persons.get(4));
    }
}
