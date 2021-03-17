package com.wjx.qinglong.singleton;

/**
 * @author wangjinxin
 * @date 2021/3/9 23:23
 * @mail wjxScott@163.com
 * @description 双重锁检查
 */
public class DCLMode {

    private static volatile DCLMode INSTANCE;

    private DCLMode() {
    }

    public static DCLMode getInstance() {
        if (INSTANCE == null) {
            synchronized (DCLMode.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DCLMode();
                }
            }
        }
        return INSTANCE;
    }
}
