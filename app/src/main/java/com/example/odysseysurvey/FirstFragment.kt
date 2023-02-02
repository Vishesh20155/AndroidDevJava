package com.example.odysseysurvey

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.odysseysurvey.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(activity, "Hello Inside", Toast.LENGTH_SHORT).show();

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(activity, "onViewCreated", Toast.LENGTH_SHORT).show();

//        val roleOptions: Array<out String> = resources.getStringArray(R.array.roles_hintArray)
//        context?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, roleOptions).also { adapter ->
//            activity?.findViewById<AutoCompleteTextView>(R.id.role_autoCompleteTextView)
//                ?.setAdapter(adapter)
//        } }

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}