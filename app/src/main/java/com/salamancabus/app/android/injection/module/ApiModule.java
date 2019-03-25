package com.salamancabus.app.android.injection.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import com.salamancabus.app.android.data.remote.PokemonService;
import retrofit2.Retrofit;

/**
 * Created by shivam on 29/5/17.
 */
@Module(includes = {NetworkModule.class})
public class ApiModule {

    @Provides
    @Singleton
    PokemonService providePokemonApi(Retrofit retrofit) {
        return retrofit.create(PokemonService.class);
    }
}
