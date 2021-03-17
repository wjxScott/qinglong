package com.wjx.qinglong.factory.simple;

import com.wjx.qinglong.factory.domain.CircleShape;
import com.wjx.qinglong.factory.domain.RectShape;
import com.wjx.qinglong.factory.domain.Shape;
import com.wjx.qinglong.factory.domain.TriangleShape;

/**
 * @author wangjinxin
 * @date 2021/3/11 11:49
 * @mail wixScott@163.com
 * @description 图形工厂
 */
public class ShapeSimpleactory {

    public static Shape getShape(String shapeName) {
        Shape shape = null;

        if (shapeName.equals(CircleShape.class.getName())) {
            shape = new CircleShape();
        } else if (shapeName.equals(RectShape.class.getName())) {
            shape = new RectShape();
        } else if (shapeName.equals(TriangleShape.class.getName())) {
            shape = new TriangleShape();
        }
        return shape;
    }
}
