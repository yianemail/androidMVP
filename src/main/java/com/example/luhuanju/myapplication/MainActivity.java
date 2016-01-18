package com.example.luhuanju.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends Activity implements IMainActivityView {
    TextView text1;
    TextView text2;
    ImageView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn= (Button)findViewById(R.id.button);
         text1= (TextView)findViewById(R.id.textView);
         text2= (TextView)findViewById(R.id.textView2);
         view=(ImageView)findViewById(R.id.imageView);
         Picasso.with(this).load("").into(view);
         final IPresenter presenter=new Persenter(this);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //去请求Presenter
                presenter.getUserInfoFromModel();


            }
        });
    }



    @Override
    public void setUserInfoFromPresenter(User user) {
        text1.setText(user.getName());
        text2.setText(user.getPassword());



    }
}
