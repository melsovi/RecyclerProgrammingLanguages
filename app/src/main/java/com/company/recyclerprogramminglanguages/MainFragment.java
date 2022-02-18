package com.company.recyclerprogramminglanguages;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView recyclerView;
    private LanguagesAdapter languagesAdapter;
    private ArrayList<String> languages;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        languagesAdapter = new LanguagesAdapter(languages);
        recyclerView.setAdapter(languagesAdapter);
    }

    private void loadData() {
        languages = new ArrayList<>();
            languages.add("Java");
            languages.add("Python");
            languages.add("C++");
            languages.add("C#");
            languages.add("Kotlin");
            languages.add("Swift");
            languages.add("BASIC");
            languages.add("BlooP");
            languages.add("Boomerang");
            languages.add("Bosque");
            languages.add("C");
            languages.add("C--");
            languages.add("C*");
            languages.add("Cecil");
            languages.add("CLIPS");
            languages.add("CLU");
            languages.add("DataFlex");
            languages.add("dBase");
            languages.add("eC");
            languages.add("Erlang");
            languages.add("ESPOL");
            languages.add("F");
            languages.add("Focus");
            languages.add("GDScript");
            languages.add("Golo");
            languages.add("IDL");
            languages.add("JavaScript");
            languages.add("Jython");
            languages.add("KRYPTON");
            languages.add("Lansa");
            languages.add("Lynx");
            languages.add("MAD");
            languages.add("MIVA Script");
            languages.add("Net.Data");
            languages.add("NPL");
            languages.add("NXT-G");
            languages.add("Oberon");
            languages.add("PDL");
            languages.add("Pizza");
    }


}