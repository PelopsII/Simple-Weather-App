package sg.projects.weatherapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import sg.projects.weatherapp.data.Hour
import sg.projects.weatherapp.databinding.HourlyWeatherItemFBinding

class WeatherAdapterFahrenheit : ListAdapter<Hour, WeatherAdapterFahrenheit.WeatherViewHolder>(DiffCallback) {

    class WeatherViewHolder(
        var binding: HourlyWeatherItemFBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(hour: Hour) {
            binding.hour = hour
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Hour>() {
        override fun areItemsTheSame(oldItem: Hour, newItem: Hour): Boolean {
            return oldItem.timeEpoch == newItem.timeEpoch
        }

        override fun areContentsTheSame(oldItem: Hour, newItem: Hour): Boolean {
            return oldItem.time == newItem.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return WeatherViewHolder(
            HourlyWeatherItemFBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val hour = getItem(position)
        holder.bind(hour)
    }
}