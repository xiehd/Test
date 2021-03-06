package com.uninew.settings.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uninew.settings.R;
import com.uninew.settings.interfaces.ITimePresenter;
import com.uninew.settings.interfaces.ITimeView;
import com.uninew.settings.presenter.TimePresenter;


/**
 * Created by Administrator on 2017/8/30.
 */


public class TimeFragment extends Fragment implements ITimeView {
    private View view;
    private ITimePresenter mITimePresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_time, container, false);
        initView();
        mITimePresenter = new TimePresenter(this);
        initListener();
        return view;
    }

    private void initView() {
    }

    private void initListener() {
    }

    @Override
    public void ShowTimeFormat(String dayformat, String timeformat, String timezone) {

    }

    @Override
    public void ShowCurrentTime(String time) {

    }

    @Override
    public void ShowTiming(int state) {

    }
}
