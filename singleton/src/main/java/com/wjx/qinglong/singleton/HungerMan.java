package com.wjx.qinglong.singleton;

/**
 * @author wangjinxin
 * @date 2021/3/9 23:04
 * @mail wjxScott@163.com
 * @description 饿汉单例模式
 */
public class HungerMan {
    public static final HungerMan INSTANCE = new HungerMan();

    /**
     * 私有化防止外界new对象
     */
    private HungerMan() {
    }

    public static HungerMan getInstance() {
        return INSTANCE;
    }
}
