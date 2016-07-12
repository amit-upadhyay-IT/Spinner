package com.aupadhyay.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private String COUNTRIES[] = new String[]{"India", "China", "Aust", "asdf", "Indsadfia"};
    ArrayAdapter<String> arrayAdapter;

    public void initSpinner()
    {
        spinner = (Spinner) findViewById(R.id.spinner);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.addAll(COUNTRIES);
        arrayAdapter.add("USA");
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSpinner();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "You selected "+arrayAdapter.getItem(i),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
