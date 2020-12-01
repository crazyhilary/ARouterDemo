package com.hilary.arouter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.hilary.arouter.model.Student;
import com.hilary.arouter.model.User;
import com.hilary.arouter.service.HelloService;

import java.util.List;

@Route(path = ARouterPath.ACT_HOME, extras = 1)
public class MainActivity extends AppCompatActivity {

    @Autowired(name = "user")
    User mUser;

    @Autowired(name = "student")
    Student mStudent;

    @Autowired(name = "list")
    List<Student> list;

    @Autowired
    HelloService mHelloService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().inject(this);

        System.out.println(">>userName>>>" + mUser.getName());
        System.out.println(">>mStudent.class>>>>" + mStudent.getClasz());
        System.out.println(">>>list.size>>>" + list);
//        new Handler(getMainLooper()).postDelayed(
//                () -> {
//                    ARouter.getInstance().build(ARouterPath.ACT_HOME).navigation();
//                }, 2000
//        );
        System.out.println(">>>mHelloService>>>>" + mHelloService.say("....."));
    }
}