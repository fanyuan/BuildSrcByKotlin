package com.example.mythreadpool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.mythreadpool.databinding.ActivityMainBinding;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setAct(this);
        Retrofit retrofit;
    }
    public void demo01(){
        startActivity(new Intent(this,Demo01Activity.class));
    }
}