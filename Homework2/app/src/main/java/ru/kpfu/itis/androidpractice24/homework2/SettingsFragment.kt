package ru.kpfu.itis.androidpractice24.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import ru.kpfu.itis.androidpractice24.homework2.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private var binding: FragmentSettingsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}