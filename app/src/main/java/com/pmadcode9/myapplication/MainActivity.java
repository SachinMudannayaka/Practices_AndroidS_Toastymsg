package com.pmadcode9.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view){
        switch (view.getId()){
            case R.id.btn_success:
                Toasty.success(this,"Success", Toast.LENGTH_SHORT).show();break;
            case R.id.btn_error:
                Toasty.error(getApplicationContext(),"Error",Toasty.LENGTH_SHORT).show();break;
            case R.id.btn_info:
                Toasty.error(getApplicationContext(),"More info need",Toasty.LENGTH_SHORT).show();break;
            case R.id.btn_normal:
                Toasty.normal(getApplicationContext(),"Normal",Toasty.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_android_black_24dp)).show();break;
            case R.id.btn_warning:
                Toasty.warning(this,"Warning",Toasty.LENGTH_SHORT).show();break;

        }
    }
}