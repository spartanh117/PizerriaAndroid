package com.example.pizerriaandroid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PredeterminadasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PredeterminadasFragment extends Fragment {

    private ArrayAdapter<String> adapter;
    private ListView listview;
    private DAOPizzas DAO;

    public PredeterminadasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * @return A new instance of fragment PredeterminadasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PredeterminadasFragment newInstance(String param1, String param2) {
        PredeterminadasFragment fragment = new PredeterminadasFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_predeterminadas, container, false);
        // Inflate the layout for this fragment
        DAO = new DAOPizzas();
        listview = (ListView)view.findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,DAO.mostrar());
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Pizza prueab = DAO.getListaPizza().get(position);
                new Confirmar(DAO.getListaPizza().get(position),getContext()).alert();
            }
        });
        return view;
    }
}