class Queue
{
    int n;
    boolean valueSet = false;
    synchronized int getItem()
    {
	 
         while(!valueSet)
	{
	    
	    try
	    {
		wait();
	    }
	    catch(InterruptedException e)
	    {
		System.out.println("InterruptedException caught");
	    }
	}
	System.out.println("Consumed:" +n);
	System.out.println("Consumer is waiting.");
        valueSet = false;
	
	try 
	{
	    Thread.sleep(1000);
	} 
	catch (InterruptedException e)
	{
	    System.out.println("InterruptedException caught");
	}
	notify();
	return n;
    }
    synchronized void putItem(int n) 
    {
	
	while (valueSet)
	    
	    try 
	    {
		wait();
	    }
	    catch (InterruptedException e)
	    {
		System.out.println("InterruptedException caught");
	    }
	this.n = n;
	valueSet = true;
	
	System.out.println("Produced: " +n);
	System.out.println("Producer is waiting.");
	try 
	{
	    Thread.sleep(1000);
	}
	catch (InterruptedException e)
	{
	    System.out.println("InterruptedException caught");
	}
	notify();
    }
}
class Producer implements Runnable
{
    Queue itemQueue;
    Producer(Queue itemQueue)
    {
	this.itemQueue = itemQueue;
	new Thread(this, "Producer").start();
    }
    public void run() 
    {
	int i = 0;
	while(true) 
	{
	    itemQueue.putItem(i++);
	}
    }
}
class Consumer implements Runnable
{
    Queue itemQueue;
    Consumer(Queue itemQueue)
    {
        this.itemQueue = itemQueue;
	new Thread(this, "Consumer").start();
    }
    public void run() 
    {
	while(true) 
	{
	    itemQueue.getItem();
	}
    }
}
class ProducerConsumer
{
    public static void main(String args[])
    {
	Queue itemQueue = new Queue();
	new Producer(itemQueue);
	new Consumer(itemQueue);
    }
}