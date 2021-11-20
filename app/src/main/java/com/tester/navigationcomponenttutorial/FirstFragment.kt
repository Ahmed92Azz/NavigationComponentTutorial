package com.tester.navigationcomponenttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    private lateinit var mNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mNavController = findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonJump = view.findViewById<Button>(R.id.button_jump_into_fragment)

        buttonJump.setOnClickListener {
//
//            val data = bundleOf("w" to "welcome")
//            mNavController.navigate(R.id.secondFragment, data)

            val data = "Hi!"

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(data)
            mNavController.navigate(action)

        }
    }

}