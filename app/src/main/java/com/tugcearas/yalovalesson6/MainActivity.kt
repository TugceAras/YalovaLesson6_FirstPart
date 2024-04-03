package com.tugcearas.yalovalesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.tugcearas.yalovalesson6.databinding.ActivityMainBinding

/*
    ViewBinding - DataBinding - findViewById

    https://medium.com/huawei-developers/viewbinding-vs-databinding-differences-and-detailed-8bfd4dbe290f#:~:text=View%20Binding%20vs%20findViewById&text=Faster%20Compilation%3A%20View%20Binding%20does,specially%20labeled%20layout%20xml%20files.
    https://medium.com/androiddevelopers/use-view-binding-to-replace-findviewbyid-c83942471fc
    https://developer.android.com/topic/libraries/view-binding
    https://developer.android.com/topic/libraries/data-binding
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    // ViewBinding`den once component id`leri xml tarafindan nasil aliniyordu? 🤔
    // findViewById<>() ?

    val getTextView1 = findViewById<TextView>(R.id.textView)
    val getButton1 = findViewById<Button>(R.id.button)

    val getOtherTextView = findViewById<TextView>(R.id.textView2)  // Istenilen bir durum degil ❌

    // O zaman neden ViewBinding kullanilmaya baslandi? 🤔

    val getTextViewId2 = binding.textView
    val getButtonId2 = binding.button

    // DataBinding nedir? ViewBinding ile arasindaki fark nedir? Google`in onerdigi hangisi?

}