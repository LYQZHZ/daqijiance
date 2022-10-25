package com.fusheng.daqijiance.controller;

public class Task1 {
    public static void main(String[] args) {
        // run in a second
        final long timeInterval = 3600000;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    // ------- code for task to run
                    System.out.println("Hello !!");
                    // ------- ends here
                    try {
                        Thread.sleep(timeInterval);
                    } catch
                    (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
