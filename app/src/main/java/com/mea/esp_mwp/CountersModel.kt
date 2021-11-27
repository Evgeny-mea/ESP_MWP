package com.mea.esp_mwp

import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

class CountersModel : Countersint {
    private val client = OkHttpClient() //Создаем клиента

    //    private fun post(post: String) {   // Отправка данных с интернета (стринга)
//        Thread {  //Открываем второстепенный поток
//            var request = Request.Builder().url("http://192.168.1.133/$post").build()
//            //Формироване запроса, вытягиваем ip + в конце дописываем сам запрос
//            try {
//                var response = client.newCall(request).execute()  //Создаем переменную которая будет отправлять данные в esp
//                if (response.isSuccessful) {  //Проверка на то, что все успешно
//                    val resultText = response.body()?.string() // Принимаем данные и сохраняем в resultText берем от туда только текст
//                    runOnUiThread {  //Обновляем вьюшки с второстепенного потока
//                        val temp = resultText + "Cº"  // Создаем переменную и кладем в нее данные с resultText добовляем текст "C"
//                        binding.tvTemp.text = temp   //Находим tvTemp и помещаем данные с temp
//                    }
//                }
//            } catch (i: IOException) {
//            }
//        }.start() //Старт второстепенного потока
//    }
    override fun gPost() {
//    fun post(post: String) {   // Отправка данных с интернета (стринга)
        Thread {  //Открываем второстепенный поток
            try {
                var request = Request.Builder().url("http://192.168.1.133/led2").build()
                client.newCall(request).execute()
            } catch (i: IOException) {
            }
        }.start()
    }
}
//Старт второстепенного потока
  //  }


//    private val counter = mutableListOf(1, 2, 3)
//    override fun getCounter(index: Int): Int {
//        return counter[index]
//    }
//    override fun upCounter(index: Int): Int {
//        counter[index]++
//        return getCounter(index)
//    }




//    fun set(index: Int, value: Int) {
//        counter[index] = value
//    }

