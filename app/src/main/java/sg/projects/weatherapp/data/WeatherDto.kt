package sg.projects.weatherapp.data

data class WeatherDto(
    val current: Current,
    val location: Location,
    val forecast: Forecast
)

