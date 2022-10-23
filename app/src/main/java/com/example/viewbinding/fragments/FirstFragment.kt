package com.example.viewbinding.fragments

import android.os.Bundle
import android.text.TextUtils.replace
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.viewbinding.R
import com.example.viewbinding.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding !!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        return binding.root

    //return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFragment2.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view,SeconfFragment())
            }
        }



    }

}