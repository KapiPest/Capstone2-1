package com.example.capstone2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Dashboard extends AppCompatActivity {
    private TextView temp, turbidity, pH;

    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    String Date;
    private TextView dashboardTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        calendar = Calendar.getInstance();
        dashboardTime = findViewById(R.id.dashboardTime);
        simpleDateFormat = new SimpleDateFormat("MMMM-dd-yyyy");
        Date = simpleDateFormat.format(calendar.getTime());
        dashboardTime.setText(Date);



    }

}