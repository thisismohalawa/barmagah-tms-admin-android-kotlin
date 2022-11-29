package barmagah.tms.admin.care

import android.os.Handler
import android.os.Looper


fun actionPostDelayed(millisValue: Long, action: (() -> Unit)? = null) {
    Handler(Looper.getMainLooper()).postDelayed({
        action?.let { it() }
    }, millisValue)
}