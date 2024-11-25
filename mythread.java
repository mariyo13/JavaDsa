class mythread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("the sub thread is running");
            } catch (InterruptedException ex) {
            }

        }

    }

    // public static void main(String[] args) throws InterruptedException {
    // mythread mythread1 = new mythread();
    // System.out.println(mythread1.getState());
    // mythread1.start();
    // System.out.println(mythread1.getState());
    // for (int i = 0; i < 1; i++) {
    // Thread.sleep(2000);
    // System.out.println("the main thread is running");
    // System.out.println(mythread1.getState());
    // }
    // System.out.println(mythread1.getState());
    // }

}

// second way of implementing the thread
class Mythread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("sub thread ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Mythread m = new Mythread();
        Thread t1 = new Thread(m);
        t1.start();
        System.out.println(t1.getState());
        for (int i = 0; i < 10; i++) {

            System.out.println("the main thread is running");
            System.out.println(t1.getState());
            t1.join();
        }
        System.out.println(t1.getState());

    }

}
// to main method is presented be carefull