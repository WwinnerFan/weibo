package com.fy.weibo.listener;

import android.support.v7.widget.RecyclerView;

/**
 * Created by Fan on 2018/8/31.
 * Fighting!!!
 */
public final class RecyclerViewScrollListener extends RecyclerView.OnScrollListener {


    private HideListener hideListener;
    // 控件是否可见
    private boolean visible = true;
    private int distance = 0;

    public RecyclerViewScrollListener(HideListener hideListener) {
        super();
        this.hideListener = hideListener;

    }

    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
        }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        if (distance > 20 && visible) {
            visible = false;
            hideListener.hide();
            distance = 0;
        } else if (distance < -20 && !visible) {
            visible = true;
            hideListener.show();
            distance = 0;
        }
        /*
        当控件可见并且手指向上滑动或者控件不可见并且手指向下滑动时
        distance 累加

        dy > 0表示手指向上滑，可以将显示的内容看成一个画布，当手指下滑时就如同拖动画布向下滚动
        纵坐标增大
         */
        if (visible && dy > 0 || (!visible && dy < 0)) {
            distance += dy;
        }

    }
}


