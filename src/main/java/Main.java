public class Main {
    public static void main(String[] args) {
        ThreadTask threadTask = new ThreadTask();
        System.out.println(Thread.currentThread().getName());
        threadTask.start();
        //Context Switching may occur
        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();
    }
}
