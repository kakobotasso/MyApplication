package br.com.teste.myapplication;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    int routeNumber;
    List<LatLng> routes1 = new ArrayList<>();
    List<LatLng> routes2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        routeNumber = getIntent().getIntExtra("route", 1);

        routes1.add(new LatLng(-23.584093, -46.660905));
        routes1.add(new LatLng(-23.584092, -46.660939));
        routes1.add(new LatLng(-23.584091, -46.660959));
        routes1.add(new LatLng(-23.584096, -46.661009));
        routes1.add(new LatLng(-23.584108, -46.661056));
        routes1.add(new LatLng(-23.584127, -46.661104));
        routes1.add(new LatLng(-23.584154, -46.661148));
        routes1.add(new LatLng(-23.584184, -46.661189));
        routes1.add(new LatLng(-23.584221, -46.661224));
        routes1.add(new LatLng(-23.584260, -46.661249));
        routes1.add(new LatLng(-23.584304, -46.661272));
        routes1.add(new LatLng(-23.584349, -46.661285));
        routes1.add(new LatLng(-23.584395, -46.661293));
        routes1.add(new LatLng(-23.584452, -46.661295));
        routes1.add(new LatLng(-23.584497, -46.661284));
        routes1.add(new LatLng(-23.584552, -46.661264));
        routes1.add(new LatLng(-23.584595, -46.661236));
        routes1.add(new LatLng(-23.584639, -46.661200));
        routes1.add(new LatLng(-23.584681, -46.661141));
        routes1.add(new LatLng(-23.584707, -46.661086));
        routes1.add(new LatLng(-23.584730, -46.661030));
        routes1.add(new LatLng(-23.584741, -46.660961));
        routes1.add(new LatLng(-23.584739, -46.660891));
        routes1.add(new LatLng(-23.584721, -46.660821));
        routes1.add(new LatLng(-23.584693, -46.660753));
        routes1.add(new LatLng(-23.584640, -46.660680));
        routes1.add(new LatLng(-23.584590, -46.660633));
        routes1.add(new LatLng(-23.584523, -46.660600));
        routes1.add(new LatLng(-23.584448, -46.660582));
        routes1.add(new LatLng(-23.584392, -46.660582));
        routes1.add(new LatLng(-23.584321, -46.660597));
        routes1.add(new LatLng(-23.584254, -46.660629));
        routes1.add(new LatLng(-23.584197, -46.660671));
        routes1.add(new LatLng(-23.584151, -46.660726));
        routes1.add(new LatLng(-23.584117, -46.660800));
        routes1.add(new LatLng(-23.584102, -46.660868));
        routes1.add(new LatLng(-23.584093, -46.660905));

        routes2.add(new LatLng(-23.585008, -46.659813));
        routes2.add(new LatLng(-23.584959, -46.659857));
        routes2.add(new LatLng(-23.584921, -46.659897));
        routes2.add(new LatLng(-23.584916, -46.659924));
        routes2.add(new LatLng(-23.584930, -46.659946));
        routes2.add(new LatLng(-23.585009, -46.659992));
        routes2.add(new LatLng(-23.585070, -46.660029));
        routes2.add(new LatLng(-23.585157, -46.660086));
        routes2.add(new LatLng(-23.585199, -46.660047));
        routes2.add(new LatLng(-23.585232, -46.660008));
        routes2.add(new LatLng(-23.585262, -46.659979));
        routes2.add(new LatLng(-23.585302, -46.659939));
        routes2.add(new LatLng(-23.585337, -46.659907));
        routes2.add(new LatLng(-23.585365, -46.659882));
        routes2.add(new LatLng(-23.585323, -46.659852));
        routes2.add(new LatLng(-23.585267, -46.659806));
        routes2.add(new LatLng(-23.585197, -46.659767));
        routes2.add(new LatLng(-23.585144, -46.659739));
        routes2.add(new LatLng(-23.585104, -46.659725));
        routes2.add(new LatLng(-23.585060, -46.659768));
        routes2.add(new LatLng(-23.585005, -46.659814));
        routes2.add(new LatLng(-23.585008, -46.659813));
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        float zoom = 19.0f;
        LatLng location;
        MarkerOptions marker;
        double distance = 0.0;

        if (routeNumber == 1) {
            location = new LatLng(-23.584411, -46.660936);
            marker = new MarkerOptions().position(new LatLng(-23.584093, -46.660905));
            mMap.addPolyline(new PolylineOptions()
                    .addAll(routes1)
                    .width(15)
                    .color(Color.RED)
                    .geodesic(true));

            for (int i = 0; i < routes1.size(); i++) {
                LatLng actual = routes1.get(i);
                LatLng next = null;
                try {
                    next = routes1.get(i + 1);
                } catch (Exception e) {
                }

                if (next != null) {
                    distance += Distance.getDistanceInKm(actual.latitude, actual.longitude,
                            next.latitude, next.longitude);
                }
            }
        } else {
            location = new LatLng(-23.585121, -46.659900);
            marker = new MarkerOptions().position(new LatLng(-23.585008, -46.659813));
            mMap.addPolyline(new PolylineOptions()
                    .addAll(routes2)
                    .width(15).color(Color.RED).geodesic(true));

            for (int i = 0; i < routes2.size(); i++) {
                LatLng actual = routes2.get(i);
                LatLng next = null;
                try {
                    next = routes2.get(i + 1);
                } catch (Exception e) {
                }

                if (next != null) {
                    distance += Distance.getDistanceInKm(actual.latitude, actual.longitude,
                            next.latitude, next.longitude);
                }
            }
        }
        marker.icon(getBitmapDescriptorFromVectorDrawable(R.drawable.ic_flag));
        String coiso = "" + new DecimalFormat("#0.0").format(Math.sqrt(distance)) + " km";
        marker.title(coiso);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, zoom));
        mMap.addMarker(marker);
    }

    private BitmapDescriptor getBitmapDescriptorFromVectorDrawable(int id) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            VectorDrawable vectorDrawable = (VectorDrawable) getDrawable(id);

            int h = vectorDrawable.getIntrinsicHeight();
            int w = vectorDrawable.getIntrinsicWidth();

            vectorDrawable.setBounds(0, 0, w, h);

            Bitmap bm = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bm);
            vectorDrawable.draw(canvas);

            return BitmapDescriptorFactory.fromBitmap(bm);

        } else {
            return BitmapDescriptorFactory.fromResource(id);
        }
    }
}
