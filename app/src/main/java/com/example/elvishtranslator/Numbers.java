package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ListView list = (ListView) findViewById(R.id.mainContainer);

        ArrayList<Palabra> palabraList = new ArrayList<Palabra>();
        Palabra pal1 = new Palabra("Uno", "mîn", R.drawable.uno);
        palabraList.add(pal1);
        Palabra pal2 = new Palabra("Dos", "tâd", R.drawable.dos);
        palabraList.add(pal2);
        Palabra pal3 = new Palabra("Tres", "nêl", R.drawable.tres);
        palabraList.add(pal3);
        Palabra pal4 = new Palabra("Cuatro", "canad", R.drawable.cuatro);
        palabraList.add(pal4);
        Palabra pal5 = new Palabra("Cinco", "leben", R.drawable.cinco);
        palabraList.add(pal5);
        Palabra pal6 = new Palabra("Seis", "eneg", R.drawable.seis);
        palabraList.add(pal6);
        Palabra pal7 = new Palabra("Siete", "odog", R.drawable.siete);
        palabraList.add(pal7);
        Palabra pal8 = new Palabra("Ocho", "tolodh", R.drawable.ocho);
        palabraList.add(pal8);
        Palabra pal9 = new Palabra("Nueve", "neder", R.drawable.nueve);
        palabraList.add(pal9);
        Palabra pal10 = new Palabra("Diez", "pae", R.drawable.diez);
        palabraList.add(pal10);

        PalabraAdapter palabraAdapter = new PalabraAdapter(this, 0, palabraList);
        list.setAdapter(palabraAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(), "Seleccion: " + palabraList.get(i).getEspanyol(), Toast.LENGTH_SHORT).show();
            }
        };

        list.setOnItemClickListener(onItemClickListener);


    }


}