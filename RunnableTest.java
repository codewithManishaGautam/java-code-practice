class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5;i++)
        System.out.println("Hello" + i);
    }
}
class RunnableTest
{
    public static void main(String[] args)
    {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        System.out.println(t); // display thread information
        t.start();
    }
}