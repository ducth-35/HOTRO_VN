package com.example.hotro_vn.Activity.Maps;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.hotro_vn.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class GoogleMaps_Activity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    final int REQUEST_CODE = 1;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps_);
        read_permission();
        //getSupportActionBar().hide();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.myMap);
        mapFragment.getMapAsync(this); //khoi tao map systen
        // tao progress bar
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Đang tải Google Maps");
        progressDialog.setMessage("Vui lòng chờ");
        progressDialog.setCancelable(true);
        progressDialog.show();

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
            @Override
            public void onMapLoaded() {
                Log.i("Load", "OK");
            }
        });

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);
    }

    public void read_permission() {
        if (ContextCompat.checkSelfPermission(GoogleMaps_Activity.this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                + ContextCompat.checkSelfPermission(GoogleMaps_Activity.this,
                Manifest.permission.ACCESS_COARSE_LOCATION) +
                ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            // khi quyen bi tu choi
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)
                    || ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                    || ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_NETWORK_STATE)) {
                // tao 1 dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Granted Perm");
                builder.setMessage("Read_contact,Camera,Callphone");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCompat.requestPermissions(
                                GoogleMaps_Activity.this, new String[]
                                        {
                                                Manifest.permission.CALL_PHONE,
                                                Manifest.permission.READ_CONTACTS,
                                                Manifest.permission.CAMERA

                                        }, REQUEST_CODE
                        );
                    }
                });
                builder.setNegativeButton("Cancel", null);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            } else {
                ActivityCompat.requestPermissions(
                        GoogleMaps_Activity.this, new String[]
                                {
                                        Manifest.permission.ACCESS_COARSE_LOCATION,
                                        Manifest.permission.ACCESS_FINE_LOCATION,
                                        Manifest.permission.ACCESS_NETWORK_STATE

                                }, REQUEST_CODE
                );
            }
        } else {
            Toast.makeText(this, "ok perm", Toast.LENGTH_SHORT).show();
        }
    }
}