package com.example.clarkhinchcliff.hitanapi;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.clarkhinchcliff.hitanapi.data.Channel;
import com.example.clarkhinchcliff.hitanapi.service.WeatherServiceCallback;
import com.example.clarkhinchcliff.hitanapi.service.YahooWeatherService;


public class WeatherActivity extends AppCompatActivity implements WeatherServiceCallback {

    private TextView temperatureTextView;
    private TextView conditionTextView;
    private TextView weatherTextView;

    private YahooWeatherService service;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        weatherTextView = (TextView)findViewById(R.id.weatherTextView);
        conditionTextView = (TextView)findViewById(R.id.conditionTextView);
        temperatureTextView = (TextView)findViewById(R.id.temperatureTextView);
        service = new YahooWeatherService(this);
        dialog = new ProgressDialog(this);
        dialog.setMessage('Hi felicia');
        dialog.show();

        service.refreshWeather("San Francisco", "CA");
    }

    @Override
    public void serviceSuccess(Channel channel) {
        dialog.hide();
    }

    @Override
    public void serviceFailure(Exception exception) {
        dialog.hide();
        Toast.makeText(this, exception.getMessage(), Toast.LENGTH_LONG).show();
    }
}
