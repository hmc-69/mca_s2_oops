class Fibonacci implements Runnable {
    public void run() {
        int a=0,b=1,c;
        System.out.println("Fibonacci Series");
        for(int i=1;i<=10;i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
class Even implements Runnable {
    public void run() {
        System.out.println("Even Numbers");
        for(int i=1;i<=20;i++) {
            if(i%2==0)
                System.out.println(i);
        }
    }
}
public class RunnableDemo {
    public static void main(String args[]) {
        Fibonacci f = new Fibonacci();
        Even e = new Even();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(e);
        t1.start();
        t2.start();
    }
}
