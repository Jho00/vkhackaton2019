package ru.stollmanSquad.orbiapp.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.stollmanSquad.orbiapp.R

/**
 * Fragment representing the login screen for Shrine.
 */
class AccountFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.account_fragment, container, false)
        return view
    }
}