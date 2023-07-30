package com.manjil.weathersense.feature.hourlyWeather;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manjil.weathersense.R;

public class HourlyViewHolder extends RecyclerView.ViewHolder {
    final TextView tvTime, tvHourlyTemp, tvPrecipitation, tvHourlyVisibility;
    final ImageView ivHourlyIcon;

    public HourlyViewHolder(@NonNull View itemView) {
        super(itemView);

        this.ivHourlyIcon = itemView.findViewById(R.id.ivHourlyIcon);
        this.tvHourlyTemp = itemView.findViewById(R.id.tvHourlyTemp);
        this.tvTime = itemView.findViewById(R.id.tvTime);
        this.tvPrecipitation = itemView.findViewById(R.id.tvPrecipitation);
        this.tvHourlyVisibility = itemView.findViewById(R.id.tvHourlyVisibility);
    }
}
