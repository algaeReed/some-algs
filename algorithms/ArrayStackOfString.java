import java.util.Iterator;
public class ArrayStackOfString{

   private int n;
   private String[] s;

   public ArrayStackOfString(){
      n = 0;
      s = new String[1];     
   }

   private void resize( int capacity){
      String[] copy = new String[capacity];
      for ( int i = 0; i < n; i++)
         copy[i] = s[i];
      s = copy;
   }

   public void push(String item){
     if ( n == s.length )
        resize(2 * s.length);
     s[n++]  = item;
   
   }
  
   public String pop (){
      String item = s[--n];
      s[n] = null;
      if ( n > 0 && n <= s.length / 4)
         resize(s.length / 2);
      return item;
   }

   public boolean isEmpty(){
     return false;
   }

   public int size(){
     return n;

   } 
   
   public Iterator<Item> iterator() {
       return new ReverseArrayIterator();
   }

   private class ReverseArrayIterator implements Iterator<Item> {
      private int i = n;
      public boolean  hasNext(){
         return i > 0;
      }
      public Item next(){
        return s[--i];
      }
      public void remove(){
      }
   }
}
