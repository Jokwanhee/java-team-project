package com.example.javaproject.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.javaproject.MainActivity;
import com.example.javaproject.R;

import java.util.concurrent.atomic.AtomicInteger;


public class Section1Activity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablet_section1);
        CheckBox question1_answerA = findViewById(R.id.cb1_s1_q1);
        CheckBox question2_answerA = findViewById(R.id.cb1_s1_q2);
        CheckBox question3_answerA = findViewById(R.id.cb1_s1_q3);
        CheckBox question4_answerA = findViewById(R.id.cb1_s1_q4);
        CheckBox question5_answerA = findViewById(R.id.cb1_s1_q5);
        CheckBox question6_answerA = findViewById(R.id.cb1_s1_q6);


        Button buttonOK = findViewById(R.id.btn_ok);
        buttonOK.setOnClickListener(v -> {
            AtomicInteger countP = new AtomicInteger();
            AtomicInteger countG = new AtomicInteger();

            if (question1_answerA.isChecked()) {
                countP.set(countP.get() + 1);
            }
            if (question2_answerA.isChecked()) {
                countG.set(countG.get() + 1);
            }
            if (question3_answerA.isChecked()) {
                countP.set(countP.get() + 1);
            }
            if (question4_answerA.isChecked()) {
                countG.set(countG.get() + 1);
            }
            if (question5_answerA.isChecked()) {
                countP.set(countP.get() + 1);
            }
            if (question6_answerA.isChecked()) {
                countG.set(countG.get() + 1);
            }

            Intent intent = new Intent(this, Section2Activity.class);
            if (countP.get() > countG.get()) {
                intent.putExtra("Section1", "P");
                startActivity(intent);
            } else {
                intent.putExtra("Section1", "G");
                startActivity(intent);
            }
        });

    }
}