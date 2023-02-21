package sg.projects.weatherapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import sg.projects.weatherapp.data.Forecastday
import sg.projects.weatherapp.databinding.DailyWeatherItemCelsiusBinding

class DailyAdapterCelsius : ListAdapter<Forecastday, DailyAdapterCelsius.WeatherViewHolder>(DiffCallback) {

    class WeatherViewHolder(
        var binding: DailyWeatherItemCelsiusBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(forecastDay: Forecastday) {
            binding.forecastDay = forecastDay
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Forecastday>() {
        override fun areItemsTheSame(oldItem: Forecastday, newItem: Forecastday): Boolean {
            return oldItem.date == newItem.date
        }

        override fun areContentsTheSame(oldItem: Forecastday, newItem: Forecastday): Boolean {
            return oldItem.day == newItem.day
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return WeatherViewHolder(
            DailyWeatherItemCelsiusBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val forecastDay = getItem(position)
        holder.bind(forecastDay)
    }
}