package com.mfizaralfian.belajartunarungufizarapp.DataDua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor.PanduanTutorDuaActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor.PanduanTutorSatuActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor.PanduanTutorTigaActivity;
import com.mfizaralfian.belajartunarungufizarapp.R;

public class DaftarVideoActivity extends AppCompatActivity {
    ImageView kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_video);

        //-----------------------kembali----------------------------------
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //-----------------------musik----------------------------------
    }

    public void onClick1(View v) {
        Intent i = new Intent(this, TutorialVideoSatuActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick2(View v) {
        Intent i = new Intent(this, TutorialVideoDuaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick3(View v) {
        Intent i = new Intent(this, TutorialVideoTigaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClick4(View v) {
        Intent i = new Intent(this, TutorialVideoEmpatActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClick5(View v) {
        Intent i = new Intent(this, TutorialVideoLimactivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClick11(View v) {
        Intent i = new Intent(this, PanduanTutorSatuActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick22(View v) {
        Intent i = new Intent(this, PanduanTutorDuaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick33(View v) {
        Intent i = new Intent(this, PanduanTutorTigaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }



}