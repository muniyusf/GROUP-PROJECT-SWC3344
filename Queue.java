import java.util.LinkedList;
public class Queue
{//open class
    //declare the object of queue using LinkedList
    private LinkedList<Object> q;
    private int size;
    
    //constructor without parameter
    public Queue()
    {
        q = new LinkedList<>();
        size = 0;
    }//end of constructor
    
    //method to insert an object to the queue
    public void enqueue(Object item)
    {
        q.addLast(item);
        size++;
    }//end of enqueue
    
    //method to remove an object from the queue
    public Object dequeue()
    {
        if (!empty())
        {//open if
            size--;
            return q.removeFirst(); //remove the first element (front)
        }//close if
        else
        {//open else
            System.out.println("Queue is empty!");
            return null; //return null or throw an exception to handle empty queue case
        }//close else
    }//end of dequeue
    
    //method to test whether the queue is empty or not
    public boolean empty()
    {
        return (size == 0);
    }//end of empty
    
    //return the element at the front without removing it
    public Object front()
    {
        if (!empty())
            return q.getFirst();
        else
        {
            System.out.println("Queue is empty");
            return null; //return null or throw an exception to handle empty queue case
        }
    }
    
    //method to get the size of the queue
    public int size()
    {
        return size;
    }
}//close class