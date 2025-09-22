package com.davidDAM.projecteinicial

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ViewFlipper
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonOk: Button = findViewById(R.id.botoguay);
        val text : EditText = findViewById(R.id.editText1)

        val vflipper: ViewFlipper = findViewById(R.id.carrousel)

        val imatges = intArrayOf(R.drawable.leon, R.drawable.panda, R.drawable.tiburon)

        for (imatge in imatges) {
            val imatgeVista = ImageView(this)
            imatgeVista.setBackgroundResource(imatge)
            vflipper.addView(imatgeVista)
        }

        buttonOk.setOnClickListener{
           vflipper.showNext()
           text.setText("Hola")
        }
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        //    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        //    insets
        //}
    }
}