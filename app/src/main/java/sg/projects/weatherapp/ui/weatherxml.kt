//<!--<?xml version="1.0" encoding="utf-8"?>-->
//<!--<layout xmlns:android="http://schemas.android.com/apk/res/android"-->
//<!--    xmlns:tools="http://schemas.android.com/tools"-->
//<!--    xmlns:app="http://schemas.android.com/apk/res-auto">-->
//
//<!--    <data>-->
//<!--        <variable-->
//<!--            name="viewModel"-->
//<!--            type="sg.tutorials.weatherapp.viewmodel.WeatherViewModel" />-->
//<!--    </data>-->
//
//<!--    <androidx.constraintlayout.widget.ConstraintLayout-->
//<!--        android:layout_width="match_parent"-->
//<!--        android:layout_height="match_parent"-->
//<!--        android:background="@drawable/main_background">-->
//
//<!--        <LinearLayout-->
//<!--            android:id="@+id/llBar"-->
//<!--            android:layout_width="match_parent"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:orientation="horizontal"-->
//<!--            android:layout_margin="10dp"-->
//<!--            app:layout_constraintTop_toTopOf="parent"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintEnd_toEndOf="parent">-->
//
//<!--            <com.google.android.material.textfield.TextInputLayout-->
//<!--                android:id="@+id/locationLabel"-->
//<!--                android:layout_width="match_parent"-->
//<!--                android:layout_height="wrap_content"-->
//<!--                android:layout_weight="1"-->
//<!--                android:hint="Location" >-->
//
//<!--                <com.google.android.material.textfield.TextInputEditText-->
//<!--                    android:id="@+id/locationName"-->
//<!--                    android:layout_width="match_parent"-->
//<!--                    android:layout_height="match_parent"-->
//<!--                    android:inputType="textAutoComplete|textCapWords"-->
//<!--                    android:singleLine="true" />-->
//<!--            </com.google.android.material.textfield.TextInputLayout>-->
//
//<!--            <ImageView-->
//<!--                android:id="@+id/btnSearch"-->
//<!--                android:layout_width="50dp"-->
//<!--                android:layout_height="wrap_content"-->
//<!--                android:layout_marginTop="5dp"-->
//<!--                android:padding="10dp"-->
//<!--                android:src="@drawable/ic_baseline_search_24"-->
//<!--                />-->
//
//<!--        </LinearLayout>-->
//
//<!--        <TextView-->
//<!--            android:id="@+id/btnUnit"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:layout_marginRight="16dp"-->
//<!--            android:layout_marginTop="20dp"-->
//<!--            android:textSize="16sp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:text="change unit"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/llBar"-->
//<!--            app:layout_constraintEnd_toEndOf="parent" />-->
//
//<!--        <TextView-->
//<!--            android:id="@+id/tvLocation"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:layout_marginStart="16dp"-->
//<!--            android:layout_marginTop="16dp"-->
//<!--            android:textSize="25sp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:text="@{viewModel.currentWeather.location.name}"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/llBar"-->
//<!--            tools:text="Singapore"/>-->
//
//<!--        <TextView-->
//<!--            android:id="@+id/tvDateTime"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:layout_marginTop="9dp"-->
//<!--            android:layout_marginLeft="16dp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:text="@{viewModel.currentWeather.current.lastUpdated}"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintTop_toBottomOf="@+id/tvLocation"-->
//<!--            tools:text="2019-12-12 12:00"/>-->
//
//<!--        <TextView-->
//<!--            android:id="@+id/tvTemperatureCelsius"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:textAlignment="center"-->
//<!--            android:layout_marginTop="50dp"-->
//<!--            android:textSize="20sp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:text="@{Float.toString(viewModel.currentWeather.current.temperatureCelsius) + `°C`}"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/tvLocation"-->
//<!--            app:layout_constraintBottom_toTopOf="@+id/ivWeather"-->
//<!--            app:layout_constraintEnd_toEndOf="parent"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintHorizontal_bias="0.498"-->
//<!--            app:layout_constraintVertical_bias="0.91"-->
//<!--            tools:text="250C"/>-->
//
//<!--        <TextView-->
//<!--            android:id="@+id/tvTemperatureFahrenheit"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:textAlignment="center"-->
//<!--            android:layout_marginTop="50dp"-->
//<!--            android:textSize="20sp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:text="@{Float.toString(viewModel.currentWeather.current.temperatureFahrenheit) + `°F`}"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/tvLocation"-->
//<!--            app:layout_constraintBottom_toTopOf="@+id/ivWeather"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintEnd_toEndOf="parent"-->
//<!--            app:layout_constraintHorizontal_bias="0.498"-->
//<!--            app:layout_constraintVertical_bias="0.91"-->
//<!--            android:visibility="invisible" />-->
//
//<!--        <TextView-->
//<!--            android:id="@+id/tvWeather"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:textSize="16sp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:text="@{viewModel.currentWeather.current.condition.text}"-->
//<!--            android:paddingBottom="20dp"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/ivWeather"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintEnd_toEndOf="parent"-->
//<!--            app:layout_constraintBottom_toTopOf="@id/tvHumidity"-->
//<!--            tools:text="Patchy rain possible" />-->
//
//
//<!--        <TextView-->
//<!--            android:id="@+id/tvHumidity"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:textSize="18sp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:layout_marginLeft="44dp"-->
//<!--            android:text="@{`Humidity: ` + `\n` + viewModel.currentWeather.current.humidity + `%`}"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/tvWeather"-->
//<!--            tools:text="Humidity: 89%"/>-->
//
//<!--        <TextView-->
//<!--            android:id="@+id/tvWindSpeed"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:layout_marginRight="44dp"-->
//<!--            android:textSize="18sp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:text="@{`Wind Speed: ` + `\n` + Float.toString(viewModel.currentWeather.current.windSpeed) + `km/h`}"-->
//<!--            app:layout_constraintEnd_toEndOf="parent"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/tvWeather"-->
//<!--            tools:text="Wind Speed: 10.1km/h"/>-->
//
//<!--        <TextView-->
//<!--            android:id="@+id/tvPrecipitation"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:layout_marginLeft="44dp"-->
//<!--            android:textSize="18sp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:text="@{`Precipitation: ` + `\n` + Float.toString(viewModel.currentWeather.current.precipitation) + `mm`}"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/tvHumidity"-->
//<!--            android:layout_marginTop="20dp"-->
//<!--            tools:text="Precipitation: 1.0mm"/>-->
//
//<!--        <TextView-->
//<!--            android:id="@+id/tvPressure"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:textSize="18sp"-->
//<!--            android:textColor="@color/white"-->
//<!--            android:text="@{`Air Pressure: ` + `\n` + Float.toString(viewModel.currentWeather.current.pressure) + `hPa`}"-->
//<!--            android:layout_marginTop="20dp"-->
//<!--            app:layout_constraintStart_toStartOf="@id/tvWindSpeed"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/tvWindSpeed"-->
//<!--            tools:text="Air Pressure: 1011hPa"/>-->
//
//<!--        <ImageView-->
//<!--            android:id="@+id/ivWeather"-->
//<!--            android:layout_width="80dp"-->
//<!--            android:layout_height="80dp"-->
//<!--            app:layout_constraintEnd_toEndOf="parent"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/tvTemperatureCelsius"-->
//<!--            app:layout_constraintVertical_bias="0.416"-->
//<!--            app:imageUrl="@{viewModel.currentWeather.current.condition.icon}"-->
//<!--            tools:srcCompat="@tools:sample/avatars" />-->
//
//<!--        <ImageView-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            app:layout_constraintEnd_toEndOf="parent"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintTop_toBottomOf="@id/tvTemperatureCelsius"-->
//<!--            app:layout_constraintVertical_bias="0.416"-->
//<!--            app:weatherApiStatus="@{viewModel.status}" />-->
//
//
//<!--        <androidx.recyclerview.widget.RecyclerView-->
//<!--            android:id="@+id/rvHourlyCelsius"-->
//<!--            android:layout_width="match_parent"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:layout_marginTop="100dp"-->
//<!--            android:orientation="horizontal"-->
//<!--            app:listHourlyCelsius="@{viewModel.currentWeather.forecast.forecastDay[0].hours}"-->
//<!--            app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"-->
//<!--            app:layout_constraintBottom_toTopOf="@id/rvDailyCelsius"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintEnd_toEndOf="parent" />-->
//
//<!--        <androidx.recyclerview.widget.RecyclerView-->
//<!--            android:id="@+id/rvHourlyFahrenheit"-->
//<!--            android:layout_width="match_parent"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:layout_marginTop="100dp"-->
//<!--            android:orientation="horizontal"-->
//<!--            app:listHourlyFahrenheit="@{viewModel.currentWeather.forecast.forecastDay[0].hours}"-->
//<!--            app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintEnd_toEndOf="parent"-->
//<!--            app:layout_constraintBottom_toTopOf="@id/rvDailyCelsius"-->
//<!--            android:visibility="invisible" />-->
//
//<!--        <androidx.recyclerview.widget.RecyclerView-->
//<!--            android:id="@+id/rvDailyCelsius"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:layout_marginBottom="20dp"-->
//<!--            app:listDailyCelsius="@{viewModel.currentWeather.forecast.forecastDay}"-->
//<!--            android:orientation="vertical"-->
//<!--            app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintEnd_toEndOf="parent"-->
//<!--            app:layout_constraintBottom_toBottomOf="parent" />-->
//
//<!--        <androidx.recyclerview.widget.RecyclerView-->
//<!--            android:id="@+id/rvDailyFahrenheit"-->
//<!--            android:layout_width="wrap_content"-->
//<!--            android:layout_height="wrap_content"-->
//<!--            android:orientation="vertical"-->
//<!--            android:visibility="invisible"-->
//<!--            android:layout_marginBottom="20dp"-->
//<!--            app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"-->
//<!--            app:layout_constraintEnd_toEndOf="parent"-->
//<!--            app:layout_constraintStart_toStartOf="parent"-->
//<!--            app:layout_constraintBottom_toBottomOf="parent"-->
//<!--            app:listDailyFahrenheit="@{viewModel.currentWeather.forecast.forecastDay}" />-->
//
//<!--    </androidx.constraintlayout.widget.ConstraintLayout>-->
//<!--</layout>-->