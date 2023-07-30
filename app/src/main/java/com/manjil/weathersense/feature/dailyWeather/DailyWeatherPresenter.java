package com.manjil.weathersense.feature.dailyWeather;

import androidx.annotation.NonNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DailyWeatherPresenter implements DailyWeatherContract.Presenter{
    private final DailyWeatherContract.View view;
    private final DailyWeatherModel model = new DailyWeatherModel();

    public DailyWeatherPresenter(DailyWeatherContract.View view) {
        this.view = view;
    }

    @Override
    public void setDailyWeather(double lat, double lon) {
        model.getDailyForecast(lat, lon).enqueue(new Callback<DailyWeatherPojo>() {
            @Override
            public void onResponse(@NonNull Call<DailyWeatherPojo> call, @NonNull Response<DailyWeatherPojo> response) {
                if (response.isSuccessful()){
                    view.setDailyWeather(response.body());
                }else {
                    view.showErrorMessage("Failed to load daily forecast data. Error "+response.code());
                }
            }

            @Override
            public void onFailure(@NonNull Call<DailyWeatherPojo> call, @NonNull Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
