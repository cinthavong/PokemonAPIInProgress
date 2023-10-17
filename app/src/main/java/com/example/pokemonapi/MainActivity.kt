package com.example.pokemonapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.codepath.asynchttpclient.AsyncHttpClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getPokeImageURL() {
        val client = AsyncHttpClient()


    client["https://pokeapi.co/api/v2/pokemon-species/mew", object : JsonHttpResponseHandler() {
        override fun onSuccess(statusCode: Int, headers: Headers, json: JsonHttpResponseHandler.JSON) {
            Log.d("Poke", "response successful")


            override fun onFailure(
                statusCode: Int,
                headers: Headers?,
                errorResponse: String,
                throwable: Throwable?
            )

        {
            Log.d("Poke Error", errorResponse)
        }
    }
}