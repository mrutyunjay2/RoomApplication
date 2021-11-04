package mtj.roomdatabaseapplication.dagger2

import android.util.Log
import javax.inject.Inject

class Car  @Inject constructor(val engine:Engine,val wheels:Wheels) {

    init {
        Log.d("Car","Car class Created")
    }
    fun start(){
        engine.start()
        Log.d("Car","Car started")
    }
}