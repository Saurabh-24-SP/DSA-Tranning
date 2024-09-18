//package threads;

public class Main extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }
    public static void main(String args[]) {
    (new Main()).start();
    Thread obj=new Main();
    // parent obj name=new ChildClass();
    obj.start();
    obj.run();
    }
        
    }
