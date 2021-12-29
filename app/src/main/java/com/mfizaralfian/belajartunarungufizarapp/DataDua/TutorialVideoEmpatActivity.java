package com.mfizaralfian.belajartunarungufizarapp.DataDua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.belajartunarungufizarapp.DataDua.MateriVideo.PlayVideoEmpatActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.Materi.MateriEmpatActivity;
import com.mfizaralfian.belajartunarungufizarapp.R;

public class TutorialVideoEmpatActivity extends AppCompatActivity {
    ImageView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_video_empat);

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
        Intent i = new Intent(this, PlayVideoEmpatActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny

    }

    public void onClickTutor(View v) {
        Intent i = new Intent(this, MateriEmpatActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny

    }
}