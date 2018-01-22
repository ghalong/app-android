package cc.oldhunter.app.android;

import android.app.Application;

import utils.UiUtils;


/**
 * Copyright:   Copyright (c) 2015年 Beijing Yunshan Information Technology Co., Ltd. All rights reserved.<br>
 * Version: V1.4.2<br>
 * Author:  王海宇<br>
 * Date:    2018/01/22 18:46<br>
 * Desc:    <br>
 * Edit History:<br>
 */
public class IApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UiUtils.init(this);
    }
}
