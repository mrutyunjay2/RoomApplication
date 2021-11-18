package mtj.roomdatabaseapplication.dagger2.componet


import dagger.BindsInstance
import dagger.Component
import mtj.roomdatabaseapplication.dagger2.Car
import mtj.roomdatabaseapplication.dagger2.DaggerActivity
import mtj.roomdatabaseapplication.dagger2.componet.Module.DiselEngineeModule
import mtj.roomdatabaseapplication.dagger2.componet.Module.PetrolEngineeModule
import mtj.roomdatabaseapplication.dagger2.componet.Module.WheelsModule
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class,PetrolEngineeModule::class])
interface CarComponet {

    fun getCar(): Car

    fun inject(daggerActivity: DaggerActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun  horsePower(@Named("horsePower")horsePower:Int):Builder
        @BindsInstance
        fun  EngCapacity(@Named("EngCapacity")EngCapacity:Int):Builder

        fun build():CarComponet
    }

}