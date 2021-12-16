package io.taptap.sharedpreferensebydelegate

import android.content.Context

private const val PREFERENCES_NAME = "storage"

open class TestStorage(context: Context) {

    private val sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

    var test by publicProperty(false, "test")

    private fun <T> publicProperty(default: T, key: String) =
        PreferenceProperty(default, key, sharedPreferences)
}
