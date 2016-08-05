package com.antonioleiva.mvpexample.app.Login;

import android.os.Handler;
import android.text.TextUtils;

public class LoginManagerImpl implements LoginManager {

    /**
     * 这个地方为什么要使用一个 listener 进行回调呢？
     * 因为执行是否成功是需要反馈给调用者的。
     * 让调用者执行相关的操作。我觉得回调通常情况下是用于这样的情况：
     * 一个类调用另外一个类的方法，如果需要另一个类返回结果，让这个类执行下一步的操作，那么就需呀用到回调。
     * 而一个回调的比较好的实践就是调用者实现一个接口或者说使用一个内部的接口（我觉得不推荐，除非内聚需要），被调用者在方法的签名中需要这个接口。（面向接口编程策略的实践）
     * @param username
     * @param password
     * @param listener
     */
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
