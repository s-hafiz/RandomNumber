package com.begginers.randomnumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.but_m_f0R);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double ran;
                String str;
                String total="";
                EditText edit = (EditText) findViewById(R.id.editText);
                for (int i =0;i<20;i++){
                    ran = Math.random();
                    str=ran.toString();
                    total=total+"\n"+str;
                    edit.setText(total);
                }
            }
        });
    }
    public void clearScreen(View v){
        EditText edit = (EditText)findViewById(R.id.editText);
        edit.setText("");
        Toast.makeText(this,"Screen Cleared !",Toast.LENGTH_SHORT).show();
    }
}
