package com.example.luhuanju.myapplication;

/**
 * Created by luhuanju on 15/10/26.
 */
public interface IMainActivityView {
    //针对界面功能写接口－－>本界面点击按钮获取后台用户信息
    //要注意，该函数是要给界面传递数据的。就是说我界面要得到后台的User对象信息。那么我通过这个函数把数据给界面。也就是通过参数

    public void setUserInfoFromPresenter(User user);

}
