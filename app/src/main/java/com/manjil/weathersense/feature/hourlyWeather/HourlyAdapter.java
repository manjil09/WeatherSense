package com.manjil.weathersense.feature.hourlyWeather;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.manjil.weathersense.R;

import java.util.List;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyViewHolder> {
    final List<DataItemPojo> dataItemPojoList;
    private final String ICON_PATH = "https://cdn.weatherbit.io/static/img/icons/";

    public HourlyAdapter(List<DataItemPojo> dataItemPojoList) {
        this.dataItemPojoList = dataItemPojoList;
    }

    @NonNull
    @Override
    public HourlyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hourly_weather, parent, false);
        return new HourlyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyViewHolder holder, int position) {
        final DataItemPojo dataItemPojo = dataItemPojoList.get(position);

        String time = dataItemPojo.getTimestampLocal().substring(11, 16);
        String temp = String.valueOf(dataItemPojo.getTemp());
        String precipitation = String.valueOf(dataItemPojo.getPrecip());
        String visibility = String.valueOf(dataItemPojo.getVis());
        String icon = dataItemPojo.getWeather().getIcon();

        holder.tvHourlyVisibility.setText(holder.itemView.getContext().getString(R.string.kilometer,visibility));
        holder.tvPrecipitation.setText(holder.itemView.getContext().getString(R.string.millimeter,precipitation));
        holder.tvHourlyTemp.setText(temp);
        holder.tvTime.setText(time);

        Glide.with(holder.itemView.getContext()).load(ICON_PATH + icon + ".png").into(holder.ivHourlyIcon);
    }

    @Override
    public int getItemCount() {
        return dataItemPojoList.size();
    }
}
