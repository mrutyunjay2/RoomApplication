package mtj.roomdatabaseapplication.dagger2.componet

import android.util.Log
import mtj.roomdatabaseapplication.dagger2.Engine
import javax.inject.Inject

class PetrolEngine @Inject constructor():Engine {


    override fun start() {
        Log.d("Car","PetrolEngine Started")
    }

}
