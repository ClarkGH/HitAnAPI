package com.example.clarkhinchcliff.hitanapi.service;

/**
 * Created by clarkhinchcliff on 4/20/16.
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
