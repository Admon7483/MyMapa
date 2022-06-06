package com.nb.mymapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LocationProject extends AppCompatActivity {
    Button button;
    TextView latitud, longitud;
    LocationManager locationManager;
    Location location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_project);
        button=(Button) findViewById(R.id.button);
        latitud=(TextView) findViewById(R.id.latitud);
        longitud=(TextView) findViewById(R.id.longitud);



        locationManager = (LocationManager)  getSystemService(Context.LOCATION_SERVICE);
    }
}