package mtj.roomdatabaseapplication.dagger2

import android.util.Log

class Tires {

    companion object {
        val TAG:String = "Car"
    }
    init {
        inflate()
    }
    fun  inflate(){
        Log.d(TAG,"Tires are inflated")
    }

}
