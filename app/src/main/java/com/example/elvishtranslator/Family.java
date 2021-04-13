package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Family extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);



       ListView listf = (ListView) findViewById(R.id.mainContainerF);

      ArrayList<Palabra> familyList = new ArrayList<Palabra>();
        Palabra fam1 = new Palabra("Madre", "Naneth", R.drawable.mother);
        familyList.add(fam1);
        Palabra fam2 = new Palabra("Padre", "Adanadar", R.drawable.father);
        familyList.add(fam2);
        Palabra fam3 = new Palabra("Hijo", "Ionn", R.drawable.son);
        familyList.add(fam3);
        Palabra fam4 = new Palabra("Hija", "Sell", R.drawable.daughter);
        familyList.add(fam4);
        Palabra fam5 = new Palabra("Hermano", "Muindor", R.drawable.brother);
        familyList.add(fam5);
        Palabra fam6 = new Palabra("Hermana", "Muinthel", R.drawable.sister);
        familyList.add(fam6);

        PalabraAdapter familyAdapter = new PalabraAdapter(this, 0, familyList);
        listf.setAdapter(familyAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(), "Selección: " + familyList.get(i).getEspanyol(), Toast.LENGTH_SHORT).show();
            }
        };
    listf.setOnItemClickListener(onItemClickListener);



    }

}