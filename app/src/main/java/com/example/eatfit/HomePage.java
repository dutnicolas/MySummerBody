package com.example.eatfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private Button buttonScan;
    private Button buttonRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        buttonRecipes = (Button) findViewById(R.id.button_recipes);
        buttonRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecipes();
            }
        });

        buttonScan = (Button) findViewById(R.id.button_scan);
        buttonScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScanPage();
            }
        });

    }
    public void openRecipes(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openScanPage(){
        Intent intent = new Intent(this, ScanPage.class);
        startActivity(intent);
    }
}
