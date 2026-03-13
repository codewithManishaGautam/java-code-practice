class MyThread extends Thread
{
    public void run()
    {
        for(int i=1; i<=5;i++)
        System.out.println("Hello" + i);
    }
}
class ThreadTest
{
    public static void main( String[] args)
    {
        MyThread t = new MyThread();
        System.out.println(t);  // display thread information
        t.start();
    }
}
