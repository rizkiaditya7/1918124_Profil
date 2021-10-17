package com.example.a1918124_rizkiaditya_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_profil = findViewById(R.id.button_profil);
        btn_profil.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case (R.id.button_profil):
                Intent intent2 = new Intent(MainActivity.this, LayoutGroup2Activity.class);
                startActivity(intent2);
                break;
        }
    }
}