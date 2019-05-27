package com.example.aluno.appaulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSobre;
    private Button btnLab01;
    private Button btnLab02;
    private ImageButton ibtnBatata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSobre = (Button) findViewById(R.id.btnSobre);
        btnSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BATATA", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, SobreActivity.class));
            }
        });

        btnLab01 = (Button) findViewById(R.id.btnLab1);
        btnLab01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lab1Activity.class));
            }
        });

        btnLab02 = (Button) findViewById(R.id.btnLab2);
        btnLab02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lab2Activity.class));
            }
        });

        ibtnBatata = (ImageButton) findViewById(R.id.ibtnBatata);

        ibtnBatata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BATATA BATATA BATATA BATATA", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "BATATA BATATA BATATA BATATA", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "BATATA BATATA BATATA BATATA", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
