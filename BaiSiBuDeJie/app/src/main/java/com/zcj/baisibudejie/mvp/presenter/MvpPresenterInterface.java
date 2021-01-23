package com.zcj.baisibudejie.mvp.presenter;

import com.zcj.baisibudejie.mvp.view.MvpViewInterface;

public interface MvpPresenterInterface<V extends MvpViewInterface> {

    // 绑定view
    public void attachView(V view);

    // 解绑view
    public void detachView(V view);
}
