package com.salamancabus.app.android.features.main;

import java.util.List;

import com.salamancabus.app.android.features.base.MvpView;

public interface MainMvpView extends MvpView {

    void showPokemon(List<String> pokemon);

    void showProgress(boolean show);

    void showError(Throwable error);
}
