package sg.projects.weatherapp.ui
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import sg.projects.weatherapp.databinding.FragmentWeatherBinding
import sg.projects.weatherapp.viewmodel.WeatherViewModel

class WeatherFragment : Fragment() {

    private val viewModel: WeatherViewModel by activityViewModels()
    private var _binding: FragmentWeatherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWeatherBinding.inflate(inflater)
        viewModel.getWeatherResponse("Singapore")

        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.rvHourlyCelsius.adapter = WeatherAdapter()
        binding.rvHourlyFahrenheit.adapter = WeatherAdapterFahrenheit()
        binding.rvDailyCelsius.adapter = DailyAdapterCelsius()
        binding.rvDailyFahrenheit.adapter = DailyAdapterFahrenheit()
        return binding.root
    }


    private fun updateLocation() {
        viewModel.getWeatherResponse(binding.locationName.text.toString())
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSearch.setOnClickListener {
            updateLocation()
        }
        binding.btnUnit.setOnClickListener {
            viewModel.changeUnit()

            if (viewModel.isMetric()) {
                binding.tvTemperatureCelsius.visibility = View.VISIBLE
                binding.tvTemperatureFahrenheit.visibility = View.GONE

                binding.rvHourlyCelsius.visibility = View.VISIBLE
                binding.rvHourlyFahrenheit.visibility = View.GONE

                binding.rvDailyCelsius.visibility = View.VISIBLE
                binding.rvDailyFahrenheit.visibility = View.GONE
            }
            else {
                binding.tvTemperatureCelsius.visibility = View.GONE
                binding.tvTemperatureFahrenheit.visibility = View.VISIBLE

                binding.rvHourlyCelsius.visibility = View.GONE
                binding.rvHourlyFahrenheit.visibility = View.VISIBLE

                binding.rvDailyCelsius.visibility = View.GONE
                binding.rvDailyFahrenheit.visibility = View.VISIBLE
            }
        }
        binding.swipeRefreshLayout.setOnRefreshListener {
            try {
                viewModel.getWeatherResponse(viewModel.currentWeather.value?.location!!.name)
                binding.swipeRefreshLayout.isRefreshing = false
            }
            catch (e: Exception){
                viewModel.getWeatherResponse("Singapore")
                binding.swipeRefreshLayout.isRefreshing = false
            }
        }
    }
}
