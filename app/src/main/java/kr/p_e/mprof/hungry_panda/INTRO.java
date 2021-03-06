package kr.p_e.mprof.hungry_panda;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class INTRO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run(){
                    Intent intent = new Intent(INTRO.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 3000);
    }
}