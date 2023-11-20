package com.example.javaproject;

import java.util.List;

public class Gym {
    private String gymId;
    private String gymName;
    private String gymLocation;
    private List<String> recommendedMBTI;

    public String getGymDetail() {
        return gymId + gymName + gymLocation;
    }
}
