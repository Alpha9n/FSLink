package jp.aoichaan0513.fslink.API

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject

class PerseAPI {

    companion object {
        fun fromJson(json: String, key: String): String? {
            val jsonAry = Gson().fromJson(json, JsonArray::class.java) as JsonArray
            val jsonObj = jsonAry.get(0) as JsonObject
            val result = jsonObj.get(key)
            if(result.isJsonNull) return null
            return result.asString
        }
    }
}