public class ThreadTask extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Running by " + Thread.currentThread().getName());
        }
    }
}
