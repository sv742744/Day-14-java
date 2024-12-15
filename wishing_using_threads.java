class wishing_using_threads{
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("Good Morning");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Afternoon");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Evening");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
/*
Good Morning
Good Afternoon
Good Evening
.
.
.
.
.
.
.
*/