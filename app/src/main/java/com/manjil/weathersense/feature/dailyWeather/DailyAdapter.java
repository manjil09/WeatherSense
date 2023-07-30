package com.manjil.weathersense.feature.dailyWeather;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.manjil.weathersense.R;

import java.util.List;

public class DailyAdapter extends RecyclerView.Adapter<DailyViewHolder> {
    final List<DataItemPojo> dataItemPojoList;
    private final String ICON_PATH = "https://cdn.weatherbit.io/static/img/icons/";

    public DailyAdapter(List<DataItemPojo> dataItemPojoList) {
        this.dataItemPojoList = dataItemPojoList;
    }

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily_weather, parent, false);
        return new DailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {
        final DataItemPojo dataItemPojo = dataItemPojoList.get(position);

        String weatherDescription = dataItemPojo.getWeather().getDescription();
        String temp = String.valueOf(dataItemPojo.getTemp());
        String date = dataItemPojo.getValidDate();
        String icon = dataItemPojo.getWeather().getIcon();

        holder.tvDate.setText(date);
        holder.tvDescription.setText(weatherDescription);
        holder.tvDailyTemp.setText(holder.itemView.getContext().getString(R.string.degree,temp));

        Glide.with(holder.itemView.getContext()).load(ICON_PATH + icon + ".png").into(holder.ivDailyIcon);
    }

    @Override
    public int getItemCount() {
        return dataItemPojoList.size();
    }
}
