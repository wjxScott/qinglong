package com.wjx.qinglong.factory.domain;

/**
 * @author wangjinxin
 * @date 2021/3/11 11:45
 * @mail wixScott@163.com
 * @description 正方形-子类
 */
public class RectShape implements Shape {

    public RectShape() {
        System.out.println("RectShape init");
    }

    @Override
    public void draw() {
        System.out.println("RectShape draw");
    }
}
