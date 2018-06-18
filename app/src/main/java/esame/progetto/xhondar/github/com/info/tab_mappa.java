package esame.progetto.xhondar.github.com.info;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
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

    public class tab_mappa extends Fragment implements OnMapReadyCallback {
        GoogleMap map;
        tab t = new tab();
        String s = "";
        SupportMapFragment mapFragment;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.tabmappa, container, false);
            SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
            return v;
        }

        @Override
        public void onMapReady(GoogleMap googleMap){
            t = (tab) getActivity();
            s = t.getS();

            map = googleMap;
            this.map = googleMap;
            this.map.setMapType(GoogleMap.MAP_TYPE_NORMAL);

            this.map.getUiSettings().setZoomControlsEnabled(true);
            this.map.getUiSettings().setCompassEnabled(true);
            this.map.getUiSettings().setMyLocationButtonEnabled(true);
            this.map.getUiSettings().setZoomGesturesEnabled(true);
            this.map.getUiSettings().setRotateGesturesEnabled(true);

            LatLng pp_carpi = new LatLng(44.7823700, 10.8777000);
            map.addMarker(new MarkerOptions().position(pp_carpi).title("Carpi"));
            LatLng pp_berlino = new LatLng(52.520008, 13.404954);
            map.addMarker(new MarkerOptions().position(pp_berlino).title("Berlino"));
            LatLng pp_trieste = new LatLng(45.6433,13.7903);
            map.addMarker(new MarkerOptions().position(pp_trieste).title("Trieste"));
            LatLng pp_lubiana = new LatLng(46.056946, 14.505751);
            map.addMarker(new MarkerOptions().position(pp_lubiana).title("Lubiana"));
            LatLng pp_norimberga = new LatLng(49.460983, 11.061859);
            map.addMarker(new MarkerOptions().position(pp_norimberga).title("Norimberga"));

            switch (s){
                case "Carpi":
                    map.animateCamera(CameraUpdateFactory.newLatLngZoom(pp_carpi, 9)); break;
                case "Berlino":
                    map.animateCamera(CameraUpdateFactory.newLatLngZoom(pp_berlino, 9)); break;
                case "Trieste":
                    map.animateCamera(CameraUpdateFactory.newLatLngZoom(pp_trieste, 9)); break;
                case "Lubiana":
                    map.animateCamera(CameraUpdateFactory.newLatLngZoom(pp_lubiana, 9)); break;
                case "Norimberga":
                    map.animateCamera(CameraUpdateFactory.newLatLngZoom(pp_norimberga, 9)); break;
                default: break;
            }
        }
    }
