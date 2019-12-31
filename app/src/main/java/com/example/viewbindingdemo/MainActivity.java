package com.example.viewbindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.viewbindingdemo.databinding.ActivityMainBinding;
import com.example.viewbindingdemo.model.Customer;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mActivityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Customer customer = new Customer("Hoàng","109 Tôn Thất Tùng");
        mActivityMainBinding.setCustomer(customer);
    }
}
