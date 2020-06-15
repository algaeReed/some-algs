import java.util.Iterator;
public class LinkedStack<Item> implements Iterable<Item> {
  public Node first;   
   public int n;
   private class  Node{
     Item item;
     Node next;
   }   

   public LinkedStack (){
     first  = null;

     n = 0;
   }
   public void push(Item item){
      Node oldFirst = first;
      first = new Node();
      first.item = item;
      first.next = oldFirst;
      n++;
   }
  
   public Item pop (){
     Item item = first.item;
     first = first.next;
     n--;
     return item;
   }

   public boolean isEmpty(){
     return first == null;
   }

   public int size(){
      return n;
   } 

   pulbic Iterator<Item> iterator(){
       return new ListIterator();
             
   }

   private class ListIterator implememts Iterator<Item>{
      private Node current = first;

      public boolean hasNext(){
         return current != null;
      
      } 
  
      public Itme next(){
         Item item = current.item;
         current = current.next;
         return item;      
      }

      public void remove(){
         
      }
   }
}
