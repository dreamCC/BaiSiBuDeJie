package com.zcj.baisibudejie.mvp.view.imp;

import com.zcj.baisibudejie.mvp.view.MvpViewInterface;

public interface MvpLceViewInterface<M> extends MvpViewInterface {

    // 显示hud
    public void showLoading(boolean pullToRefresh);

    // 显示ContentView
    public void showContent();

    // 加载错误
    public void showError(Exception e, boolean pullToRefresh);

    // 绑定数据
    public void showData(M data);
}
