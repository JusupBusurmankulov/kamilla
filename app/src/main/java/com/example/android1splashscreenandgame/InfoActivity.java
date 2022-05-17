package com.example.android1splashscreenandgame;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.example.android1splashscreenandgame.data.models.NameModel;
import com.example.android1splashscreenandgame.databinding.ActivityInfoBinding;

public class InfoActivity extends AppCompatActivity {
    private ActivityInfoBinding binding;
    NameModel nameModel;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        nameModel = (NameModel) intent.getSerializableExtra("key");
        binding.tvAddress.setText(nameModel.getAddress());
        binding.tvName.setText(nameModel.getName());
    }
}