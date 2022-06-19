public class Q45Color {

    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";
    public static void main(String[] args) {
        Q45Color c=new Q45Color();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                c.printRed();

            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                c.printGreen();

            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                c.printYellow();

            }
        });
        t1.start();
        t2.start();
        t3.start();


    }
    public static void printRed(){

        System.out.println(RED+"Red");
    }
    public static  void printGreen()
    {
        System.out.println(GREEN+"Green");
    }
    public static void printYellow()
    {
        System.out.println(YELLOW+"Yellow");
    }
}