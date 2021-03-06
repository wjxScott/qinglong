package com.wjx.qinglong.singleton;

/**
 * @author wangjinxin
 * @date 2021/3/10 19:55
 * @mail wjxScott@163.com
 * @description ThreadLocal实现单例
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        public ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}
