import java.util.Iterator;
public class LinkedQueue<Item> implements Iterables<Item> {

  private Node first;
  private Node last;
  private int n;

  public class Node{
    Item item;
    Node next;
  }

  public LinkedQueue () {
    first = last = null;
    n = 0;
  }
 
  public boolean isEmpty() {
    return false;
  }

  public int size(){
    return 0;
  }

  public void enqueue(Item item){
     Node oldLast = last;

     last = new Node();
     last.item = item;
     
     if ( oldLast == null) 
       first  = last;
     else 
       oldLast.next = last;

     n++;
  }

  public Item dequeue (){
    Item item = first.item;

    first = first.next;
   
    if ( first == null)
      last = null;

    n--;  
    return item;

    
  } 

   public Iterator<Item> iteratir() {
       return new ListIerator;
   }

   private class ListIterator implements Iterator<Item>{
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
