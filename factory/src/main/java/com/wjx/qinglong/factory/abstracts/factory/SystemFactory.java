package com.wjx.qinglong.factory.abstracts.factory;


import com.wjx.qinglong.factory.abstracts.domain.OperationControl;
import com.wjx.qinglong.factory.abstracts.domain.UIControl;

/**
 * @author wangjinxin
 * @date 2021/3/11 20:10
 * @mail wixScott@163.com
 * @description
 */
public interface SystemFactory {
    OperationControl getOperationControl();

    UIControl getUIControl();
}
