package com.salamancabus.app.android.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.salamancabus.app.android.common.injection.module.ApplicationTestModule;
import com.salamancabus.app.android.injection.component.AppComponent;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends AppComponent {
}
