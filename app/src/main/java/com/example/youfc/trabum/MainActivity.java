package com.example.youfc.trabum;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton toggle = (ToggleButton) findViewById(R.id.tgbtn);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Ligado", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Desligado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btn = (Button) findViewById(R.id.btn);
        final EditText editemail = (EditText) findViewById(R.id.edtEmail);
        final EditText editsenha = (EditText) findViewById(R.id.edtSenha);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = editemail.getText().toString();
                String txt2 = editsenha.getText().toString();

                if (editemail.getText().toString().length() == 0 ){
                    editemail.setError("Email não pode ficar vazio");
                }else if (editsenha.getText().toString().length() == 0) {
                    editsenha.setError("Senha não pode ficar vazia");
                }else{
                    Toast.makeText(MainActivity.this, "Bem Vindo " + txt, Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, LogadoActivity.class);
                    startActivity(intent);
                }
                }
        });


    }
}
