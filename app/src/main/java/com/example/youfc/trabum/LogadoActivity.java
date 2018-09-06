package com.example.youfc.trabum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LogadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logado);


     final EditText itemDG = findViewById(R.id.edt1);
     final Button btn = findViewById(R.id.btnadd);
     final ListView item_list = findViewById(R.id.list_items);

      //  adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, items);
      //  item_list.setAdapter(adapter);

        final Button avanca = findViewById(R.id.btnavc);
        avanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogadoActivity.this, TercActivity.class);
                startActivity(intent);
            }
        });
    }


    /*public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnadd:
                String item = itemDG.getText().toString();
                adapter.add(item);
                itemDG.setText("");


                Toast.makeText(this, "Idem adicionado", Toast.LENGTH_SHORT).show();
                break;
        }
    }*/

}
