package com.example.sandy.appaleg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class Home extends AppCompatActivity {

    //Allergie al=new Allergie();
    private ListView list;

    //Declarer un string de checkbox
    //Pour chaque button image, aller sur un autre intent

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        final ImageButton im1 = (ImageButton) findViewById(R.id.im1);
        final ImageButton im2 = (ImageButton) findViewById(R.id.im2);
        final ImageButton im3 = (ImageButton) findViewById(R.id.im3);
        final Button scan = (Button) findViewById(R.id.scan);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);

            }
        });




    }
}
