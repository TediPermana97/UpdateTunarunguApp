package com.mfizaralfian.belajartunarungufizarapp.DataDua.TutorVideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.belajartunarungufizarapp.DataDua.PlayVideoActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.Tutorial.MateriTutorEmpatActivity;
import com.mfizaralfian.belajartunarungufizarapp.R;

public class VideoTutorEmpatActivity extends AppCompatActivity {
    ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tutor_empat);

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
        Intent i = new Intent(this, PlayVideoActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny

    }

    public void onClickTutor(View v) {
        Intent i = new Intent(this, MateriTutorEmpatActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny


    }
}