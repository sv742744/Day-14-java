/*
evaru raa miranthaa ??
anna eyy...
*/
public class thread_sleep {
    public static void main (String [] args){
        System.out.println("evaru raa miranthaa ??");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("anna nenu kiran kumar ni");
        }
        System.out.println("anna eyy...");
    }
}