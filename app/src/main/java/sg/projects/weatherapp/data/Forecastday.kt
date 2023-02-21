package sg.projects.weatherapp.data

import com.squareup.moshi.Json

data class Forecastday(
    val date: String,
    val day: Day,
    @Json(name = "date_epoch") val dateEpoch: Int,
    @Json(name = "hour") val hours: List<Hour>
)
