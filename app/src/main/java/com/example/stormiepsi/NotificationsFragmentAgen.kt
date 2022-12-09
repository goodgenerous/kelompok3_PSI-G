package com.example.stormiepsi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.stormiepsi.databinding.FragmentNotificationsAgenBinding

class NotificationsFragmentAgen : Fragment() {

    private var _binding: FragmentNotificationsAgenBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationsAgenBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.tvAkun
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}