// i am new from java 8 version//
public class thread_using_lamda {
    public static void main (String[]args){
        Runnable r=()->System.out.println("i am new from java 8 version");
        Thread t=new Thread(r);
        t.start();
    }
}