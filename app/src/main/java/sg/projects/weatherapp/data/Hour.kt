package sg.projects.weatherapp.data

import com.squareup.moshi.Json

data class Hour(
    @Json(name = "time_epoch") val timeEpoch: Long,
    val time: String,
    @Json(name = "temp_c") val temperatureCelsius: Float,
    @Json(name = "temp_f") val temperatureFahrenheit: Float,
    val condition: Condition
)
