package com.example.luhuanju.myapplication;

import android.graphics.BitmapFactory;

/**
 * Created by luhuanju on 15/10/26.
 */
public class Persenter implements  IPresenter,ICallBack{
    IMainActivityView mIview;
    IMainActivityModel mImodel;

    public Persenter(IMainActivityView view){
        this.mIview=view;
        mImodel=new ModelImpl();

    }


    @Override
    public void getUserInfoFromModel() {

        mImodel.getUserInfo(this);
    }
    //该处得到Model的回调数据
    @Override
    public void onSuccess(User user) {
        //把数据传递给界面
        mIview.setUserInfoFromPresenter(user);
    }

    @Override
    public void onFailed() {

    }
}
