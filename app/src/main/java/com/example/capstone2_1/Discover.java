package com.example.capstone2_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Discover extends AppCompatActivity {

    Button waterQual, waterParams, waterSources, waterSample, Who;
    Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        dialog = new Dialog(Discover.this);
        dialog.setContentView(R.layout.dialog_water_quality);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.dialog_box_background));

        dialog.setContentView(R.layout.dialog_water_params);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.dialog_box_background));

        dialog.setContentView(R.layout.dialog_water_sampling);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.dialog_box_background));

        dialog.setContentView(R.layout.dialog_water_sources);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.dialog_box_background));

        dialog.setContentView(R.layout.dialog_who);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.dialog_box_background));

        waterQual = findViewById(R.id.waterQualbtn);
        waterQual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.setContentView(R.layout.dialog_water_quality);
                dialog.show();
            }
        });

        waterParams = findViewById(R.id.waterParamsbtn);
        waterParams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.setContentView(R.layout.dialog_water_params);
                dialog.show();
            }
        });

        waterSources = findViewById(R.id.waterSourcesbtn);
        waterSources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.setContentView(R.layout.dialog_water_sources);
                dialog.show();

            }
        });

        waterSample = findViewById(R.id.waterSamplebtn);
        waterSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.setContentView(R.layout.dialog_water_sampling);
                dialog.show();
            }
        });

        Who = findViewById(R.id.whoBtn);
        Who.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.setContentView(R.layout.dialog_who);
                dialog.show();
            }
        });

    }
}