package com.example.mountain.walkingapp;

import android.support.v4.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LatLng location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    //MarkerOptions options = new MarkerOptions();
    //options.position(newLatLng(34.643994, 134.999284));
    //options.title("テストMaker");
    //options.snippet("補足情報を記載");
    //Marker marker = mMap.addMarker(options);
    //marker.showInfoWindow();

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // 本初子午線の緯度経度
        location = new LatLng(34.6493994, 134.999284);
        // marker 追加
        mMap.addMarker(new MarkerOptions().position(location).title("Akashi"));
        // camera 移動
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 15));

    }
}
