/*
hello i am thread
 hello i am thread
 */
class a implements Runnable{
    public void run(){
        System.out.println(" hello i am thread");
    }
}
public class implimenting_runnable_interface {
    public static void main(String[]args){
        a r=new a();
        Thread t=new Thread(r);
        t.start();
        t.run();
    }
}