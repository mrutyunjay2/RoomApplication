package mtj.roomdatabaseapplication.dagger2.componet

import dagger.Component
import mtj.roomdatabaseapplication.MainActivity
import mtj.roomdatabaseapplication.dagger2.Car
import mtj.roomdatabaseapplication.dagger2.DaggerActivity
import mtj.roomdatabaseapplication.dagger2.componet.Module.DiselEngineeModule
import mtj.roomdatabaseapplication.dagger2.componet.Module.PetrolEngineeModule
import mtj.roomdatabaseapplication.dagger2.componet.Module.WheelsModule

@Component(modules = [WheelsModule::class,DiselEngineeModule::class])
interface CarComponet {

   // fun getCar(): Car

    fun inject(daggerActivity: DaggerActivity)
}