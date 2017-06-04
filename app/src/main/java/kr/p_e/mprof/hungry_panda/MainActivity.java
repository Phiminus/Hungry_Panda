package kr.p_e.mprof.hungry_panda;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder AlertDialog;
    EditText id,password;
    ImageButton signin, guest;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = (EditText)findViewById(R.id.editText);
        id = (EditText)findViewById(R.id.editText2);

        signin = (ImageButton)findViewById(R.id.imageButton);
        guest = (ImageButton)findViewById(R.id.imageButton3);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id.getText().toString().equals("manzi") && password.getText().toString().equals("0815")) {
                    Intent intent = new Intent(MainActivity.this, ReguralActivity.class);
                    startActivity(intent);
                }
            }
        });

        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GuestActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {

        AlertDialog = new AlertDialog.Builder(MainActivity.this);

        AlertDialog.setTitle("애플리케이션을 종료하시겠습니까?");

        AlertDialog.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });


        AlertDialog.show();

    }
}
