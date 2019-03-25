package com.salamancabus.app.android.features.detail;

import com.salamancabus.app.android.data.model.response.Pokemon;
import com.salamancabus.app.android.data.model.response.Statistic;
import com.salamancabus.app.android.features.base.MvpView;

public interface DetailMvpView extends MvpView {

    void showPokemon(Pokemon pokemon);

    void showStat(Statistic statistic);

    void showProgress(boolean show);

    void showError(Throwable error);
}
