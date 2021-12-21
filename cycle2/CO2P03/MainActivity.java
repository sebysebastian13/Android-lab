package com.example.sjcet.c02p03;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText text;
    Button clickme;
    String Texthere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickme = (Button)findViewById(R.id.button);
        text = (EditText)findViewById(R.id.text);
        clickme.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Texthere = text.getText().toString();
                Intent intent = new Intent(MainActivity.this,
                        Main2Activity.class);
                intent.putExtra("Text",Texthere);
                startActivity(intent);


            }
        });
    }
}