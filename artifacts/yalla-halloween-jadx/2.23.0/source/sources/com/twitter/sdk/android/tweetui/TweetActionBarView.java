package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public class TweetActionBarView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f22337OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ImageButton f22338OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ToggleImageButton f22339OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> f22340OooO0oO;

    public static class OooO00o {
    }

    public TweetActionBarView(Context context) {
        this(context, null, new OooO00o());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f22339OooO0o0 = (ToggleImageButton) findViewById(oo0o0Oo.tw__tweet_like_button);
        this.f22338OooO0o = (ImageButton) findViewById(oo0o0Oo.tw__tweet_share_button);
    }

    public void setLike(com.twitter.sdk.android.core.models.OooOo oooOo) {
        this.f22337OooO0Oo.getClass();
        o0000O o0000oOooO00o = o0000O.OooO00o();
        if (oooOo != null) {
            this.f22339OooO0o0.setToggledOn(oooOo.f22071OooO0oO);
            this.f22339OooO0o0.setOnClickListener(new OooOo(oooOo, o0000oOooO00o, this.f22340OooO0oO));
        }
    }

    public void setOnActionCallback(com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0) {
        this.f22340OooO0oO = oooO0O0;
    }

    public void setShare(com.twitter.sdk.android.core.models.OooOo oooOo) {
        this.f22337OooO0Oo.getClass();
        o0000O.OooO00o();
        if (oooOo != null) {
            this.f22338OooO0o.setOnClickListener(new o00000O0(oooOo));
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
        this.f22337OooO0Oo = oooO00o;
    }
}
