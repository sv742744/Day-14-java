class TBA implements Runnable{
    int avt=5;
    public void run()
    {
        String name = Thread.currentThread().getName();
        synchronized(this)
        {   
            System.out.println();
            System.out.println(name+" you are trying to book the ticket for PUSHPA 2");
            if(avt>0)
            {
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e)
                {
                    System.out.println(name+" "+e);
                }
                avt--;
                System.out.println("    "+name+" Your ticket is booked for PUSHPA 2");
            }else{
                System.out.println("    404 error  "+name+" sorry go and ask to sumanth ");
        }
    }
}
}
class book_my_show{
    public static void main(String args[])
    {
        TBA g = new TBA();
        Thread t1 = new Thread(g,"shashi");
        Thread t2 = new Thread(g,"Sumanth");
        Thread t3 = new Thread(g,"jeevan");
        Thread t4 = new Thread(g,"manoj");
        Thread t5 = new Thread(g,"likith");
        Thread t6 = new Thread(g,"akshya");
        Thread t7 = new Thread(g,"chaitra");
        Thread t8 = new Thread(g,"malleswari");
        Thread t9 = new Thread(g,"anushaaaaa");
        Thread t10 = new Thread(g,"usuuuuuuuuuuu");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
/*
shashi you are trying to book the ticket for PUSHPA 2
    shashi Your ticket is booked for PUSHPA 2

usuuuuuuuuuuu you are trying to book the ticket for PUSHPA 2
    usuuuuuuuuuuu Your ticket is booked for PUSHPA 2

anushaaaaa you are trying to book the ticket for PUSHPA 2
    anushaaaaa Your ticket is booked for PUSHPA 2

malleswari you are trying to book the ticket for PUSHPA 2
    malleswari Your ticket is booked for PUSHPA 2

chaitra you are trying to book the ticket for PUSHPA 2
    chaitra Your ticket is booked for PUSHPA 2

akshya you are trying to book the ticket for PUSHPA 2
    404 error  akshya sorry go and ask to sumanth

likith you are trying to book the ticket for PUSHPA 2
    404 error  likith sorry go and ask to sumanth

manoj you are trying to book the ticket for PUSHPA 2
    404 error  manoj sorry go and ask to sumanth

Sumanth you are trying to book the ticket for PUSHPA 2
    404 error  Sumanth sorry go and ask to sumanth

jeevan you are trying to book the ticket for PUSHPA 2
    404 error  jeevan sorry go and ask to sumanth
    */