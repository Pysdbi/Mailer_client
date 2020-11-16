package ru.exr.mailer.ui.sendmail

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_sendmail.*
import ru.exr.mailer.R


class SendmailFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_sendmail, container, false)
        val btnSend: Button = root.findViewById(R.id.buttonSend)


        btnSend.setOnClickListener {
            val to: String = editTextTo.text.toString()
            val subject: String = editTextSubject.text.toString()
            val message: String = editTextMessage.text.toString()
            val email = Intent(Intent.ACTION_SEND)
            email.putExtra(Intent.EXTRA_EMAIL, arrayOf(to))
            email.putExtra(Intent.EXTRA_SUBJECT, subject)
            email.putExtra(Intent.EXTRA_TEXT, message)

            //для того чтобы запросить email клиент устанавливаем тип
            email.type = "message/rfc822"

            startActivity(Intent.createChooser(email, "Выберите email клиент :"))
        }

        return root
    }


}