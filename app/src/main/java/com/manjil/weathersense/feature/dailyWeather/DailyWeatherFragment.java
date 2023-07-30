package com.manjil.weathersense.feature.dailyWeather;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.manjil.weathersense.R;

public class DailyWeatherFragment extends Fragment implements DailyWeatherContract.View{
    private final String KEY = "e9e4b7b4f32444899243c63d5356580d";
    private final String ICON_PATH = "https://cdn.weatherbit.io/static/img/icons/";
    private final double LAT = 27.7172;
    private final double LON = 85.324;
    private RecyclerView rvDaily;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily_weather, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DailyWeatherContract.Presenter presenter = new DailyWeatherPresenter(this);
        presenter.setDailyWeather(LAT, LON);

        rvDaily = view.findViewById(R.id.rvDaily);
    }

    @Override
    public void setDailyWeather(DailyWeatherPojo dailyWeatherPojoList) {
        DailyAdapter dailyAdapter = new DailyAdapter(dailyWeatherPojoList.getData());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(rvDaily.getContext(), layoutManager.getOrientation());
        rvDaily.addItemDecoration(dividerItemDecoration);
        rvDaily.setAdapter(dailyAdapter);
        rvDaily.setLayoutManager(layoutManager);
    }

    @Override
    public void showErrorMessage(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }
}