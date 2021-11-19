package mtj.roomdatabaseapplication

import android.app.Application
import mtj.roomdatabaseapplication.dagger2.componet.CarComponet
import mtj.roomdatabaseapplication.dagger2.componet.DaggerCarComponet

class MyApp:Application() {

    lateinit var carComponet: CarComponet
    override fun onCreate() {
        super.onCreate()
        carComponet = DaggerCarComponet.builder()
            .EngCapacity(1200)
            .horsePower(4500)
            .build()
    }

    fun getComponet ():CarComponet { return carComponet }

    //Added for testing Applcaitoon
}