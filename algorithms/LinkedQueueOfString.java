public class LinkedQueueOfString {
  private Node first;
  private Node last;
  private int n;

  public class Node{
    String item;
    Node next;
  }

  public LinkedQueueOfString() {
    first = last = null;
    n = 0;
  }
 
  public boolean isEmpty() {
    return false;
  }

  public int size(){
    return 0;
  }

  public void enqueue(String item){
     Node oldLast = last;

     last = new Node();
     last.item = item;
     
     if ( oldLast == null) 
       first  = last;
     else 
       oldLast.next = last;

     n++;
  }

  public String dequeue (){
    String item = first.item;

    first = first.next;
   
    if ( first == null)
      last = null;

    n--;  
    return item;

    
  } 


} 
