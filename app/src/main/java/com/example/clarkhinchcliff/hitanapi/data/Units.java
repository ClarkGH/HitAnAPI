package com.example.clarkhinchcliff.hitanapi.data;

import org.json.JSONObject;

/**
 * Created by clarkhinchcliff on 4/20/16.
 */
public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }
}
