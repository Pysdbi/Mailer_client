package ru.exr.mailer.ui.inbox

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import ru.exr.mailer.R


class InboxFragment : Fragment() {

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.inbox_fragment, container, false)
        val btn: Button = root.findViewById(R.id.CheckInbox)

        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_APP_EMAIL)
            requireActivity().startActivity(intent)
        }

        return root
    }


}

