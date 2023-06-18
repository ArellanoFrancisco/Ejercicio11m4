package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ejercicio11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast = getString(R.string.plane);
                Toast.makeText(MainActivity.this,toast, Toast.LENGTH_SHORT).show();

            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast = getString(R.string.update);
                Toast.makeText(MainActivity.this,toast, Toast.LENGTH_SHORT).show();

            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast = getString(R.string.picGallery);
                Toast.makeText(MainActivity.this,toast, Toast.LENGTH_SHORT).show();

            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast = getString(R.string.unlock5);
                Toast.makeText(MainActivity.this,toast, Toast.LENGTH_SHORT).show();

            }
        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast = getString(R.string.level4);
                Toast.makeText(MainActivity.this,toast, Toast.LENGTH_SHORT).show();

            }
        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast = getString(R.string.musicP);
                Toast.makeText(MainActivity.this,toast, Toast.LENGTH_SHORT).show();

            }
        });


    }
}