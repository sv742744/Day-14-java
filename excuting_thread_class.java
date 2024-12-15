// hello i'm Thread//
class a extends Thread{
    public void r(){
        System.out.println("hello i'm Thread");
    }
}
public class excuting_thread_class {
    public static void main(String[]args){
        a s=new a();
        s.start();
        s.r();
    }
}