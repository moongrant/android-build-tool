package com.billy.android.swipe.refresh;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import p209o00o0oOO.o00O00;

/* JADX INFO: loaded from: classes.dex */
public class ClassicFooter extends ClassicHeader {
    public ClassicFooter(Context context) {
        super(context);
    }

    public void setNoMoreData(boolean z) {
        setText(o00O00.ssr_footer_no_more_data);
    }

    public ClassicFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClassicFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public ClassicFooter(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
