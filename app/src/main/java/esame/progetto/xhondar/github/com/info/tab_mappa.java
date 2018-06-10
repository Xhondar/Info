package esame.progetto.xhondar.github.com.info;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class tab_mappa extends SupportMapFragment implements OnMapReadyCallback {

    private GoogleMap googleMap;
    SupportMapFragment mSupportMapFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.tabmappa, null, false);
        mSupportMapFragment = (SupportMapFragment) getFragmentManager().findFragmentById(R.id.map);
        if (mSupportMapFragment == null) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            mSupportMapFragment = SupportMapFragment.newInstance();
            fragmentTransaction.replace(R.id.map, mSupportMapFragment).commit();
        }

        return root;
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        this.googleMap = googleMap;
        this.googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        this.googleMap.getUiSettings().setZoomControlsEnabled(true);                                          // pulsanti + e - dello zoom
        this.googleMap.getUiSettings().setCompassEnabled(true);                                               // bussola
        this.googleMap.getUiSettings().setMyLocationButtonEnabled(true);                                      // pulsante per centrare la mappa sulla propria posizione
        this.googleMap.getUiSettings().setZoomGesturesEnabled(true);                                          // gestire lo zoom con dita
        this.googleMap.getUiSettings().setRotateGesturesEnabled(true);                                        // gestire la rotazione con dita

        // questo è carpi
        LatLng pos1 = new LatLng(44.783878,10.879663);
        final LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(pos1);

        this.googleMap.addMarker(new MarkerOptions().position(pos1));
        this.googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
            @Override
            public void onMapLoaded() {
                googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 100));
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    private void setUpMapIfNeeded() {
        if (googleMap == null) {
            getMapAsync(this);
        }
    }
}