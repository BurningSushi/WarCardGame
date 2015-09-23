public class card{
   
   private int num;
   private String suit;
   
   public card(int Num, String Suit){
      num = Num;
      suit = Suit;
   }
   
   public int getNum(){return num;}
   
   public String toString(){return this.num +" of "+ this.suit;}
      
   public boolean compTo(card other){
      if(this.num > other.getNum())
         return true;
      else
         return false;
   }
}