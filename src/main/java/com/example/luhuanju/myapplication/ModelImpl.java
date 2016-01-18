package com.example.luhuanju.myapplication;

/**
 * Created by luhuanju on 15/10/26.
 */

public class ModelImpl implements IMainActivityModel{

    @Override
    public void getUserInfo(ICallBack listener) {
        //这边就是最终获取数据的地方，
        //正常情况下：在该处去访问网络得到数据
        //利用retrofit 更好的访问
        //本DEMO 简单模拟一些数据

        User user=new User();
        user.setName("luhuanju");
        user.setPassword("上海菲比酒吧－－－>i love Mavis");
        //获取到数据后，开始把回调给Presenter
        listener.onSuccess(user);
    }
}
