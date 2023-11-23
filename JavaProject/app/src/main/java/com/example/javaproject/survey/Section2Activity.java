package com.example.javaproject.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.javaproject.R;

import java.util.concurrent.atomic.AtomicInteger;

public class Section2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablet_section2);
        Log.e("로그", this.getIntent().getStringExtra("Section1"));

        CheckBox question1_answerA = findViewById(R.id.cb1_s2_q1_a);
        CheckBox question1_answerB = findViewById(R.id.cb2_s2_q1_b);
        CheckBox question2_answerA = findViewById(R.id.cb1_s2_q2_a);
        CheckBox question2_answerA_2 = findViewById(R.id.cb2_s2_q2_a);
        CheckBox question2_answerB = findViewById(R.id.cb3_s2_q2_b);
        CheckBox question2_answerB_2 = findViewById(R.id.cb4_s2_q2_b);
        CheckBox question2_answerB_3 = findViewById(R.id.cb5_s2_q2_b);
        CheckBox question3_answerA = findViewById(R.id.cb1_s2_q3_a);
        CheckBox question3_answerB = findViewById(R.id.cb2_s2_q3_b);

        Button buttonOK = findViewById(R.id.btn_ok);
        buttonOK.setOnClickListener(v -> {
            AtomicInteger countI = new AtomicInteger();
            AtomicInteger countO = new AtomicInteger();

            if (question1_answerA.isChecked()) {
                countI.set(countI.get() + 1);
            }
            if (question1_answerB.isChecked()) {
                countO.set(countO.get() + 1);
            }
            if (question2_answerA.isChecked()) {
                countI.set(countI.get() + 1);
            }
            if (question2_answerA_2.isChecked()) {
                countI.set(countI.get() + 1);
            }
            if (question2_answerB.isChecked()) {
                countO.set(countO.get() + 1);
            }
            if (question2_answerB_2.isChecked()) {
                countO.set(countO.get() + 1);
            }
            if (question2_answerB_3.isChecked()) {
                countO.set(countO.get() + 1);
            }
            if (question3_answerA.isChecked()) {
                countI.set(countI.get() + 1);
            }
            if (question3_answerB.isChecked()) {
                countO.set(countO.get() + 1);
            }

            Intent intent = new Intent(this, Section3Activity.class);
            intent.putExtra("Section1", this.getIntent().getStringExtra("Section1"));
            if (countI.get() > countO.get()) {
                intent.putExtra("Section2", "I");
                startActivity(intent);
            } else {
                intent.putExtra("Section2", "O");
                startActivity(intent);
            }

        });

    }
}