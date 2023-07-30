package com.manjil.weathersense.feature.dailyWeather;

import retrofit2.Call;

public interface DailyWeatherContract {
    interface Model{
        Call<DailyWeatherPojo> getDailyForecast(double lat, double lon);
    }
    interface View{
        void setDailyWeather(DailyWeatherPojo dailyWeatherPojoList);
        void showErrorMessage(String message);
    }
    interface Presenter{
        void setDailyWeather(double lat, double lon);
    }
}
