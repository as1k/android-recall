package com.example.p07fragmentapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    private Button btnOpenNextScreen;

    private FragmentButtonListener listener;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (MainActivity)context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnOpenNextScreen = view.findViewById(R.id.buttonOpenNextScreen);
        btnOpenNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(listener != null) {
//                    listener.myClick("Hello World!");
//                }
                ((MainActivity)getActivity()).openNextScreen("Qwerty");
            }
        });
    }

    interface FragmentButtonListener {

        void myClick(String text);

    }
}
