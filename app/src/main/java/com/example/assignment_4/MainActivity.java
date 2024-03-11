package com.example.assignment_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {
    Button btnPickCar;
    Dialog dialog;
    TextView okay_text, cancel_text;
    ImageView imgCar1, imgCar2, imgCar3, imgCar4;
    SeekBar seekBar1, seekBar2, seekBar3, seekBar4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
        setOnClickListener();


    }

    private void openCarPickerDialog() {
        dialog.setContentView(R.layout.activity_home);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        //dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

        okay_text = dialog.findViewById(R.id.okay_text);
        cancel_text = dialog.findViewById(R.id.cancel_text);
        imgCar1 = dialog.findViewById(R.id.imgCar1);
        imgCar2 = dialog.findViewById(R.id.imgCar2);
        imgCar3 = dialog.findViewById(R.id.imgCar3);
        imgCar4 = dialog.findViewById(R.id.imgCar4);
        seekBar1 = dialog.findViewById(R.id.seekBar1);
        seekBar2 = dialog.findViewById(R.id.seekBar2);
        seekBar3 = dialog.findViewById(R.id.seekBar3);
        seekBar4 = dialog.findViewById(R.id.seekBar4);

        /*okay_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCar1.setImageResource(R.mipmap.ic_launcher);
                BitmapDrawable drawable = (BitmapDrawable) imgCar1.getDrawable();
                Bitmap bitmap = drawable.getBitmap();

                // Convert Bitmap to byte array
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] imageData = baos.toByteArray();

                // Pass the image data back to the activity using an Intent
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                intent.putExtra("image", imageData);
                startActivity(intent);
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "okay clicked", Toast.LENGTH_SHORT).show();
            }
        });*/

        okay_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Good Choice..!!", Toast.LENGTH_SHORT).show();
            }
        });
        imgCar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        imgCar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        imgCar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        imgCar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();

        cancel_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
            }
        });
        imgCar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        imgCar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        imgCar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        imgCar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }

    private void setOnClickListener() {
        btnPickCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();*/
                openCarPickerDialog();
            }
        });
    }

    private void initView() {
        btnPickCar = findViewById(R.id.btnPickCar);
        dialog = new Dialog(MainActivity.this);
    }
}