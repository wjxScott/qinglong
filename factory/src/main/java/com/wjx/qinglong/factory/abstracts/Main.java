package com.wjx.qinglong.factory.abstracts;

import com.wjx.qinglong.factory.abstracts.domain.OperationControl;
import com.wjx.qinglong.factory.abstracts.domain.UIControl;
import com.wjx.qinglong.factory.abstracts.factory.AndroidFactory;
import com.wjx.qinglong.factory.abstracts.factory.IosFactory;

/**
 * @author wangjinxin
 * @date 2021/3/11 20:18
 * @mail wixScott@163.com
 * @description
 */
public class Main {
    public static void main(String[] args) {
        IosFactory iosFactory = new IosFactory();
        UIControl iosUiControl = iosFactory.getUIControl();
        OperationControl iosOperationControl = iosFactory.getOperationControl();

        AndroidFactory androidFactory = new AndroidFactory();
        UIControl androidUIControl = androidFactory.getUIControl();
        OperationControl androidOperationControl = androidFactory.getOperationControl();

        iosOperationControl.control();
        iosUiControl.display();

        androidOperationControl.control();
        androidUIControl.display();

    }
}
