package com.salamancabus.app.android.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.salamancabus.app.android.data.DataManager;
import com.salamancabus.app.android.injection.ApplicationContext;
import com.salamancabus.app.android.injection.module.AppModule;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    @ApplicationContext
    Context context();

    Application application();

    DataManager apiManager();
}
