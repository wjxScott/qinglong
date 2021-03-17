package com.wjx.qinglong.factory.abstracts.factory;


import com.wjx.qinglong.factory.abstracts.domain.OperationControl;
import com.wjx.qinglong.factory.abstracts.domain.UIControl;
import com.wjx.qinglong.factory.abstracts.domain.WpOperationControl;
import com.wjx.qinglong.factory.abstracts.domain.WpUIControl;

/**
 * @author wangjinxin
 * @date 2021/3/11 20:17
 * @mail wixScott@163.com
 * @description
 */
public class WpFactory implements SystemFactory {
    @Override
    public OperationControl getOperationControl() {
        return new WpOperationControl();
    }

    @Override
    public UIControl getUIControl() {
        return new WpUIControl();
    }
}
