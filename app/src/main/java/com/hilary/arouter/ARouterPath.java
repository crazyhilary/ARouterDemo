package com.hilary.arouter;

import java.net.PortUnreachableException;

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
public final class ARouterPath {

    public final static String HOME_GROUP           = "/home";

    public final static String USER_GROUP           = "/user";




    public final static String ACT_HOME_MINE        = HOME_GROUP + "/mine/activity";

    public final static String ACT_HOME             = HOME_GROUP + "/activity";


    public final static String ACT_USER_ME = USER_GROUP + "/me/activity";

    public final static String ACT_USER_SETTING     = USER_GROUP + "/setting/activity";
}
