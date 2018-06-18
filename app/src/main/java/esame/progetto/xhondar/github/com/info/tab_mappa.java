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
            /*
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

                        setUpMapIfNeeded();
                        return root;
                    }

                    @Override
                    public void onMapReady(final GoogleMap googleMap) {
                        this.googleMap = googleMap;
                        this.googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

                        this.googleMap.getUiSettings().setZoomControlsEnabled(true);
                        this.googleMap.getUiSettings().setCompassEnabled(true);
                        this.googleMap.getUiSettings().setMyLocationButtonEnabled(true);
                        this.googleMap.getUiSettings().setZoomGesturesEnabled(true);
                        this.googleMap.getUiSettings().setRotateGesturesEnabled(true);

                        //final LatLng pos1 = new LatLng(44.783878,10.879663);
                        googleMap.addMarker(new MarkerOptions().position(new LatLng(22.7253, 75.8655)).title("Indore"));
                        //googleMap.addMarker(new MarkerOptions().position(pos1));
                        this.googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
                            @Override
                            public void onMapLoaded() {
                                googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(LatLngBounds.builder().build(), 100));
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
                    */
            GoogleMap map;

            public static tab_mappa newInstance() {
                tab_mappa fragment = new tab_mappa();
                return fragment;
            }

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
                map = googleMap;
                this.map = googleMap;
                this.map.setMapType(GoogleMap.MAP_TYPE_NORMAL);

                this.map.getUiSettings().setZoomControlsEnabled(true);
                this.map.getUiSettings().setCompassEnabled(true);
                this.map.getUiSettings().setMyLocationButtonEnabled(true);
                this.map.getUiSettings().setZoomGesturesEnabled(true);
                this.map.getUiSettings().setRotateGesturesEnabled(true);

                LatLng pp = new LatLng(44.783878,10.879663);
                map.addMarker(new MarkerOptions().position(pp).title("Carpi"));
                map.animateCamera(CameraUpdateFactory.newLatLngZoom(pp, 8));
            }


        }
