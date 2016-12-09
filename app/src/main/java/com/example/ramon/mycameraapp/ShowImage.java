package com.example.ramon.mycameraapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by ramon on 09/12/2016.
 */

public class ShowImage extends AppCompatActivity {

    ImageView image;
    File file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_image);

        file = new File(this.getFilesDir(), "/face.jpg");
        if(file.exists()){

            Bitmap myBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            //Bitmap resized = Bitmap.createScaledBitmap(myBitmap,(int)(myBitmap.getWidth()*0.8), (int)(myBitmap.getHeight()*0.8), true);
            image = (ImageView) findViewById(R.id.image);

            //problema de rotación de imagen
            Matrix m = new Matrix();
            m.preScale(-1, 1);
            Bitmap mirroredImage = Bitmap.createBitmap(myBitmap, 0, 0, myBitmap.getWidth(), myBitmap.getHeight(), m, false);

            image.setRotation(180);
            image.setImageBitmap(mirroredImage);
        }
        else{
            System.out.println("la imagen no existe :(");
        }

    }

    /** Called when the user clicks the close button */
    public void close(View view) {
        // closes the app
        Intent intent = new Intent(this, InitMenu.class);
        startActivity(intent);
    }

}
