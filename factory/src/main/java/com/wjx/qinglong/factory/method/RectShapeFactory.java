package com.wjx.qinglong.factory.method;


import com.wjx.qinglong.factory.domain.RectShape;
import com.wjx.qinglong.factory.domain.Shape;

/**
 * @author wangjinxin
 * @date 2021/3/11 19:33
 * @mail wixScott@163.com
 * @description 正方形工厂
 */
public class RectShapeFactory implements SharpFactory {
    @Override
    public Shape getShape() {
        return new RectShape();
    }
}
