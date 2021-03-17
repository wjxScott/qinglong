package com.wjx.qinglong.factory.abstracts.factory;


import com.wjx.qinglong.factory.abstracts.domain.IosOperationControl;
import com.wjx.qinglong.factory.abstracts.domain.IosUIControl;
import com.wjx.qinglong.factory.abstracts.domain.OperationControl;
import com.wjx.qinglong.factory.abstracts.domain.UIControl;

/**
 * @author wangjinxin
 * @date 2021/3/11 20:16
 * @mail wixScott@163.com
 * @description
 */
public class IosFactory implements SystemFactory {
    @Override
    public OperationControl getOperationControl() {
        return new IosOperationControl();
    }

    @Override
    public UIControl getUIControl() {
        return new IosUIControl();
    }
}
