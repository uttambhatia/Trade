package com.cs.rms;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;

public class LoadTestRunner {

    public static void main(String[] args) throws Exception {

        int user = 500;
        Callable<Integer> task = () -> {
           return RemoteService.getServiceInfo();
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        List<Callable<Integer>> tasks = new ArrayList<>();

        for(int i = 0; i< user;i++)
            tasks.add(task);


        executor.invokeAll(tasks).stream().map(future -> {
            try {
                return future.get();
            }
            catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }).forEach(System.out::println);;

    }

}

 class ReminderBeep {

    Toolkit toolkit;
    Timer timer;
    //...
    public ReminderBeep(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }
    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            toolkit.beep();
            //timer.cancel(); // Not necessary because
            // we call System.exit
            System.exit(0);   // Stops the AWT thread
            // (and everything else)
        }
    }
    //...
}