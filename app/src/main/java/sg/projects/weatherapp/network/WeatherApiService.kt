package sg.projects.weatherapp.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import sg.projects.weatherapp.data.WeatherDto

private const val BASE_URL = "https://api.weatherapi.com/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()


interface WeatherApiService {
    @GET("v1/forecast.json?key=e86bd3aa430740249e251451222012&days=7&aqi=no&alerts=no")
    suspend fun getWeatherData(
        @Query("q") cityName: String
    ): WeatherDto
}

object WeatherApi {
    val retrofitService: WeatherApiService by lazy {
        retrofit.create(WeatherApiService::class.java)
    }
}