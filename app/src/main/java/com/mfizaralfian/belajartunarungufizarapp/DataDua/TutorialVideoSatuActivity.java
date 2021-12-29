package com.mfizaralfian.belajartunarungufizarapp.DataDua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.belajartunarungufizarapp.DataDua.MateriVideo.PlayVideoSatuActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.Materi.MateriSatuActivity;
import com.mfizaralfian.belajartunarungufizarapp.R;

public class TutorialVideoSatuActivity extends AppCompatActivity {

    ImageView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_video_satu);

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

    public void onClickPlay(View v) {
        Intent i = new Intent(this, PlayVideoSatuActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClickTutor(View v) {
        Intent i = new Intent(this, MateriSatuActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
}