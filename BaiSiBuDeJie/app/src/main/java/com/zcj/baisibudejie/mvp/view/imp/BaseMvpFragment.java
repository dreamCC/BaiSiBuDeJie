package com.zcj.baisibudejie.mvp.view.imp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zcj.baisibudejie.mvp.presenter.MvpPresenterInterface;
import com.zcj.baisibudejie.mvp.view.MvpViewInterface;

public abstract class BaseMvpFragment<P extends MvpPresenterInterface>  extends Fragment  implements MvpViewInterface {

    protected P presenter;

    public abstract P bindPresenter();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = bindPresenter();
        if (presenter != null) {
            presenter.attachView(this);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detachView(this);
        }
    }
}
