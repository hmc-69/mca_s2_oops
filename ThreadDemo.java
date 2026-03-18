class Table extends Thread {
    public void run() {
        for(int i=1;i<=10;i++)
            System.out.println("5 x " + i + " = " + (5*i));
    }
}
class Prime extends Thread {
    int n;

    Prime(int n) {
        this.n = n;
    }
    public void run() {
        int count=0,num=2;

        while(count<n) {
            int flag=0;

            for(int i=2;i<=num/2;i++) {
                if(num%i==0) {
                    flag=1;
                    break;
                }
            }

            if(flag==0) {
                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}
public class ThreadDemo {
    public static void main(String args[]) {

        Table t1 = new Table();
        Prime t2 = new Prime(5);

        t1.start();
        t2.start();
    }
}
