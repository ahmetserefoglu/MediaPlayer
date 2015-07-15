package com.example.ahmet.myapplicationmediaplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends Activity {
    MediaPlayer mediaPlayer;
    Button btnbasla, btndur;
    TextView text;
    MediaPlayer media;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        btnbasla = (Button) findViewById(R.id.baslat);
        btndur = (Button) findViewById(R.id.dur);
        text = (TextView) findViewById(R.id.textView);



        final MediaPlayer media = MediaPlayer.create(MyActivity.this, R.raw.asd);

        btnbasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media.start();
                text.setText("caliyor");
            }
        });
        btndur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media.stop();
                text.setText("durduruldu");
            }
        });


    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
