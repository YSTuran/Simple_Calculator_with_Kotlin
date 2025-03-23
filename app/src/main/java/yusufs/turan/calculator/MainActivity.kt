package yusufs.turan.calculator

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import yusufs.turan.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun add(view: View) {
        val data1 = binding.editText.text.toString()
        val data2 = binding.editText2.text.toString()

        if (data1.isEmpty() || data2.isEmpty()) {
            Toast.makeText(this@MainActivity, "Please enter a number!", Toast.LENGTH_LONG).show()
        }
        else {
            val sum = data1.toInt() + data2.toInt()
            binding.textView.text = "Result: $sum"
        }
    }
    fun extract(view: View){
        val data1 = binding.editText.text.toString()
        val data2 = binding.editText2.text.toString()

        if (data1.isEmpty() || data2.isEmpty()) {
            Toast.makeText(this@MainActivity, "Please enter a number!", Toast.LENGTH_LONG).show()
        }
        else{
            val ext= data1.toInt() - data2.toInt()
            binding.textView.text = "Result: $ext"
        }
    }
    fun multiple(view: View){
        val data1 = binding.editText.text.toString()
        val data2 = binding.editText2.text.toString()

        if (data1.isEmpty() || data2.isEmpty()) {
            Toast.makeText(this@MainActivity, "Please enter a number!", Toast.LENGTH_LONG).show()
        }
        else{
            val mul= data1.toInt() * data2.toInt()
            binding.textView.text= "Result: $mul"
        }
    }
    fun divide(view: View){
        val data1 = binding.editText.text.toString()
        val data2 = binding.editText2.text.toString()

        if (data1.isEmpty() || data2.isEmpty()) {
            Toast.makeText(this@MainActivity, "Please enter a number!", Toast.LENGTH_LONG).show()
        }
        else{
            if(data1.toInt() % data2.toInt()==0){
                val div= data1.toInt() / data2.toInt()
                binding.textView.text= "Result: $div"
            }
            else{
                val div= data1.toFloat() / data2.toFloat()
                binding.textView.text= "Result: $div"
            }

        }
    }
}