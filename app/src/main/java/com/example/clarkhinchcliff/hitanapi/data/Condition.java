package com.example.clarkhinchcliff.hitanapi.data;

import org.json.JSONObject;

/**
 * Created by clarkhinchcliff on 4/20/16.
 */
public class Condition implements JSONPopulator {
    private int code;
    private int temperature;
    private String description;

    public int getCode() {
        return code;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void populate(JSONObject data) {

    }
}
