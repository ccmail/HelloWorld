package com.example.hello707;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    String ask = "你喜欢Android吗?";
    String like = "欢迎来到Android世界!";
    String dislike = "为了考试及格,还是要好好学的.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //第一种方法,在java文件中添加监听器,实现文字更改,本方法没有用到onClick属性
//        textView= findViewById(R.id.text_ask);
//        textView.setText(ask);
//
//        Button button_like = findViewById(R.id.like);
//        button_like.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText(like);
//            }
//        });
//
//        Button button_dislike = findViewById(R.id.dislike);
//        button_dislike.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText(dislike);
//            }
//        });

    }


//第二种方法,在样式文件activity_main.xml中的button中添加onClick属性,使用onClick更改TextView的值,本方法没有用到button属性的id值
    public void like(View view){
        textView = findViewById(R.id.text_ask);
        textView.setText(like);

    }

    public void dislike(View view){
        textView = findViewById(R.id.text_ask);
        textView.setText(dislike);
    }


    public  void text_rebuild(View view){
        textView = findViewById(R.id.text_ask);
        textView.setText(ask);
        Toast.makeText(this,"点击文本重置回初始值",Toast.LENGTH_SHORT).show();
    }
}
