package com.sola.android.architecture.navigator;

import android.content.Context;
import android.content.Intent;

import com.sola.android.architecture.ui.ListActivity_;
import com.sola.android.architecture.ui.SecondActivity_;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * author: Sola
 * 2015/10/30
 */
@Singleton
public class Navigator {
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    // ===========================================================
    // Constructors
    // ===========================================================

    @Inject
    public Navigator() {

//        ObjectG
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    /**
     * 切换到列表数据的Activity
     *
     * @param context 原有的Activity
     */
    public void navigatorToListActivity(Context context) {
        if (context != null) {
            Intent intentToContext = new Intent();
            intentToContext.setClass(context, ListActivity_.class);
            context.startActivity(intentToContext);
        }
    }

    /**
     * 切换到第二种Activity
     *
     * @param context 启动方
     */
    public void navigatorToSecondActivity(Context context) {
        if (context != null) {
            Intent intent = new Intent();
            intent.setClass(context, SecondActivity_.class);
            context.startActivity(intent);
        }
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
