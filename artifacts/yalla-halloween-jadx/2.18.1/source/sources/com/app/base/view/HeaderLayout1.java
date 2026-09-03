package com.app.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.app.base.application.App;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public class HeaderLayout1 extends Toolbar {
    public HeaderLayout1(Context context) {
        super(context);
        OooOOO.OooO00o(R.color.color_white);
        OooOoO0();
    }

    public final void OooOoO0() {
        setTitle("");
        setNavigationIcon(R.drawable.btn_return);
        OooOo0O(App.f11458Oooo0oO, R.style.ToolbarTitleTextAppearance);
        setBackgroundColor(OooOOO.OooO00o(R.color.color_00d8c9));
        OooOOO.OooO00o(R.color.color_white);
    }

    public ImageButton getRightButton() {
        return null;
    }

    public TextView getRightTextView() {
        return null;
    }

    public TextView getTitleView() {
        return null;
    }

    public void setLeftIcon(int i) {
        setNavigationIcon(i);
    }

    public void setTitleColor(int i) {
    }

    public void setTitleTextStyle(Context context) {
        OooOo0O(context, R.style.ToolbarTitleTextAppearance);
    }

    public HeaderLayout1(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOOO.OooO00o(R.color.color_white);
        OooOoO0();
    }

    public HeaderLayout1(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooOOO.OooO00o(R.color.color_white);
        OooOoO0();
    }
}
