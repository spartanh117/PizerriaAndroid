package com.example.pizerriaandroid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavoritaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavoritaFragment extends Fragment {
    private TextView favorita;
    public FavoritaFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FavoritaFragment newInstance(String param1, String param2) {
        FavoritaFragment fragment = new FavoritaFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorita, container, false);
        // Inflate the layout for this fragment
        SharedPreferences preferencias = getActivity().getSharedPreferences(String.valueOf(R.string.preference_file_key), Context.MODE_PRIVATE);


        favorita = (TextView)view.findViewById(R.id.favorita);
        favorita.setText(preferencias.getString("Favorita","No hay Pizza favorita"));

        favorita.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Confirmar().alert();
            }
        });
        return view;
    }
}