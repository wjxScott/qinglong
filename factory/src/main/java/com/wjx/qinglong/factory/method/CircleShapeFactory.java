package com.wjx.qinglong.factory.method;


import com.wjx.qinglong.factory.domain.CircleShape;
import com.wjx.qinglong.factory.domain.Shape;

/**
 * @author wangjinxin
 * @date 2021/3/11 19:32
 * @mail wixScott@163.com
 * @description 圆形工厂
 */
public class CircleShapeFactory implements SharpFactory {
    @Override
    public Shape getShape() {
        return new CircleShape();
    }
}
