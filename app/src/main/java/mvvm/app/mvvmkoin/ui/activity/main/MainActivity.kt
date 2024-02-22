package mvvm.app.mvvmkoin.ui.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import mvvm.app.mvvmkoin.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private lateinit var tv:TextView
    private val VM :MainVM by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)

        VM.todos.observe(this) { it ->
            tv.text = it.toString()
        }
        VM.fetchData()
    }
}