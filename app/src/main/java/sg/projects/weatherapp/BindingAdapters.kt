package sg.projects.weatherapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import coil.load
import sg.projects.weatherapp.data.Forecastday
import sg.projects.weatherapp.data.Hour
import sg.projects.weatherapp.ui.DailyAdapterCelsius
import sg.projects.weatherapp.ui.DailyAdapterFahrenheit
import sg.projects.weatherapp.ui.WeatherAdapter
import sg.projects.weatherapp.ui.WeatherAdapterFahrenheit
import sg.projects.weatherapp.viewmodel.WeatherApiStatus
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@BindingAdapter("listHourlyCelsius")
fun bindHourlyCelsius(recyclerView: RecyclerView, data: List<Hour>?) {
    val adapter = recyclerView.adapter as WeatherAdapter
    adapter.submitList(data)
}

@BindingAdapter("listHourlyFahrenheit")
fun bindHourlyFahrenheit(recyclerView: RecyclerView, data: List<Hour>?) {
    val adapter = recyclerView.adapter as WeatherAdapterFahrenheit
    adapter.submitList(data)
}

@BindingAdapter("listDailyCelsius")
fun bindDailyCelsius(recyclerView: RecyclerView, data: List<Forecastday>?) {
    val adapter = recyclerView.adapter as DailyAdapterCelsius
    adapter.submitList(data)
}

@BindingAdapter("listDailyFahrenheit")
fun bindDailyFahrenheit(recyclerView: RecyclerView, data: List<Forecastday>?) {
    val adapter = recyclerView.adapter as DailyAdapterFahrenheit
    adapter.submitList(data)
}

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        imgView.load(imgUri)
    }
}

@BindingAdapter("getTime")
fun getTime(textView: TextView, date: String?) {
    val localDate = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
    val time = localDate.format(DateTimeFormatter.ofPattern("HH:mm"))
    textView.text = time
}

@BindingAdapter("weatherApiStatus")
fun bindStatus(statusImageView: ImageView, status: WeatherApiStatus) {
    when (status) {
        WeatherApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        WeatherApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        WeatherApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}

@BindingAdapter("statusMessage")
fun bindStatusMessage(statusTextView: TextView, status: WeatherApiStatus) {
    when (status) {
        WeatherApiStatus.LOADING -> {
            statusTextView.visibility = View.VISIBLE
            statusTextView.text = "Loading"
        }
        WeatherApiStatus.ERROR -> {
            statusTextView.visibility = View.VISIBLE
            statusTextView.text = "Invalid Location/Connection Error"
        }
        WeatherApiStatus.DONE -> {
            statusTextView.visibility = View.GONE
        }
    }
}

@BindingAdapter("setText")
fun setText(textView: TextView, text: String?) {
    textView.text = text
    textView.isSelected = true
}

@BindingAdapter("setBackground")
fun setBackground(layout: SwipeRefreshLayout, isDay: Int) {
    when (isDay) {
        1 -> {
            layout.setBackgroundResource(R.drawable.day)
        }
        0 -> {
            layout.setBackgroundResource(R.drawable.night)
        }
    }
}

