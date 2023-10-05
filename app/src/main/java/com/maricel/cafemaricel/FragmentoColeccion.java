package com.maricel.cafemaricel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoColeccion extends Fragment {
    View view;
    Button btn1;
    Button btn2;

    Button btn3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmeto_coleccion, container, false);

        btn1 = (Button) view.findViewById(R.id.btnPrimerboton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Disfruten de un delicioso cafe" +
                        "", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton Dos
        btn2 = (Button) view.findViewById(R.id.btnSegundoBoton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Cafe sin Azucar", Toast.LENGTH_SHORT).show();
            }
        });
        //Boton tres
        btn3 = (Button) view.findViewById(R.id.btnTercerBoton);
        btn3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(getActivity(), "Cafe Descafeinado", Toast.LENGTH_SHORT).show();
                                    }
                                });
//
                return view;
            }
        }
