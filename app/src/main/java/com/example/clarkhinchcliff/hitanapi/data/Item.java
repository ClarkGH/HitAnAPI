package com.example.clarkhinchcliff.hitanapi.data;

import org.json.JSONObject;

/**
 * Created by clarkhinchcliff on 4/20/16.
 */
public class Item implements JSONPopulator {
    private Condition condition;
    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        condition.populate(populate('condition'));
    }
}
