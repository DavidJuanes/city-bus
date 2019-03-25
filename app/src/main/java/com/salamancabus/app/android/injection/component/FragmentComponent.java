package com.salamancabus.app.android.injection.component;

import dagger.Subcomponent;
import com.salamancabus.app.android.injection.PerFragment;
import com.salamancabus.app.android.injection.module.FragmentModule;

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {
}
