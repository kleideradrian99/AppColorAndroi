package com.example.cambiarfondosapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (ConstraintLayout)findViewById(R.id.cambiarfont);
        Color color = new Color();
    }

    public void fontyellow(View view){
      layout.setBackgroundColor(Color.rgb(255,239,10));
      notificacion();
//      layout.setBackgroundColor(Color.parseColor("#0a1fff"));
    }
    public void fontblue(View view){
//      layout.setBackgroundColor(Color.rgb(255,239,10));
      layout.setBackgroundColor(Color.parseColor("#0a1fff"));
        notificacion();
    }
    public void fontred(View view){
      layout.setBackgroundColor(Color.rgb(255,10,10));
        notificacion();
//      layout.setBackgroundColor(Color.parseColor("#0a1fff"));
    }
    public void fontgreen(View view){
//      layout.setBackgroundColor(Color.rgb(255,239,10));
      layout.setBackgroundColor(Color.parseColor("#0eff0a"));
        notificacion();
    }

    public void notificacion(){
        Toast notificac =   Toast.makeText(this,"Cambiaste el color",Toast.LENGTH_LONG);
        notificac.show();
    }
}
