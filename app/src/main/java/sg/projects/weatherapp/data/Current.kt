package sg.projects.weatherapp.data

import com.squareup.moshi.Json

data class Current(
    @Json(name = "temp_c") val temperatureCelsius: Float,
    @Json(name = "temp_f") val temperatureFahrenheit: Float,
    @Json(name = "is_day") val isDay: Int,
    val condition: Condition,
    @Json(name = "last_updated") val lastUpdated: String,
    @Json(name = "last_updated_epoch") val timeEpoch: Long,
    @Json(name = "wind_kph") val windSpeed: Float,
    @Json(name = "precip_mm") val precipitation: Float,
    @Json(name = "pressure_mb") val pressure: Float,
    val humidity: Int
)
