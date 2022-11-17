package com.geekym.face_recognition_engage.HomeFragments.Tools;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geekym.face_recognition_engage.HomeFragments.Tools.PDFs.PDFs_Activity;
import com.geekym.face_recognition_engage.HomeFragments.Tools.StudyMode.StudyProgress_Activity;
import com.geekym.face_recognition_engage.HomeFragments.Tools.StudyMode.StudyTimer_Activity;
import com.geekym.face_recognition_engage.R;

public class tools_fragment extends Fragment {

    CardView userPDFs, studyGraph, studyTimer;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tools, container, false);

        Initialization(view);

        userPDFs.setOnClickListener(v -> startActivity(new Intent(getContext(), PDFs_Activity.class)));

        studyTimer.setOnClickListener(v -> startActivity(new Intent(getContext(), StudyTimer_Activity.class)));

        studyGraph.setOnClickListener(v -> startActivity(new Intent(getContext(), StudyProgress_Activity.class)));

        return view;
    }

    private void Initialization(View view) {
        userPDFs = view.findViewById(R.id.pdf_card);
        studyGraph = view.findViewById(R.id.studyGraph_card);
        studyTimer = view.findViewById(R.id.timer_card);
    }
}