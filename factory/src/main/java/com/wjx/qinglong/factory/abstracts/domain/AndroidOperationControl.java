package com.wjx.qinglong.factory.abstracts.domain;

/**
 * @author wangjinxin
 * @date 2021/3/11 20:03
 * @mail wixScott@163.com
 * @description
 */
public class AndroidOperationControl implements OperationControl {
    @Override
    public void control() {
        System.out.println("andriod operationcontrol");
    }
}
