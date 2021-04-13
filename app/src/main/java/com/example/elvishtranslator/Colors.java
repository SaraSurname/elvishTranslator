package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);



        ListView listCol  = (ListView) findViewById(R.id.mainContainerColores);

        ArrayList<Palabra> colorList = new ArrayList<Palabra>();
        Palabra col1 = new Palabra("Rojo", "Caran", R.drawable.rojo);
        colorList.add(col1);
        Palabra col2 = new Palabra("Carmín", "Carnin", R.drawable.carmin);
        colorList.add(col2);
        Palabra col3 = new Palabra("Azul Marino", "Luin", R.drawable.azulmarino);
        colorList.add(col3);
        Palabra col4 = new Palabra("Azul", "Elu", R.drawable.azul);
        colorList.add(col4);
        Palabra col5 = new Palabra("Amarillo", "Malen", R.drawable.amarillo);
        colorList.add(col5);
        Palabra col6 = new Palabra("Verde", "Calen", R.drawable.verde);
        colorList.add(col6);
        Palabra col7 = new Palabra("Negro", "Morn", R.drawable.negro);
        colorList.add(col7);
        Palabra col8 = new Palabra("Marrón oscuro", "Baran", R.drawable.marronoscuro);
        colorList.add(col8);
        Palabra col9 = new Palabra("Marrón", "Rhosg", R.drawable.marron);
        colorList.add(col9);
        Palabra col10 = new Palabra("Blanco", "Faen", R.drawable.blanco);
        colorList.add(col10);
        Palabra col11 = new Palabra("Pálido", "Nimp", R.drawable.palido);
        colorList.add(col11);
        Palabra col12 = new Palabra("Gris", "Mith", R.drawable.gris);
        colorList.add(col12);
        Palabra col13 = new Palabra("Naranja", "Cull", R.drawable.naranja);
        colorList.add(col13);
        Palabra col14 = new Palabra("Rosa", "Crinth", R.drawable.rosa);
        colorList.add(col14);
        Palabra col15 = new Palabra("Violeta", "Ling", R.drawable.violeta);
        colorList.add(col15);

    PalabraAdapter colAd = new PalabraAdapter( this, 0, colorList);
    listCol.setAdapter(colAd);
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(), "Selección: " + colorList.get(i).getEspanyol()  , Toast.LENGTH_SHORT ).show();
            }
        };
        listCol.setOnItemClickListener(onItemClickListener);
    }



}