package mtj.roomdatabaseapplication.dagger2.componet.Module

import dagger.Module
import dagger.Provides
import mtj.roomdatabaseapplication.dagger2.Rims
import mtj.roomdatabaseapplication.dagger2.Tires
import mtj.roomdatabaseapplication.dagger2.Wheels

@Module
class WheelsModule {

        @Provides
        fun provideRims():Rims{
            return Rims()
        }
        @Provides
        fun provideTires():Tires{
            return Tires()
        }
        @Provides
        fun provideWheels():Wheels{
            return Wheels(provideRims(),provideTires())
        }
}