package com.zzz.design.model.singlton.loadbalance;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: data-analysis-service
 * @description:
 * @author: zhengzz
 * @create: 2020-06-27 14:42
 **/
public class LoadBalance {
    private static  LoadBalance loadBalance = null;
    private List<String> servers = null;


    private static  final LoadBalance hungryBlance = new LoadBalance();

    /**
     * 初始化
     */
    public LoadBalance() {
        this.servers = new ArrayList<>();
    }

    /**
     * 获取负载均衡
     * @return
     */
    public static LoadBalance getLoadBalance() throws InterruptedException {
        //Thread.sleep(50);

        if(loadBalance==null) {
            int random=(int)(Math.random()*100+1);
            Thread.sleep(random);
            loadBalance = new LoadBalance();

        }
        StringBuffer sb = new StringBuffer();
        return loadBalance;
    }

    /**
     * 添加服务器
     * @param name
     */
    public  void  addServer(String name) {
            servers.add(name);
    }

    /**
     * 删除服务器
     */
    public void removeServer() {
        servers.remove(0);
    }

    public  int getServerSize() {
        return this.servers.size();
    }

    /**
     * 饿汉模式
     * @return
     */
    public static LoadBalance getHungryBlance() throws InterruptedException {
        int random=(int)(Math.random()*100+1);
        Thread.sleep(random);
        return hungryBlance;
    }

    /**
     * 同步方法
     * @return
     * @throws InterruptedException
     */
    public static synchronized  LoadBalance getSyncInstance() throws InterruptedException {
        Thread.sleep(1000);
        if(loadBalance==null) {
            loadBalance = new LoadBalance();
        }
        return loadBalance;
    }


    /**
     * 双重检查锁
     * @return
     */
    public static LoadBalance doubleCheckSync() throws InterruptedException {
        int random=(int)(Math.random()*100+1);
        Thread.sleep(random);
        if(loadBalance == null) {
            synchronized (LoadBalance.class) {
                if(loadBalance == null) {
                    loadBalance = new LoadBalance();
                }
            }
        }
        return  loadBalance;
    }
}
