package com.wjx.qinglong.singleton;

/**
 * @author wangjinxin
 * @date 2021/3/9 23:31
 * @mail wjxScott@163.com
 * @description 静态内部类单例模式
 */
public class InnerClassSingletonMode {

    private InnerClassSingletonMode() {
    }


    public static class SingletonModeHolder {
        private static final InnerClassSingletonMode INSTANCE = new InnerClassSingletonMode();
    }

    public static InnerClassSingletonMode getInstance() {
        return SingletonModeHolder.INSTANCE;
    }
}
