package mtj.roomdatabaseapplication.dagger2.componet.Module

import dagger.Binds
import dagger.Module
import dagger.Provides
import mtj.roomdatabaseapplication.dagger2.Engine
import mtj.roomdatabaseapplication.dagger2.componet.PetrolEngine

@Module
abstract class PetrolEngineeModule {

    @Binds
    abstract fun providePetrolEnginee(petrolEngine: PetrolEngine):Engine
}