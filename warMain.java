import java.util.*;

public class warMain{
   
   private static ArrayList<card> deck = new ArrayList<card>();
   private static ArrayList<card> p1 = new ArrayList<card>();
   private static ArrayList<card> p2 = new ArrayList<card>();
   private static Random rand = new Random(deck.size()); //rand.nextInt()
   
   public static void main(String[] args){
      compileDeck();
      dealHands();
      printHands();
   }
   
   private static void compileDeck(){
      int count = 5;
      while(count < 10){
         count ++;
         deck.add(new card(count,"Hearts"));
         deck.add(new card(count,"Spades"));
         deck.add(new card(count,"Clubs"));
         deck.add(new card(count,"Dimonds"));
      }
   }
   
   public static void dealHands(){
      int count = 0;
      while(count < 1){
         p1.add(deck.remove(rand.nextInt()));
         p2.add(deck.remove(rand.nextInt()));
         count++;
      }
   }
   
   public static void printHands(){
      System.out.println("Player 1              Player 2");
      int count = 0;
      while(count < 12){
         System.out.println(p1.get(count).toString() +"                 "+ p2.get(count).toString());
      }
   }
}