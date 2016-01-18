package com.example.luhuanju.myapplication;

/**
 * Created by luhuanju on 15/10/26.
 */
public interface ICallBack {
    //函数回调。标示请求成功失败
    void onSuccess(User user);

    void onFailed();
}
