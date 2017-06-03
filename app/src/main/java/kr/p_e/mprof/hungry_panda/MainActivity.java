package kr.p_e.mprof.hungry_panda;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        AlertDialog.Builder AlertDialog;
    EditText id,password;
    Button signin, guest;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = (EditText)findViewById(R.id.editText);
        id = (EditText)findViewById(R.id.editText2);

        guest = (Button)findViewById(R.id.button2);
        signin = (Button)findViewById(R.id.button4);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id.getText().toString().equals("manzi") && password.getText().toString().equals("0815"))
                {
               //     Intent intent = new Intent(MainActivity.this, ); // TODO 로그인 넘어갈 곳 지정
              //      startActivity(intent);
                    Toast.makeText(getApplicationContext(),"LOGIN",Toast.LENGTH_SHORT);
                }
            }
        });
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Intent intent = new Intent(MainActivity.this, ); // TODO 게스트 넘어갈 곳 지정
             //   startActivity(intent);

                Toast.makeText(getApplicationContext(),"GUEST",Toast.LENGTH_SHORT);
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
