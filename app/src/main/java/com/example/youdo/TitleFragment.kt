package com.example.youdo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.youdo.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title,container,false)
        binding.start.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_yourTaskFragment)
        }
        binding.start2.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_createCardFragment2)
        }
        binding.start3.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_settingsFragment)
        }

        binding.start4.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_aboutFragment)
        }



        return binding.root
    }
}