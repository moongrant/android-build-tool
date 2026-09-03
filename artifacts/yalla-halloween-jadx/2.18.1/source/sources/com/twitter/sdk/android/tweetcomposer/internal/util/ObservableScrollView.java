package com.twitter.sdk.android.tweetcomposer.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.facebook.appevents.ml.OooO;
import com.twitter.sdk.android.tweetcomposer.ComposerView;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableScrollView extends ScrollView {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO00o f20085Oooo0o;

    public interface OooO00o {
    }

    public ObservableScrollView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OooO00o oooO00o = this.f20085Oooo0o;
        if (oooO00o != null) {
            ComposerView composerView = (ComposerView) ((OooO) oooO00o).f12757OooO0o0;
            if (i2 > 0) {
                composerView.f20070OoooO0O.setVisibility(0);
            } else {
                composerView.f20070OoooO0O.setVisibility(4);
            }
        }
    }

    public void setScrollViewListener(OooO00o oooO00o) {
        this.f20085Oooo0o = oooO00o;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public ObservableScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
