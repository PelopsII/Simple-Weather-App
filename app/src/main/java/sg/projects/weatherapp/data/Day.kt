package sg.projects.weatherapp.data

import com.squareup.moshi.Json

data class Day(
    @Json(name = "avgtemp_c") val averageTemperatureCelsius: Float,
    @Json(name = "avgtemp_f") val averageTemperatureFahrenheit: Float,
    val condition: Condition
)
