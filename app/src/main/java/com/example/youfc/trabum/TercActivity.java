package com.example.youfc.trabum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class TercActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    public static final String [] ATIVIDADES = new String[]{
      "Limpar a casa","Jogar Bola","Fazer Atividade","Compras","Alimentar cachorro"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terc);

        AutoCompleteTextView edtText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, ATIVIDADES);
        edtText.setAdapter(adapter);


        Spinner spn = findViewById(R.id.spn1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.cores, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn.setAdapter(adapter1);

        spn.setOnItemSelectedListener(this);

        final RadioGroup rdgroup = (RadioGroup) findViewById(R.id.radioGroup);
        Button btnVotar = (Button) findViewById(R.id.btnvotar);

        btnVotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rdgroup.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton)findViewById(id);
                Toast.makeText(TercActivity.this, "Você votou: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String stg = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), stg, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
