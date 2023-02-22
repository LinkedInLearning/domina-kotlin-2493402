package `02avanzado`.ejercicio6

import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException

//Función de API que me devuelve resultado con un callback, convertirla a una función suspend.

class PokemonHelper {
    fun tipoDePokemon(nombrePokemon:String, tipoDeMiPokemonObtenido: (String) -> Unit)  {
        val cliente = OkHttpClient()
        val request = Request.Builder().url("https://pokeapi.co/api/v2/pokemon/${nombrePokemon}/").get().build()
        cliente.newCall(request).enqueue(object : Callback{
            override fun onFailure(call: Call, e: IOException) {
                tipoDeMiPokemonObtenido("Error")
            }
            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    val jsonObject = JSONObject(response.body?.string())
                    val primerTipo = (jsonObject.get("types") as? JSONArray)?.get(0)
                    val tipo = (primerTipo as? JSONObject)?.get("type")
                    val nombreDelTipo = ((tipo as? JSONObject)?.get("name") as? String) ?: ""
                    tipoDeMiPokemonObtenido(nombreDelTipo)
                } else {
                    tipoDeMiPokemonObtenido("Error")
                }
            }
        })
    }
}

fun main() {

}
