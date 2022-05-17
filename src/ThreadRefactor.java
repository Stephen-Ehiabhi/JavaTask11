public class ThreadRefactor  implements Runnable {
    Thread thread;
    ThreadRefactor(String name) {
        thread = new Thread(this, name);
    }

    public static ThreadRefactor createAndStart(String name){
        ThreadRefactor ThreadV3 = new ThreadRefactor(name);
        ThreadV3.thread.start();
        return ThreadV3;
    }

    //starts executing a new thread
    public void run(){
        System.out.println(thread.getName()+"starts to operate");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(100);
                System.out.println(thread.getName()+"is executed , the counter value"+count);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName()+"has been interrupted");
        }
        System.out.println(thread.getName() +"finishes running");
    }
}


class MoreThreads2{

    public static void main(String[] args){
        System.out.println("The main threads starts running");
        ThreadRefactor Thread1= ThreadRefactor.createAndStart("Child thread #1");
        ThreadRefactor Thread2= ThreadRefactor.createAndStart("Child thread #2");
        ThreadRefactor Thread3= ThreadRefactor.createAndStart("Child thread #3");
        System.out.print(".");

        try{
            Thread1.thread.join();
            Thread2.thread.join();
            Thread3.thread.join();
        }
        catch (InterruptedException e) {
            System.out.println("The Threads thread has been terminated");
        }

        System.out.println("The main thread is exiting");
    }
}