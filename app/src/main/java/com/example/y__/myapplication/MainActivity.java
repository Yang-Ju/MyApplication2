package com.example.y__.myapplication;

import android.opengl.ETC1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void tema1_add1(View view){
        TextView tema1_score=(TextView) findViewById(R.id.tema1_score);
        int tema1_totle_score=Integer.parseInt(tema1_score.getText().toString())+1;
        tema1_score.setText(tema1_totle_score+"");
    }
    public void tema1_add2(View view){
       TextView tema1_score=(TextView) findViewById(R.id.tema1_score);
        int tema1_totle_score=Integer.parseInt(tema1_score.getText().toString())+2;
        tema1_score.setText(tema1_totle_score+"");
    }
    public void tema1_add3(View view ){
        TextView tema1_score=(TextView) findViewById(R.id.tema1_score);
        int tema1_totle_score=Integer.parseInt(tema1_score.getText().toString())+3;
        tema1_score.setText(tema1_totle_score+"");
    }
    public void tema2_add1(View view){
        TextView tema2_score=(TextView) findViewById(R.id.tema2_score);
        int tema2_totle_score=Integer.parseInt(tema2_score.getText().toString())+1;
        tema2_score.setText(tema2_totle_score+"");
    }
    public void tema2_add2(View view){
        TextView tema2_score=(TextView) findViewById(R.id.tema2_score);
        int tema2_totle_score=Integer.parseInt(tema2_score.getText().toString())+2;
        tema2_score.setText(tema2_totle_score+"");
    }
    public void tema2_add3(View view ){
        TextView tema2_score=(TextView) findViewById(R.id.tema2_score);
        int tema2_totle_score=Integer.parseInt(tema2_score.getText().toString())+3;
        tema2_score.setText(tema2_totle_score+"");
    }
    public void RESERT(View view){
        TextView tema1_score=(TextView) findViewById(R.id.tema1_score);
        TextView tema2_score=(TextView) findViewById(R.id.tema2_score);
        tema1_score.setText(0+"");
        tema2_score.setText(0+"");
    }
}
