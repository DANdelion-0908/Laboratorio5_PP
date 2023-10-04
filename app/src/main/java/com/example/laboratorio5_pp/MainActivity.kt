package com.example.laboratorio5_pp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.laboratorio5_pp.ui.theme.Laboratorio5_PPTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5_PPTheme {
                val queue = Volley.newRequestQueue(this)
                val url = "https://cat-fact.herokuapp.com"

                val stringRequest = StringRequest(Request.Method.GET, url, { response ->
                response}, { "Error" })
                queue.add(stringRequest)


                TextTest(text = stringRequest)
            }
        }
    }
}

@Composable
fun TextTest(text: StringRequest) {
    Text(text = text.toString(), fontSize = 50.sp)
}