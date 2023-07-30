package com.manjil.weathersense.feature.currentWeather;

import retrofit2.Call;

public interface CurrentWeatherContract {
    interface Model{
        Call<CurrentWeatherPojo> getCurrentWeather(double lat, double lon);

    }
    interface View{
        void setCurrentWeather(CurrentWeatherPojo currentWeatherPojo);
        void showErrorMessage(String message);
    }
    interface Presenter{
        void setCurrentWeather(double lat, double lon);
    }
}
