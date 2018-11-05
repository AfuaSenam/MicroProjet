package com.example.sandy.appaleg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

class ResultatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String value = bundle.getString("text");
        assert value != null;
        value = value.toUpperCase();
        Log.d("value", " " + value);


        setContentView(R.layout.activity_resultat_activity);
    }
}
