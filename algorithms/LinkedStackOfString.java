public class LinkedStackOfString{
  public Node first;   
   public int n;
   private class  Node{
     String item;
     Node next;
   }   

   public LinkedStackOfString(){
     first  = null;

     n = 0;
   }
   public void push(String item){
      Node oldFirst = first;
      first = new Node();
      first.item = item;
      first.next = oldFirst;
      n++;
   }
  
   public String pop (){
     String item = first.item;
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

}
