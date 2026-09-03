package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.util.Objects;
import p433o0OoOO0o.o0O0o;
import p436o0OoOOOO.o0O00OOO;
import p439o0OoOOo0.o00;
import p439o0OoOOo0.o000;
import p439o0OoOOo0.o00O00;
import p439o0OoOOo0.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public class TweetActionBarView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o0O0o<o0O00OOO> f20141Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO00o f20142Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ToggleImageButton f20143Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ImageButton f20144Oooo0oo;

    public static class OooO00o {
    }

    public TweetActionBarView(Context context) {
        OooO00o oooO00o = new OooO00o();
        super(context, null);
        this.f20142Oooo0o = oooO00o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f20143Oooo0oO = (ToggleImageButton) findViewById(o00.tw__tweet_like_button);
        this.f20144Oooo0oo = (ImageButton) findViewById(o00.tw__tweet_share_button);
    }

    public void setLike(o0O00OOO o0o00ooo2) {
        Objects.requireNonNull(this.f20142Oooo0o);
        o00O0OO0 o00o0oo0OooO00o = o00O0OO0.OooO00o();
        if (o0o00ooo2 != null) {
            this.f20143Oooo0oO.setToggledOn(o0o00ooo2.f40009OooO0oO);
            this.f20143Oooo0oO.setOnClickListener(new o000(o0o00ooo2, o00o0oo0OooO00o, this.f20141Oooo));
        }
    }

    public void setOnActionCallback(o0O0o<o0O00OOO> o0o0o) {
        this.f20141Oooo = o0o0o;
    }

    public void setShare(o0O00OOO o0o00ooo2) {
        Objects.requireNonNull(this.f20142Oooo0o);
        o00O0OO0.OooO00o();
        if (o0o00ooo2 != null) {
            this.f20144Oooo0oo.setOnClickListener(new o00O00(o0o00ooo2));
        }
    }

    public void setTweet(o0O00OOO o0o00ooo2) {
        setLike(o0o00ooo2);
        setShare(o0o00ooo2);
    }

    public TweetActionBarView(Context context, AttributeSet attributeSet) {
        OooO00o oooO00o = new OooO00o();
        super(context, attributeSet);
        this.f20142Oooo0o = oooO00o;
    }
}
