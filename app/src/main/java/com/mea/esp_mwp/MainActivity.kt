package com.mea.esp_mwp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mea.esp_mwp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {
    private val presenter = MainPresenter(this as MainView, CountersModel())
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val listener = View.OnClickListener {
            presenter.counterClick(it.id)
        }

        binding?.btnLed1?.setOnClickListener(listener)
        binding?.btnLed2?.setOnClickListener(listener)
        binding?.btnLed3?.setOnClickListener(listener)
    }


    override fun outData(textViewId: Int, text: String) {
//        binding?.root?.findViewById<TextView>(textViewId)?.text=text
        val textView = when (textViewId) {
            R.id.textView -> binding?.textView
            else -> null
        } ?: return
        textView.text = text
    }
}