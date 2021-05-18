package com.zcj.baisibudejie.mvp.view.imp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zcj.baisibudejie.mvp.presenter.MvpPresenterInterface;
import com.zcj.baisibudejie.mvp.view.MvpViewInterface;

public abstract class BaseMvpActivity<P extends MvpPresenterInterface> extends AppCompatActivity implements MvpViewInterface {

    protected P presenter;

    public abstract P bindPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = bindPresenter();
        if (presenter != null) {
            presenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (presenter != null) {
            presenter.detachView(this);
        }
    }
}
