package com.manjil.weathersense.feature.hourlyWeather;

import androidx.annotation.NonNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HourlyWeatherPresenter implements HourlyWeatherContract.Presenter{
    private final HourlyWeatherContract.View view;
    private final HourlyWeatherModel model = new HourlyWeatherModel();

    public HourlyWeatherPresenter(HourlyWeatherContract.View view) {
        this.view = view;
    }

    @Override
    public void setHourlyWeather(double lat, double lon) {
        model.getHourlyWeather(lat, lon).enqueue(new Callback<HourlyWeatherPojo>() {
            @Override
            public void onResponse(@NonNull Call<HourlyWeatherPojo> call, @NonNull Response<HourlyWeatherPojo> response) {
                if (response.isSuccessful()){
                    view.setHourlyWeather(response.body());
                }else {
                    view.showErrorMessage("Failed to load hourly weather forecast data. Error "+response.code());
                }
            }

            @Override
            public void onFailure(@NonNull Call<HourlyWeatherPojo> call, @NonNull Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
