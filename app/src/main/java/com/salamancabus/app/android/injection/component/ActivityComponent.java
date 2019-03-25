package com.salamancabus.app.android.injection.component;

import dagger.Subcomponent;
import com.salamancabus.app.android.features.detail.DetailActivity;
import com.salamancabus.app.android.features.main.MainActivity;
import com.salamancabus.app.android.injection.PerActivity;
import com.salamancabus.app.android.injection.module.ActivityModule;

@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(DetailActivity detailActivity);
}
