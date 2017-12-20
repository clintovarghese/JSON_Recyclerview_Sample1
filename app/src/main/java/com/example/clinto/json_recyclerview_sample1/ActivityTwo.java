package com.example.clinto.json_recyclerview_sample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ActivityTwo extends AppCompatActivity {
    TextView tv;
    TextView tv2;
    ImageView iv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        tv=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);
        iv=(ImageView)findViewById(R.id.imageView);
        String img_url = "http://iroidtech.com/wecare/uploads/news_events/";
        Bundle extras=getIntent().getExtras();
        String value1=extras.getString("value1");
        String value2=extras.getString("value2");
        String value3=extras.getString("value3");
        tv.setText(value1);
        tv2.setText(value3);
        Picasso.with(ActivityTwo.this).load(img_url+value2).error(R.drawable.imggg1).placeholder(R.drawable.imggg1).into(iv);
        bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
