package mtj.roomdatabaseapplication.dagger2.componet

import android.util.Log
import mtj.roomdatabaseapplication.dagger2.Engine
import javax.inject.Inject

class DiselEngine @Inject constructor(val horsePower:Int):Engine {


    override fun start() {
        Log.d("Car", "Disel Started with horse power$horsePower")
    }

}
