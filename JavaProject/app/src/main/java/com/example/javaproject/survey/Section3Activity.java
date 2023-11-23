package com.example.javaproject.survey;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javaproject.R;

import java.util.concurrent.atomic.AtomicInteger;

public class Section3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablet_section3);
        Log.e("로그", this.getIntent().getStringExtra("Section1"));
        Log.e("로그", this.getIntent().getStringExtra("Section2"));

        CheckBox question1_answerA = findViewById(R.id.cb1_s3_q1_a);
        CheckBox question1_answerA_2 = findViewById(R.id.cb2_s3_q1_a);
        CheckBox question1_answerA_3 = findViewById(R.id.cb3_s3_q1_a);
        CheckBox question1_answerB = findViewById(R.id.cb4_s3_q1_b);
        CheckBox question1_answerB_2 = findViewById(R.id.cb5_s3_q1_b);
        CheckBox question2_answerA = findViewById(R.id.cb1_s3_q2_a);
        CheckBox question2_answerA_2 = findViewById(R.id.cb2_s3_q2_a);
        CheckBox question2_answerB = findViewById(R.id.cb3_s3_q2_b);
        CheckBox question2_answerB_2 = findViewById(R.id.cb4_s3_q2_b);
        CheckBox question3_answerA = findViewById(R.id.cb1_s3_q3_a);
        CheckBox question3_answerB = findViewById(R.id.cb2_s3_q3_b);



        Button buttonOK = findViewById(R.id.btn_ok);
        buttonOK.setOnClickListener(v -> {
            AtomicInteger countC = new AtomicInteger();
            AtomicInteger countA = new AtomicInteger();

            if (question1_answerA.isChecked()) {
                countC.set(countC.get() + 1);
            }
            if (question1_answerA_2.isChecked()) {
                countC.set(countC.get() + 1);
            }
            if (question1_answerA_3.isChecked()) {
                countC.set(countC.get() + 1);
            }
            if (question1_answerB.isChecked()) {
                countA.set(countA.get() + 1);
            }
            if (question1_answerB_2.isChecked()) {
                countA.set(countA.get() + 1);
            }
            if (question2_answerA.isChecked()) {
                countC.set(countC.get() + 1);
            }
            if (question2_answerA_2.isChecked()) {
                countC.set(countC.get() + 1);
            }
            if (question2_answerB.isChecked()) {
                countA.set(countA.get() + 1);
            }
            if (question2_answerB_2.isChecked()) {
                countA.set(countA.get() + 1);
            }
            if (question3_answerA.isChecked()) {
                countC.set(countC.get() + 1);
            }
            if (question3_answerB.isChecked()) {
                countA.set(countA.get() + 1);
            }

            Intent intent = new Intent(this, Section4Activity.class);
            intent.putExtra("Section1", this.getIntent().getStringExtra("Section1"));
            intent.putExtra("Section2", this.getIntent().getStringExtra("Section2"));
            if (countC.get() > countA.get()) {
                intent.putExtra("Section3", "C");
                startActivity(intent);
            } else {
                intent.putExtra("Section3", "A");
                startActivity(intent);
            }

        });

    }
}