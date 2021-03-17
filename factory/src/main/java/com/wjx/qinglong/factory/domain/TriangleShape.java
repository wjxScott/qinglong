package com.wjx.qinglong.factory.domain;

/**
 * @author wangjinxin
 * @date 2021/3/11 11:46
 * @mail wixScott@163.com
 * @description 三角形-子类
 */
public class TriangleShape implements Shape {

    public TriangleShape() {
        System.out.println("TriangleShape init");
    }

    @Override
    public void draw() {
        System.out.println("TriangleShape draw");
    }
}
