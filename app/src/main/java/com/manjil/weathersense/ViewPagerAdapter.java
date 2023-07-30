package com.manjil.weathersense;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.manjil.weathersense.feature.currentWeather.CurrentWeatherFragment;
import com.manjil.weathersense.feature.dailyWeather.DailyWeatherFragment;
import com.manjil.weathersense.feature.hourlyWeather.HourlyWeatherFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private final CurrentWeatherFragment currentWeatherFragment = new CurrentWeatherFragment();
    private final HourlyWeatherFragment hourlyWeatherFragment = new HourlyWeatherFragment();
    private final DailyWeatherFragment dailyWeatherFragment = new DailyWeatherFragment();

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1){
            return hourlyWeatherFragment;
        } else if (position == 2) {
            return dailyWeatherFragment;
        }
        return currentWeatherFragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
