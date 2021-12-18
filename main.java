public class UseAllCycles {
 
    private static class Cycler implements Runnable {
 
        public void run() {
 
            while(true) {
                Thread t = new Thread(new Cycler());
                t.start();
            }
 
        }
 
    }
 
    public static void main(String[] args) {
 
        Cycler cycler = new Cycler();
        Thread thread = new Thread(cycler);
        thread.start();
        thread.join();
 
    }
 
}
