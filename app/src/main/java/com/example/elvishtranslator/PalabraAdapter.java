package com.example.elvishtranslator;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class PalabraAdapter extends ArrayAdapter<Palabra> {

    public PalabraAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Palabra> palabra) {
        super(context, resource, palabra);


    }




    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {

        View list_item = convertView;
        // verificamos si la vista está vacía , y si es true, inflarla/pintarla
        if (list_item == null) {
            list_item = LayoutInflater.from(getContext()).inflate(R.layout.item_list_palabra, parent, false);
        }
            //nos traemos cada una de las palabras del Array
            Palabra currentPalabra = getItem(position);

        ImageView img = (ImageView) list_item.findViewById(R.id.imagen);
        img.setImageResource(currentPalabra.getImagenid());
            TextView textSpanish = (TextView) list_item.findViewById(R.id.textSpanish);
            textSpanish.setText(currentPalabra.getEspanyol());
            TextView textElvish = (TextView) list_item.findViewById(R.id.textElvish);
            textElvish.setText(currentPalabra.getEflico());

            return list_item;
        }

    }
