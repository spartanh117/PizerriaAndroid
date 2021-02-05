package com.example.pizerriaandroid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PersonalizadaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PersonalizadaFragment extends Fragment {
    Button confirmar;
    RadioGroup tamanno;
    CheckBox Queso,Bacon,JamonYork,Pinna,Cebolla,Peperoni,Anchoas,Champinnones;

    SharedPreferences preferencias;
    SharedPreferences.Editor edit;

    Float precio;

    public PersonalizadaFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static PersonalizadaFragment newInstance(String param1, String param2) {
        PersonalizadaFragment fragment = new PersonalizadaFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private void setUpView(View view) {
        confirmar = (Button) view.findViewById(R.id.btnConfirmar);
        tamanno = (RadioGroup) view.findViewById(R.id.radioGroup);
        Queso = (CheckBox)view.findViewById(R.id.checkBox9);
        Bacon = (CheckBox)view.findViewById(R.id.checkBox4);
        JamonYork = (CheckBox)view.findViewById(R.id.checkBox);
        Pinna= (CheckBox)view.findViewById(R.id.checkBox7);
        Cebolla= (CheckBox)view.findViewById(R.id.checkBox6);
        Peperoni= (CheckBox)view.findViewById(R.id.checkBox11);
        Anchoas= (CheckBox)view.findViewById(R.id.checkBox3);
        Champinnones= (CheckBox)view.findViewById(R.id.checkBox8);

        preferencias = getActivity().getSharedPreferences(String.valueOf(R.string.preference_file_key), Context.MODE_PRIVATE);
        edit = preferencias.edit();

        precio = 0f;

    }

    public String getTamanno(){
        String strTammano = null;
        switch (tamanno.getCheckedRadioButtonId()){
            case R.id.RBpequenna:
                precio = 3.00f;
                strTammano = String.valueOf(R.string.radio_pequenna);
                break;
            case R.id.RBmediana:
                precio = 6.00f;
                strTammano = String.valueOf(R.string.radio_mediana);
                break;
            case R.id.RBgrande:
                precio = 9.00f;
                strTammano = String.valueOf(R.string.radio_grande);
                break;
            case R.id.RBfamiliar:
                precio = 11.00f;
                strTammano = String.valueOf(R.string.radio_familiar);
                break;
            case R.id.RBxxl:
                precio = 20.00f;
                strTammano = String.valueOf(R.string.radio_xxl);
                break;
        }
        return strTammano;
    }

    public String[] getIngredientes(){
        List<String> ingredientes = new ArrayList<String>();
        JamonYork.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ingredientes.add(String.valueOf(R.string.check_JamonYork));
                    precio+= 0.50F;
                }
                else {
                    ingredientes.remove(String.valueOf(R.string.check_JamonYork));
                    precio-= 0.50F;
                }
            }
        });
        Bacon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ingredientes.add(String.valueOf(R.string.check_bacon));
                    precio+= 0.50F;
                }
                else {
                    ingredientes.remove(String.valueOf(R.string.check_bacon));
                    precio-= 0.50F;
                }
            }
        });
        Queso.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ingredientes.add(String.valueOf(R.string.check_queso));
                    precio+= 0.50F;
                }
                else {
                    ingredientes.remove(String.valueOf(R.string.check_queso));
                    precio-= 0.50F;
                }
            }
        });
        Pinna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ingredientes.add(String.valueOf(R.string.check_pinna));
                    precio+= 1000F;
                }
                else {
                    ingredientes.remove(String.valueOf(R.string.check_pinna));
                    precio-= 1000F;
                }
            }
        });
        Cebolla.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ingredientes.add(String.valueOf(R.string.check_cebolla));
                    precio+= 0.50F;
                }
                else {
                    ingredientes.remove(String.valueOf(R.string.check_cebolla));
                    precio-= 0.50F;
                }
            }
        });
        Peperoni.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ingredientes.add(String.valueOf(R.string.check_peperoni));
                    precio+= 0.50F;
                }
                else {
                    ingredientes.remove(String.valueOf(R.string.check_peperoni));
                    precio-= 0.50F;
                }
            }
        });
        Anchoas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ingredientes.add(String.valueOf(R.string.check_anchoas));
                    precio+= 0.50F;
                }
                else {
                    ingredientes.remove(String.valueOf(R.string.check_anchoas));
                    precio-= 0.50F;
                }
            }
        });
        Champinnones.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ingredientes.add(String.valueOf(R.string.check_champinnones));
                    precio+= 0.50F;
                }
                else {
                    ingredientes.remove(String.valueOf(R.string.check_champinnones));
                    precio-= 0.50F;
                }
            }
        });
        return ingredientes.toArray(new String[ingredientes.size()]);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personalizada, container, false);

        setUpView(view);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Confirmar(new Pizza(getTamanno(),"Personalizada",precio,getIngredientes()),getContext()).alert();
            }
        });
        return view;
    }
}