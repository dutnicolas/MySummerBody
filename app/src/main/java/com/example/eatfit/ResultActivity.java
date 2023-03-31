package com.example.eatfit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private static int Result;
    private static final int REQUEST_IMAGE_CAPTURE = Result;
    private Button captureButton;
    private ImageView foodImageView;
    private TextView foodNameTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        captureButton = findViewById(R.id.capture_button);
        foodImageView = findViewById(R.id.food_image_view);
        foodNameTextView = findViewById(R.id.food_name_text_view);

        captureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ouvrir l'appareil photo
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    int REQUEST_IMAGE_CAPTURE = 0;
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                }
            }
        });
    }

    // Traiter l'image capturée
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            foodImageView.setImageBitmap(imageBitmap);

            // Prétraiter l'image
            Bitmap processedImage = preprocessImage(imageBitmap);

            // Reconnaître l'aliment
            String foodName = recognizeFood(processedImage);

            // Afficher le résultat
            foodNameTextView.setText(foodName);
        }
    }

    // Prétraiter l'image
    private Bitmap preprocessImage(Bitmap image) {
        // À implémenter : redimensionner et normaliser l'image
        Bitmap processedImage = null;
        return null;
    }

    // Reconnaître l'aliment
    private String recognizeFood(Bitmap image) {
        // À implémenter : utiliser une bibliothèque de reconnaissance d'image pour extraire les caractéristiques de l'aliment et comparer avec une base de données d'aliments
        String foodName = null;
        return null;
    }
}
