package sg.projects.weatherapp.data

import com.squareup.moshi.Json

data class Forecast(
    @Json(name = "forecastday") val forecastDay: List<Forecastday>
)
