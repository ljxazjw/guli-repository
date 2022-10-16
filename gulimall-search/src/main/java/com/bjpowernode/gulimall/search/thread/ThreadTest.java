package com.bjpowernode.gulimall.search.thread;

import java.util.concurrent.*;

public class ThreadTest {
    public static ExecutorService executor = Executors.newFixedThreadPool(10);


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("main.....start..... ");
//        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
//            System.out.println("当前线程" + Thread.currentThread().getId());
//            int i = 10 / 2;
//            System.out.println("运行结果=" + i);
////        }, executor);
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("当前线程" + Thread.currentThread().getId());
//            int i = 10 / 0;
//            System.out.println("运行结果=" + i);
//            return i;
//        }, executor).whenComplete((res,exception)->{
//            System.out.println("异步任务完成了.....,结果是：" + res + "异常是" + exception);
//            //可以得到异常信息，但是没法修改返回的数据
//        }).exceptionally(throwable ->{
//            //可以感知异常并且返回默认值
//            return 10;
//        });
//        Integer integer = future.get();
//        System.out.println("main.....end....." + integer);

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程" + Thread.currentThread().getId());
            int i = 10 / 4;
            System.out.println("运行结果=" + i);
            return i;
        }, executor).thenRunAsync(()-> {
            System.out.println("任务2启动了");
        },executor);
//        Integer integer = future.get();
        System.out.println("main.....end....." );
    }

    public  void thread(String[] args) {

        System.out.println("main.....start..... ");
        /**
         * 1、继承thread
         * 2、实现Runnable接口
         * 3、实现Callable接口 + FutureTask （可以拿到返回结果，处理异常）
         * 4、线程池水
         */

        Thread01 thread01 = new Thread01();
        thread01.start();
        System.out.println("main.....end.....");

    }
    public static class Thread01 extends Thread{
        public void run(){
            System.out.println("当前线程" + Thread.currentThread().getId());
            int i = 10 / 2;
            System.out.println("运行结果=" + i);
        }
    }
}
