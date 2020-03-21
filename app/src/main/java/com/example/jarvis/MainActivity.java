package com.example.jarvis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

import model.Descripciones;
import model.JarvisData;
import model.Rubro;

public class MainActivity extends AppCompatActivity {

    JarvisData jarvisData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jarvisData = new JarvisData();

        //No autocompletan porque no esta tomando el string del nombre
        MultiAutoCompleteTextView multiRubros = (MultiAutoCompleteTextView) findViewById(R.id.multiRubros);
        ArrayAdapter<Rubro> adapterRubros = new ArrayAdapter<Rubro>(this, android.R.layout.simple_list_item_1, jarvisData.getRubros());
        multiRubros.setAdapter(adapterRubros);
        multiRubros.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        MultiAutoCompleteTextView multiDescrip = findViewById(R.id.multiDescripcion);
        ArrayAdapter<Descripciones> adapterDescripciones = new ArrayAdapter<Descripciones>(this, android.R.layout.simple_expandable_list_item_1, jarvisData.getDescripciones());
        multiDescrip.setAdapter(adapterDescripciones);
        multiDescrip.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    public void onClik(View view) {
        Rubro rubro = new Rubro();
        List<Descripciones> descripciones = new ArrayList<>();
        //Falta
    }
}
