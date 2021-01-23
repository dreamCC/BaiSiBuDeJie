package com.zcj.baisibudejie.mvp.presenter.imp;

import com.zcj.baisibudejie.mvp.presenter.MvpPresenterInterface;
import com.zcj.baisibudejie.mvp.view.MvpViewInterface;

public abstract class BaseMvpPresenter<V extends MvpViewInterface> implements MvpPresenterInterface<V> {

    private V view;

    @Override
    public void attachView(V view) {
        this.view = view;
    }

    @Override
    public void detachView(V view) {
        this.view = null;
    }
}
