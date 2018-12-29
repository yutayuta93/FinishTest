package com.example.android.finishtest;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    final int APILevel = Build.VERSION.SDK_INT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //APIレベルにより遷移するアクティビティを分岐
        if(APILevel >= 24){
            Intent intent = new Intent(this,SwitchActivity1.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this,SwitchActivity2.class);
            startActivity(intent);
        }
        finish();

    }
}
