package com.mfizaralfian.belajartunarungufizarapp.Tutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor.PanduanTutorEmpatActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor.PanduanTutorEnamActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor.PanduanTutorLimaActivity;
import com.mfizaralfian.belajartunarungufizarapp.R;

public class TutorSatuActivity extends AppCompatActivity {
    ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_satu);

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


    public void onClick4(View v) {
        Intent i = new Intent(this, PanduanTutorEmpatActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClick5(View v) {
        Intent i = new Intent(this, PanduanTutorLimaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClick6(View v) {
        Intent i = new Intent(this, PanduanTutorEnamActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

}