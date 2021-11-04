package mtj.roomdatabaseapplication.dagger2.componet.Module

import dagger.Binds
import dagger.Module
import dagger.Provides
import mtj.roomdatabaseapplication.dagger2.Engine
import mtj.roomdatabaseapplication.dagger2.componet.DiselEngine
import mtj.roomdatabaseapplication.dagger2.componet.PetrolEngine

@Module
 class DiselEngineeModule constructor(val horsePower:Int){


    @Provides
     fun provideDiselEnginee ():Engine{
         return DiselEngine(horsePower)
     }

}