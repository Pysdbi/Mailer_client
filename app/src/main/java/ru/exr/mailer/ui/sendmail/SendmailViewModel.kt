package ru.exr.mailer.ui.sendmail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SendmailViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is  Fragment"
    }
    val text: LiveData<String> = _text
}