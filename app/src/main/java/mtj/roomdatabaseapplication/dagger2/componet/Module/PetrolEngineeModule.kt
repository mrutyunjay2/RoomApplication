package mtj.roomdatabaseapplication.dagger2.componet.Module

import dagger.Module
import dagger.Provides
import mtj.roomdatabaseapplication.dagger2.Engine
import mtj.roomdatabaseapplication.dagger2.componet.PetrolEngine

@Module
class PetrolEngineeModule {

    @Provides
    fun providePetrolEnginee
                (petrolEngine: PetrolEngine):Engine{
        return PetrolEngine()
    }
}