package com.mfizaralfian.belajartunarungufizarapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.mfizaralfian.belajartunarungufizarapp.IntroVideo.VideoOoeActivity;
import com.mfizaralfian.belajartunarungufizarapp.IntroVideo.VideoThreeActivity;
import com.mfizaralfian.belajartunarungufizarapp.IntroVideo.VideoTwoTActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView exit1;
    LinearLayout btn1,btn2,btn3,btn4;

    //image slider---------

    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exit1 = (ImageView) findViewById(R.id.ivExit1);

        exit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Apakah Anda Ingin Keluar Dari Aplikasi?")
                        .setCancelable(false)
                        .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                MainActivity.super.onBackPressed();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                        //atur icont
                        .setTitle("Perhatian !!!")
                        .setIcon(R.drawable.cls);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoOoeActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoTwoTActivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoThreeActivity.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TentanAplikasiActivity.class);
                startActivity(intent);
            }
        });



        //--------------image slider-------------------------------
        imageSlider = findViewById(R.id.imege_slider);

        List<SlideModel> imageList = new ArrayList<>();

        //ArrayList imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/edukasitunarunguapp.appspot.com/o/FILE%20VIDEO%2FFile%20Gambar%2Fa6.png?alt=media&token=f4abb327-e889-4836-92b1-3d13a1dcb90a", "SELAMAT DATANG DI APLIKASI TUNARUNGU"));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/edukasitunarunguapp.appspot.com/o/FILE%20VIDEO%2FFile%20Gambar%2Fa7.png?alt=media&token=70a36b61-889e-4a57-8ee7-517805d322fd", "BELAJAR TUNARUNGU"));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/edukasitunarunguapp.appspot.com/o/FILE%20VIDEO%2FFile%20Gambar%2Fa8.png?alt=media&token=263bc202-8316-4ded-8e25-659881c8067e", "SELAMAT BERGABUNG"));

        imageSlider.setImageList(imageList, true);
    }
}