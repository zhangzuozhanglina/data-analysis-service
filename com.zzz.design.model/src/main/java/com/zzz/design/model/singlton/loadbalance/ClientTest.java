package com.zzz.design.model.singlton.loadbalance;

import org.junit.jupiter.api.Test;

/**
 * @program: data-analysis-service
 * @description:
 * @author: zhengzz
 * @create: 2020-06-27 14:50
 **/
public class ClientTest {
    /**
     * 单例测试
     */
    @Test
    public void testLoadBalance() throws InterruptedException {
        LoadBalance l1,l2,l3;
        l1=LoadBalance.getLoadBalance();
        l2=LoadBalance.getLoadBalance();
        l3=LoadBalance.getLoadBalance();

        System.out.println(l1==l2 && l2==l3 && l1==l3);

        l1.addServer("1");
        l2.addServer("2");
        l3.addServer("3");
        System.out.println(l1.getServerSize());
        System.out.println(l2.getServerSize());
        System.out.println(l3.getServerSize());
        l1.removeServer();

        System.out.println(l1.getServerSize());
        System.out.println(l2.getServerSize());
        System.out.println(l3.getServerSize());

    }

    /**
     *
     */
    @Test
    public void testNoSafeLoadBalance() {
       ClientThread[] threads = new ClientThread[1000];
       for (int i=0;i<threads.length;i++) {
           threads[i] = new ClientThread();
       }
        for (ClientThread thread:threads) {
            thread.start();
            //thread.run();
        }
    }

    @Test
    public void testHungrySafeLoadBalance() throws InterruptedException {
        HungryClientThread[] threads = new HungryClientThread[100];
        for (int i=0;i<threads.length;i++) {
            threads[i] = new HungryClientThread();
        }
        for (HungryClientThread thread:threads) {
            thread.run();
        }
        Thread.currentThread().join(5000);
    }

    @Test
    public void testSyncSafeLoadBalance() throws InterruptedException {
        SyncClientThread[] threads = new SyncClientThread[100];
        for (int i=0;i<threads.length;i++) {
            threads[i] = new SyncClientThread();
        }
        long start= System.currentTimeMillis();
        for (int i=0;i<threads.length;i++) {
            threads[i].run();
        }
        long end= System.currentTimeMillis();
        System.out.println("线程耗时"+(end-start));
    }

    /**
     * 双重检查锁测试
     * @throws InterruptedException
     */
    @Test
    public void testDoubleCheckSafeLoadBalance() throws InterruptedException {
        DoubleCheckClientThread[] threads = new DoubleCheckClientThread[100];
        for (int i=0;i<threads.length;i++) {
            threads[i] = new DoubleCheckClientThread();
        }
        long start= System.currentTimeMillis();
        for (int i=0;i<threads.length;i++) {
            threads[i].run();
        }
        long end= System.currentTimeMillis();
        System.out.println("线程耗时"+(end-start));
    }
}

class ClientThread  extends  Thread {
    @Override
    public void run() {
        LoadBalance l= null;
        try {
            l = LoadBalance.getLoadBalance();
            System.out.println(l.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class HungryClientThread  extends  Thread {
    @Override
    public void run() {
        LoadBalance l= null;
        try {
            l = LoadBalance.getHungryBlance();
            System.out.println(l.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

class SyncClientThread  extends  Thread {
    @Override
    public void run() {
        LoadBalance l= null;
        try {
            l = LoadBalance.getSyncInstance();
            System.out.println(l.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}


/**
 * 双重检查锁线程
 */
class DoubleCheckClientThread  extends  Thread {
    @Override
    public void run() {
        LoadBalance l= null;
        try {
            l = LoadBalance.doubleCheckSync();
            System.out.println(l.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

