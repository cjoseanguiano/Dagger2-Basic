package com.androiddesdecero.dagger2.di;

import com.androiddesdecero.dagger2.Coche;
import com.androiddesdecero.dagger2.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 7/7/17.
 */

@Module
public class MotorModule {

    @Singleton
    @Named("diesel")
    @Provides
    public Motor providesMotorDiesel(){
        return new Motor("diesel");//6
    }

    @Named("gasolina")
    @Provides
    public Motor providesMotorGasolina(){
        return new Motor("gasolina");//4
    }

    @Provides
    public Coche providesCoche(@Named("diesel")Motor motor){
        return new Coche(motor);//8
    }
}
