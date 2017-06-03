package kr.p_e.mprof.hungry_panda;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        AlertDialog.Builder AlertDialog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {

        AlertDialog = new AlertDialog.Builder(MainActivity.this);

        AlertDialog.setTitle("EXIT?");
        AlertDialog.setMessage("DDD");

        AlertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"취소되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });


        AlertDialog.show();

    }
}
