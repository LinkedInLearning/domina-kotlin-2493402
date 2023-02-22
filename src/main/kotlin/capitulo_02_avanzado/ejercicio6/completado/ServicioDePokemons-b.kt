package `02avanzado`.ejercicio6.completado


import kotlinx.coroutines.runBlocking
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


class PokemonHelper {
    suspend fun tipoDePokemon(nombrePokemon: String) : String =
        suspendCoroutine { continuation ->
            val cliente = OkHttpClient()
            val request = Request.Builder().url("https://pokeapi.co/api/v2/pokemon/${nombrePokemon}/").get().build()
            cliente.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    continuation.resumeWithException(Throwable("Error"))
                }
                override fun onResponse(call: Call, response: Response) {
                    if (response.isSuccessful) {
                        val jsonObject = JSONObject(response.body?.string())
                        val primerTipo = (jsonObject.get("types") as? JSONArray)?.get(0)
                        val tipo = (primerTipo as? JSONObject)?.get("type")
                        val nombreDelTipo = ((tipo as? JSONObject)?.get("name") as? String) ?: ""
                        continuation.resume(nombreDelTipo)
                    } else {
                        continuation.resumeWithException(Throwable("Error"))
                    }
                }
            })
    }

}

fun main() = runBlocking {
    val miPokeHelper = PokemonHelper()
    val mitipo =  miPokeHelper.tipoDePokemon("pikachu")
    println("Mi tipo es = ${mitipo}")
    println("Ejemplo API con función suspend: mi tipo es = $mitipo")
}
