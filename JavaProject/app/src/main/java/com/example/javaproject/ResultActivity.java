package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablet_result);


        TextView mbtiTextView = findViewById(R.id.tv_result_title_content);
        TextView tierTextView = findViewById(R.id.tv_tier_title_content);
        ImageView mbtiImageView = findViewById(R.id.iv_mbti);
        ImageView tierImageView = findViewById(R.id.iv_tier);
        TextView recommendTextView = findViewById(R.id.tv_recommend);

        String mbti = this.getIntent().getStringExtra("Section1") +
                this.getIntent().getStringExtra("Section2") +
                this.getIntent().getStringExtra("Section3");
        String tier = this.getIntent().getStringExtra("Section4");

        mbtiTextView.setText(mbti + "형");



        switch (mbti) {
            case "POC": {
                mbtiImageView.setBackground(getDrawable(R.drawable.butterfly));
                recommendTextView.setText(
                        "● 30분 ~ 1시간의 실외 조깅 또는 러닝\n" +
                                "● 20분의 실외 요가 루틴\n" +
                                "● 15분의 사이클링 또는 자전거 타기"
                );
                break;
            }
            case "POA": {
                mbtiImageView.setBackground(getDrawable(R.drawable.wolf));
                recommendTextView.setText(
                        "● 45분 ~ 1시간의 트레일 러닝 또는 하이킹\n" +
                                "● 30분의 산악 자전거 타기\n" +
                                "● 20분의 무산소 운동 (힘 단련 중심)"
                );
                break;
            }
            case "PIC": {
                mbtiImageView.setBackground(getDrawable(R.drawable.cat));
                recommendTextView.setText(
                        "● 30분 ~ 1시간의 실내 사이클링 또는 러닝머신\n" +
                                "● 20분의 실내 요가 또는 필라테스\n" +
                                "● 15분의 실내 수영 또는 물 에어로빅"
                );
                break;
            }
            case "PIA": {
                mbtiImageView.setBackground(getDrawable(R.drawable.bear));
                recommendTextView.setText(
                        "● 45분 ~ 1시간의 웨이트 트레이닝 또는 캘리스테닉스\n" +
                                "● 20분의 무산소 중량 훈련 (스트렝스 트레이닝)\n" +
                                "● 15분의 코어 강화 운동"
                );
                break;
            }
            case "GOC": {
                mbtiImageView.setBackground(getDrawable(R.drawable.deer));
                recommendTextView.setText(
                        "● 1시간의 그룹 러닝 또는 그룹 자전거 타기\n" +
                                "● 30분의 그룹 트레일 하이킹\n" +
                                "● 20분의 그룹 요가 또는 스트레칭"
                );
                break;
            }
            case "GOA": {
                mbtiImageView.setBackground(getDrawable(R.drawable.lion));
                recommendTextView.setText(
                        "● 45분 ~ 1시간의 단체 크로스핏 세션\n" +
                                "● 30분의 야외 팀 스포츠 (농구, 볼리볼 등)\n" +
                                "● 20분의 팀 빌딩 활동"
                );
                break;
            }
            case "GIC": {
                mbtiImageView.setBackground(getDrawable(R.drawable.dog));
                recommendTextView.setText(
                        "● 30분 ~ 1시간의 그룹 실내 사이클링 클래스\n" +
                                "● 20분의 그룹 요가 또는 필라테스\n" +
                                "● 15분의 그룹 에어로빅"
                );
                break;
            }
            case "GIA": {
                mbtiImageView.setBackground(getDrawable(R.drawable.leopard));
                recommendTextView.setText(
                        "● 45분 ~ 1시간의 단체 웨이트 트레이닝 클래스\n" +
                                "● 30분의 그룹 캘리스테닉스 세션\n" +
                                "● 20분의 무산소 중량 훈련 (스트렝스 트레이닝)"
                );
                break;
            }
        }

        switch (tier) {
            case "B": {
                tierImageView.setBackground(getDrawable(R.drawable.broze));
                tierTextView.setText("브론즈");
                break;
            }
            case "S": {
                tierImageView.setBackground(getDrawable(R.drawable.silver));
                tierTextView.setText("실버");
                break;
            }
            case "G": {
                tierImageView.setBackground(getDrawable(R.drawable.gold));
                tierTextView.setText("골드");
                break;
            }
            case "P": {
                tierImageView.setBackground(getDrawable(R.drawable.platinum));
                tierTextView.setText("플래티넘");
                break;
            }
        }


    }
}