package com.wjx.qinglong.factory.simple;

import com.wjx.qinglong.factory.domain.CircleShape;
import com.wjx.qinglong.factory.domain.RectShape;
import com.wjx.qinglong.factory.domain.Shape;
import com.wjx.qinglong.factory.domain.TriangleShape;

/**
 * @author wangjinxin
 * @date 2021/3/11 11:52
 * @mail wixScott@163.com
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Shape circleShape = ShapeSimpleactory.getShape(CircleShape.class.getName());
        Shape rectShape = ShapeSimpleactory.getShape(RectShape.class.getName());
        Shape triangleShape = ShapeSimpleactory.getShape(TriangleShape.class.getName());

        circleShape.draw();
        rectShape.draw();
        triangleShape.draw();
    }
}
