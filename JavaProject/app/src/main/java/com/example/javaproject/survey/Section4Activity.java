package com.example.javaproject.survey;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javaproject.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class Section4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section4);
        Log.e("로그", this.getIntent().getStringExtra("Section1"));
        Log.e("로그", this.getIntent().getStringExtra("Section2"));
        Log.e("로그", this.getIntent().getStringExtra("Section3"));

        CheckBox question1_answerB = findViewById(R.id.cb1_s4_q1_b);
        CheckBox question1_answerS = findViewById(R.id.cb2_s4_q1_s);
        CheckBox question1_answerG = findViewById(R.id.cb3_s4_q1_g);
        CheckBox question1_answerP = findViewById(R.id.cb4_s4_q1_p);

        CheckBox question2_answerB = findViewById(R.id.cb1_s4_q2_b);
        CheckBox question2_answerS = findViewById(R.id.cb2_s4_q2_s);
        CheckBox question2_answerG = findViewById(R.id.cb3_s4_q2_g);
        CheckBox question2_answerP = findViewById(R.id.cb4_s4_q2_p);

        CheckBox question3_answerB = findViewById(R.id.cb1_s4_q3_b);
        CheckBox question3_answerS = findViewById(R.id.cb2_s4_q3_s);
        CheckBox question3_answerG = findViewById(R.id.cb3_s4_q3_g);
        CheckBox question3_answerP = findViewById(R.id.cb4_s4_q3_p);

        CheckBox question4_answerBS = findViewById(R.id.cb2_s4_q4_b_s);
        CheckBox question4_answerGP = findViewById(R.id.cb1_s4_q4_g_p);

        CheckBox question5_answerBS = findViewById(R.id.cb2_s4_q5_b_s);
        CheckBox question5_answerGP = findViewById(R.id.cb1_s4_q5_g_p);

        Button buttonOK = findViewById(R.id.btn_ok);
        buttonOK.setOnClickListener(v -> {
            AtomicInteger userCount = new AtomicInteger();

            if (question1_answerB.isChecked()) {
                userCount.set(userCount.get() + 1);
            }
            if (question1_answerS.isChecked()) {
                userCount.set(userCount.get() + 2);
            }
            if (question1_answerG.isChecked()) {
                userCount.set(userCount.get() + 3);
            }
            if (question1_answerP.isChecked()) {
                userCount.set(userCount.get() + 4);
            }
            if (question2_answerB.isChecked()) {
                userCount.set(userCount.get() + 1);
            }
            if (question2_answerS.isChecked()) {
                userCount.set(userCount.get() + 2);
            }
            if (question2_answerG.isChecked()) {
                userCount.set(userCount.get() + 3);
            }
            if (question2_answerP.isChecked()) {
                userCount.set(userCount.get() + 4);
            }
            if (question3_answerB.isChecked()) {
                userCount.set(userCount.get() + 1);
            }
            if (question3_answerS.isChecked()) {
                userCount.set(userCount.get() + 2);
            }
            if (question3_answerG.isChecked()) {
                userCount.set(userCount.get() + 3);
            }
            if (question3_answerP.isChecked()) {
                userCount.set(userCount.get() + 4);
            }
            if (question4_answerBS.isChecked()) {
                userCount.set(userCount.get() + 1);
            }
            if (question4_answerGP.isChecked()) {
                userCount.set(userCount.get() + 2);
            }
            if (question5_answerBS.isChecked()) {
                userCount.set(userCount.get() + 1);
            }
            if (question5_answerGP.isChecked()) {
                userCount.set(userCount.get() + 2);
            }

            Intent intent = new Intent(this, Section4Activity.class);
            intent.putExtra("Section1", this.getIntent().getStringExtra("Section1"));
            intent.putExtra("Section2", this.getIntent().getStringExtra("Section2"));
            intent.putExtra("Section3", this.getIntent().getStringExtra("Section3"));

            if (userCount.get() >= 5 || userCount.get() <= 7) {
                intent.putExtra("Section2", "B");
                startActivity(intent);
            } else if (userCount.get() >= 8 || userCount.get() <= 10){
                intent.putExtra("Section2", "S");
                startActivity(intent);
            } else if (userCount.get() >= 11 || userCount.get() <= 13){
                intent.putExtra("Section2", "G");
                startActivity(intent);
            } else if (userCount.get() >= 14){
                intent.putExtra("Section2", "P");
                startActivity(intent);
            }
        });
    }
}