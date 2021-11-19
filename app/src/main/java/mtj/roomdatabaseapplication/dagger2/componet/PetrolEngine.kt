package mtj.roomdatabaseapplication.dagger2.componet

import android.util.Log
import mtj.roomdatabaseapplication.dagger2.Engine
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horsePower")val horsePower:Int,@Named("EngCapacity") val EngCapacity:Int):Engine {


    override fun start() {
        Log.d("Car","PetrolEngine Started ${horsePower} and EngCapacity ${EngCapacity}")
    }

}
