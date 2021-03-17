package com.wjx.qinglong.factory.abstracts.factory;

import com.wjx.qinglong.factory.abstracts.domain.AndroidOperationControl;
import com.wjx.qinglong.factory.abstracts.domain.AndroidUIControl;
import com.wjx.qinglong.factory.abstracts.domain.OperationControl;
import com.wjx.qinglong.factory.abstracts.domain.UIControl;

/**
 * @author wangjinxin
 * @date 2021/3/11 20:15
 * @mail wixScott@163.com
 * @description
 */
public class AndroidFactory implements SystemFactory {
    @Override
    public OperationControl getOperationControl() {
        return new AndroidOperationControl();
    }

    @Override
    public UIControl getUIControl() {
        return new AndroidUIControl();
    }
}
