package com.example.capstone2_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public CardView dashboard, discover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dashboard = (CardView) findViewById(R.id.dashboardCard);
        discover = (CardView) findViewById(R.id.discoverCard);

        dashboard.setOnClickListener(this);
        discover.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()) {
            case R.id.dashboardCard :
                i = new Intent(this, Dashboard.class);
                startActivity(i);
                break;

            case R.id.discoverCard :
                i = new Intent(this, Discover.class);
                startActivity(i);
                break;

    }
}

    public void onBackPressed(){



    }

}