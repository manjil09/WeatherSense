package com.manjil.weathersense.feature.dailyWeather;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manjil.weathersense.R;

public class DailyViewHolder extends RecyclerView.ViewHolder {
    final TextView tvDate, tvDescription, tvDailyTemp;
    final ImageView ivDailyIcon;

    public DailyViewHolder(@NonNull View itemView) {
        super(itemView);

        this.tvDate = itemView.findViewById(R.id.tvDate);
        this.tvDescription = itemView.findViewById(R.id.tvDescription);
        this.tvDailyTemp = itemView.findViewById(R.id.tvDailyTemp);
        this.ivDailyIcon = itemView.findViewById(R.id.ivDailyIcon);
    }
}
