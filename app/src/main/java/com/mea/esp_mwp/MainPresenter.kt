package com.mea.esp_mwp

class MainPresenter(
    private val view: MainView,
    private val model: CountersModel
    ) {


    fun counterClick (id: Int) = when(id) {
        R.id.btn_led_1 -> {
            model.gPost("led1")
//            val nextValue = model.upCounter(0)
//            view.outData (R.id.textView, nextValue.toString())
        }
        R.id.btn_led_2 -> {
            model.gPost("led2")
//            val nextValue = model.upCounter(1)
//            view.outData (R.id.textView, nextValue.toString())
        }
        R.id.btn_led_3 -> {
            model.gPost("led3")
//            val nextValue = model.upCounter(2)
//            view.outData (R.id.textView, nextValue.toString())
        }
        else -> {}
    }
}