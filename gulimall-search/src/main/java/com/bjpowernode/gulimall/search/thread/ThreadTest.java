package com.bjpowernode.gulimall.search.thread;

public class ThreadTest {

    public static void main(String[] args) {

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
