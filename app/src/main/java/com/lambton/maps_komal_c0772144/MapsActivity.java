package com.lambton.maps_komal_c0772144;


import androidx.fragment.app.FragmentActivity;

import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polyline;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnPolylineClickListener, GoogleMap.OnPolygonClickListener{
    private static final int REQUEST_CODE = 1;
    private static final float DEFAULT_ZOOM_LEVEL = 10.0f;
    private final static int POLYGON_SIDES = 4;

    private GoogleMap mMap;
    private Marker mPreviousMarker;
    private List<Marker> mMarkerList = new ArrayList<>();
    private List<Polyline> mPolylineList = new ArrayList<>();
    private LocationManager mLocationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }
}
