package sg.projects.weatherapp.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import sg.projects.weatherapp.data.WeatherDto
import sg.projects.weatherapp.network.WeatherApi


enum class WeatherApiStatus {LOADING, ERROR, DONE}

class WeatherViewModel : ViewModel() {


    private val _status = MutableLiveData<WeatherApiStatus>()
    val status: LiveData<WeatherApiStatus> = _status


    private val _currentWeather = MutableLiveData<WeatherDto?>()
    val currentWeather: LiveData<WeatherDto?> = _currentWeather

    private var metricUnit = true

    fun isMetric(): Boolean {
        return metricUnit
    }

    fun changeUnit() {
        metricUnit = !metricUnit
    }


    fun getWeatherResponse(location: String) {
        viewModelScope.launch {
            _status.value = WeatherApiStatus.LOADING
            try {
                _currentWeather.value = WeatherApi.retrofitService.getWeatherData(location)
                _status.value = WeatherApiStatus.DONE
            }
            catch (e: Exception) {
                _status.value = WeatherApiStatus.ERROR

            }
        }
    }
}