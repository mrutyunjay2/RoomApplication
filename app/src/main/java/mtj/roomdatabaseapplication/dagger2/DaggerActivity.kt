package mtj.roomdatabaseapplication.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mtj.roomdatabaseapplication.MyApp
import mtj.roomdatabaseapplication.R
import mtj.roomdatabaseapplication.dagger2.componet.CarComponet
import mtj.roomdatabaseapplication.dagger2.componet.DaggerCarComponet
import mtj.roomdatabaseapplication.dagger2.componet.Module.DiselEngineeModule

import javax.inject.Inject

class DaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var car:Car
    @Inject
    lateinit var car1:Car
    lateinit var carComponet: CarComponet
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)

         //   carComponet = DaggerCarComponet.create()
        carComponet = (application as MyApp).getComponet()
        carComponet.inject(this)
          /* car =  carComponet.getCar()*/
            car.start()
            car1.start()
    }

    //Added for testing Application
}