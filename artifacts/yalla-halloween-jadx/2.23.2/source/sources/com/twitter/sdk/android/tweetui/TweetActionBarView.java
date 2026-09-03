package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public class TweetActionBarView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f21863OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ImageButton f21864OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ToggleImageButton f21865OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> f21866OooO0oO;

    public static class OooO00o {
    }

    public TweetActionBarView(Context context) {
        this(context, null, new OooO00o());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f21865OooO0o0 = (ToggleImageButton) findViewById(oo0o0Oo.tw__tweet_like_button);
        this.f21864OooO0o = (ImageButton) findViewById(oo0o0Oo.tw__tweet_share_button);
    }

    public void setLike(com.twitter.sdk.android.core.models.OooOo oooOo) {
        this.f21863OooO0Oo.getClass();
        o0000OO0 o0000oo0OooO00o = o0000OO0.OooO00o();
        if (oooOo != null) {
            this.f21865OooO0o0.setToggledOn(oooOo.f21600OooO0oO);
            this.f21865OooO0o0.setOnClickListener(new OooOo(oooOo, o0000oo0OooO00o, this.f21866OooO0oO));
        }
    }

    public void setOnActionCallback(com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0) {
        this.f21866OooO0oO = oooO0O0;
    }

    public void setShare(com.twitter.sdk.android.core.models.OooOo oooOo) {
        this.f21863OooO0Oo.getClass();
        o0000OO0.OooO00o();
        if (oooOo != null) {
            this.f21864OooO0o.setOnClickListener(new o00000O0(oooOo));
        }
    }

    public void setTweet(com.twitter.sdk.android.core.models.OooOo oooOo) {
        setLike(oooOo);
        setShare(oooOo);
    }

    public TweetActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new OooO00o());
    }

    public TweetActionBarView(Context context, AttributeSet attributeSet, OooO00o oooO00o) {
        super(context, attributeSet);
        this.f21863OooO0Oo = oooO00o;
    }
}
