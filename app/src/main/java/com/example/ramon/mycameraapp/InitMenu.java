package com.example.ramon.mycameraapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ramon on 09/12/2016.
 */

public class InitMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int a = 0;
        setContentView(R.layout.init_menu);
        //linea de mierda
    }

    /** Called when the user clicks the camera button */
    public void openCamera(View view) {
        // opens the camera activity
        Intent intent = new Intent(this, AndroidCameraApi.class);
        startActivity(intent);
    }
}
