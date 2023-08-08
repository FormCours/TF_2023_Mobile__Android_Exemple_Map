package be.tftic.web2023.test_map

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import be.tftic.web2023.test_map.databinding.ActivityMainBinding

import com.mapbox.maps.Style


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binding avec la layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Chargement de la Map
        binding.mapView.getMapboxMap().loadStyleUri(Style.MAPBOX_STREETS)
    }
}