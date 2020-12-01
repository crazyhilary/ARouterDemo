package com.hilary.arouter.service.pretreatment;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.PretreatmentService;

//  Created by hilary on 2020/12/1.
//  Copyright (c) 2020 Arouter. All rights reserved.
//
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                            O\ = /O
//                        ____/`---'\____
//                      .   ' \\| |// `.
//                       / \\||| : |||// \
//                     / _||||| -:- |||||- \
//                       | | \\\ - /// | |
//                     | \_| ''\---/'' | |
//                      \ .-\__ `-` ___/-. /
//                   ___`. .' /--.--\ `. . __
//                ."" '< `.___\_<|>_/___.' >'"".
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |
//                 \ \ `-. \_ __\ /__ _/ .-` / /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//
//         .............................................
//                  佛祖镇楼                  BUG辟易
@Route(path = "/service/ARouterPS")
public class ARouterPS implements PretreatmentService {
    @Override
    public boolean onPretreatment(Context context, Postcard postcard) {
        System.out.println(">>>ARouterPS.onPretreatment>>>>>");
        return true;
    }

    @Override
    public void init(Context context) {
        System.out.println(">ARouterPS.init>>>>>>");
    }
}
