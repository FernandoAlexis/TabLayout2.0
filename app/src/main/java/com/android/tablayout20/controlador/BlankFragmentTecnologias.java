package com.android.tablayout20.controlador;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.tablayout20.R;


public class BlankFragmentTecnologias extends Fragment {


    Button button;
    String url;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank_tecnologias, container,false);
        button=v.findViewById(R.id.btnFragment);
        url="https://www.univo.edu.sv/";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String asunto = "Me interesa tus servicios";
                Intent intent= new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_SUBJECT, asunto);
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Elije un cliente de Correo"));
            }
        });

       return v;
    }
}