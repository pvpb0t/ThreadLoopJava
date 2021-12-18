public class thisshit {
 
    private static class Loop implements Runnable {
 
        public void run() {
 
            while(true) {
                Thread t = new Thread(new Loop());
                t.start();
            }
 
        }
 
    }
 
    public static void main(String[] args) {
 
        Loop loop = new Loop();
        Thread thread = new Thread(loop);
        thread.start();
        thread.join();
 
    }
 
}
