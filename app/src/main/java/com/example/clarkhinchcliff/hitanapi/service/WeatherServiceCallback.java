package com.example.clarkhinchcliff.hitanapi.service;

import com.example.clarkhinchcliff.hitanapi.data.Channel;

/**
 * Created by clarkhinchcliff on 4/20/16.
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
