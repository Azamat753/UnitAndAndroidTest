package com.lawlett.unittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.lawlett.unittest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        math = new Math();
        initListeners();
    }

    private void initListeners() {
        binding.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.numberTv.setVisibility(View.VISIBLE);
                String a = binding.firstField.getText().toString();
                String b = binding.secondField.getText().toString();
                binding.numberTv.setText(math.plus(a,b));
            }
        });
    }
}