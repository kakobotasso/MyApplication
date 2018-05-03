package br.com.teste.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstRoute = findViewById(R.id.bt_planetario);
        firstRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map = new Intent(MainActivity.this, MapsActivity.class);
                map.putExtra("route", 1);
                startActivity(map);
            }
        });

        Button secondRoute = findViewById(R.id.bt_pavilhao);
        secondRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map = new Intent(MainActivity.this, MapsActivity.class);
                map.putExtra("route", 2);
                startActivity(map);
            }
        });
    }
}
