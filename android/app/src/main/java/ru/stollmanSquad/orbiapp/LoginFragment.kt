package ru.stollmanSquad.orbiapp

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.vk.api.sdk.VK
import com.vk.api.sdk.auth.VKScope

/**
 * Fragment representing the login screen for Shrine.
 */
class LoginFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        // Snippet from "Navigate to the next Fragment" section goes here.



        val view = inflater.inflate(R.layout.login_fragment, container, false)

        val loginBtn = view.findViewById<Button>(R.id.LoginVKBtn)
        loginBtn.setOnClickListener{
            LoginVKBtnPress()
        }
        return view
    }


    public fun LoginVKBtnPress(){
        VK.login((activity as Activity), arrayListOf(VKScope.WALL, VKScope.PHOTOS))
    }

    // "isPasswordValid" from "Navigate to the next Fragment" section method goes here
}
