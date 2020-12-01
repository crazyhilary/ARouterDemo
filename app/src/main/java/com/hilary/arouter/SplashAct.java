package com.hilary.arouter;

import android.os.Bundle;
import android.os.Handler;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.hilary.arouter.model.Student;
import com.hilary.arouter.model.User;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
public class SplashAct extends AppCompatActivity {

    private User mUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mUser = new User();
        mUser.setAge(18);
        mUser.setName("hilary");

        Student student = new Student();
        student.setClasz("1年级一班");
        student.setNumber(34);
        final ArrayList<Student> list = new ArrayList<>();
        list.add(student);

        new Handler(getMainLooper()).postDelayed(
                () -> {
                    ARouter.getInstance()
                            .build(ARouterPath.ACT_HOME)
                            .withSerializable("user", mUser)
                            .withParcelableArrayList("list", list)
                            .withParcelable("student", student)
//                            .navigation();
                            .navigation(SplashAct.this, new NavigationCallback(){
                                @Override
                                public void onFound(Postcard postcard) {
                                    System.out.println(">>>NavigationCallback.onFound>>>>>");
                                }

                                @Override
                                public void onLost(Postcard postcard) {
                                    System.out.println(">>>NavigationCallback.onLost>>>>>");
                                }

                                @Override
                                public void onArrival(Postcard postcard) {
                                    System.out.println(">>>NavigationCallback.onArrival>>>>>");
                                }

                                @Override
                                public void onInterrupt(Postcard postcard) {
                                    System.out.println(">>>>NavigationCallback.onInterrupt>>>>");
                                }
                            });
                }, 2000
        );

    }
}
