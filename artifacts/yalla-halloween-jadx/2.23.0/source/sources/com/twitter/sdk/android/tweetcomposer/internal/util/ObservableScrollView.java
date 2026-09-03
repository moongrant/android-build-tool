package com.twitter.sdk.android.tweetcomposer.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.twitter.sdk.android.tweetcomposer.ComposerView;
import p345o0OOOOo.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
public class ObservableScrollView extends ScrollView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f22259OooO0Oo;

    public interface OooO00o {
    }

    public ObservableScrollView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OooO00o oooO00o = this.f22259OooO0Oo;
        if (oooO00o != null) {
            ComposerView composerView = (ComposerView) ((o0OoOo0) oooO00o).f43663OooO0Oo;
            if (i2 > 0) {
                composerView.f22243OooOO0.setVisibility(0);
            } else {
                composerView.f22243OooOO0.setVisibility(4);
            }
        }
    }

    public void setScrollViewListener(OooO00o oooO00o) {
        this.f22259OooO0Oo = oooO00o;
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
