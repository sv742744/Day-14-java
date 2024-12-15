/*
false
true
i am new from java 8 version
*/
class isalive {
    public static void main(String[]args){
        Runnable r=()->System.out.println("i am new from java 8 version");
        Thread t = new Thread(r);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        
    }
}