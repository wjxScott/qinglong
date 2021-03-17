package com.wjx.qinglong.factory.method;

import com.wjx.qinglong.factory.domain.Shape;
import com.wjx.qinglong.factory.domain.TriangleShape;

/**
 * @author wangjinxin
 * @date 2021/3/11 19:34
 * @mail wixScott@163.com
 * @description
 */
public class TriangleShapeFactory implements SharpFactory {

    @Override
    public Shape getShape() {
        return new TriangleShape();
    }
}
