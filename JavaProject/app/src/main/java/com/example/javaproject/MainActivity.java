package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.javaproject.survey.Section1Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tablet_template);

        FrameLayout sideContainer = findViewById(R.id.standard_side_sheet);
        ConstraintLayout loginContainer = findViewById(R.id.login_container);
        ImageView menuImage = findViewById(R.id.iv_menu);
        TextView loginText = sideContainer.findViewById(R.id.tv_login);
        TextView mbtiText = sideContainer.findViewById(R.id.tv_check_mbti);
        Button loginButton = loginContainer.findViewById(R.id.btn_login);
        Button exitButton = loginContainer.findViewById(R.id.btn_exit);
        EditText idEditText = loginContainer.findViewById(R.id.et_login_id);
        EditText passwordEditText = loginContainer.findViewById(R.id.et_login_password);

        initMenu(menuImage, sideContainer);
        initLogin(loginText, loginContainer);
        initMBTISurvey(mbtiText);
        exit(exitButton, loginContainer);
        loginButton.setOnClickListener(v-> {
            login(idEditText.getText().toString(), passwordEditText.getText().toString(), loginContainer, loginText);
        });
    }

    private void initMenu(ImageView menu, FrameLayout sideContainer) {
        menu.setOnClickListener(v -> {
            if (sideContainer.getVisibility() == View.VISIBLE) {
                sideContainer.setVisibility(View.INVISIBLE);
            } else {
                sideContainer.setVisibility(View.VISIBLE);
            }
        });
    }

    private void initLogin(TextView login, ConstraintLayout loginContainer) {
        login.setOnClickListener(v -> {
            if (loginContainer.getVisibility() == View.INVISIBLE) {
                if (!login.getText().equals("health님")) {
                    loginContainer.setVisibility(View.VISIBLE);
                } else {
                    new AlertDialog.Builder(v.getContext())
                            .setTitle("로그아웃")
                            .setMessage("로그아웃 하시겠습니까?")
                            .setPositiveButton("네", (dialog, which) -> {
                                login.setText("로그인");
                            })
                            .setNegativeButton("아니오", null)
                            .show();
                }
            }
        });
    }

    private void initMBTISurvey(TextView mbtiText) {
        mbtiText.setOnClickListener(v -> {
            startActivity(new Intent(this, Section1Activity.class));
        });
    }

    private void exit(Button exit, ConstraintLayout loginContainer) {
        exit.setOnClickListener(v -> {
            loginContainer.setVisibility(View.INVISIBLE);
        });
    }

    private void login(String id, String password, ConstraintLayout loginContainer, TextView loginText) {
            if (id.equals("health") && password.equals("health123")) {
                loginContainer.setVisibility(View.INVISIBLE);
                loginText.setText(id + "님");
            }
    }
}