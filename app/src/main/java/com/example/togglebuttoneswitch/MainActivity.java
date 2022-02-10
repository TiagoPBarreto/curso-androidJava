package com.example.togglebuttoneswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.service.controls.templates.ToggleRangeTemplate;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private CheckBox checkSenha;
    private TextView textResultado;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha   = findViewById(R.id.toggleSenha);
        switchSenha   = findViewById(R.id.switchSenha);
        textResultado = findViewById(R.id.textResultado);
        checkSenha    = findViewById(R.id.checkSenha);
        adicionarListner();

    }

    public void adicionarListner(){

        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if (isChecked){

                    textResultado.setText("ligado");

                } else{
                    textResultado.setText("Desligado");
                }


            }
        });

    }

    public void enviar(View view){
            //if (switchSenha.isChecked())
            //if (toggleSenha.isChecked())
        if (checkSenha.isChecked()){

            textResultado.setText("check ligado");

        } else{
            textResultado.setText("check Desligado");
        }

    }

}