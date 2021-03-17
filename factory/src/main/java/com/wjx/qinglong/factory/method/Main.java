package com.wjx.qinglong.factory.method;


import com.wjx.qinglong.factory.domain.Shape;

/**
 * @author wangjinxin
 * @date 2021/3/11 19:36
 * @mail wixScott@163.com
 * @description
 */
public class Main {
    public static void main(String[] args) {
        CircleShapeFactory circleShapeFactory = new CircleShapeFactory();
        RectShapeFactory rectShapeFactory = new RectShapeFactory();
        TriangleShapeFactory triangleShapeFactory = new TriangleShapeFactory();

        Shape circleShape = circleShapeFactory.getShape();
        Shape rectShape = rectShapeFactory.getShape();
        Shape factoryShape = triangleShapeFactory.getShape();

        rectShape.draw();
        circleShape.draw();
        factoryShape.draw();
    }
}
