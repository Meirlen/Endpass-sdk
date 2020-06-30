package endpass.android.endpass_sdk.presentation.utils

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*


object DateUtils {


    fun getDate(milliSeconds: Long): String = getDate(milliSeconds, "MMM d, yyyy  ")


    /**
     * Return date in specified format.
     * @param milliSeconds Date in milliseconds
     * @param dateFormat Date format
     * @return String representing date in specified format
     */
    @SuppressLint("SimpleDateFormat")
    fun getDate(milliSeconds: Long, dateFormat: String): String {
        // Create a DateFormatter object for displaying date in specified format.
        val formatter = SimpleDateFormat(dateFormat)

        // Create a calendar object that will convert the date and time value in milliseconds to date.
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = milliSeconds
        calendar.timeInMillis = milliSeconds * 1000L
        return formatter.format(calendar.time)
    }
}