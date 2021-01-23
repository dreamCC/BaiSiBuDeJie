package com.zcj.baisibudejie.mvp.view.imp;

public abstract class BaseMvpLceView<M> implements MvpLceViewInterface<M> {

    @Override
    public void showLoading(boolean pullToRefresh) {

    }

    @Override
    public void showContent() {

    }

    @Override
    public void showError(Exception e, boolean pullToRefresh) {

    }

    @Override
    public void showData(M data) {

    }
}
