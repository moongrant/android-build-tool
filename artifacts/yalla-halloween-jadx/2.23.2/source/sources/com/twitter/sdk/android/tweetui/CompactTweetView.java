package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import com.twitter.sdk.android.core.models.MediaEntity;

/* JADX INFO: loaded from: classes2.dex */
public class CompactTweetView extends BaseTweetView {
    public CompactTweetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public final double OooO0O0(MediaEntity mediaEntity) {
        double dOooO0O0 = super.OooO0O0(mediaEntity);
        if (dOooO0O0 <= 1.0d) {
            return 1.0d;
        }
        if (dOooO0O0 > 3.0d) {
            return 3.0d;
        }
        if (dOooO0O0 < 1.3333333333333333d) {
            return 1.3333333333333333d;
        }
        return dOooO0O0;
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public final double OooO0OO(int i) {
        return 1.6d;
    }

    @Override // com.twitter.sdk.android.tweetui.BaseTweetView, com.twitter.sdk.android.tweetui.OooO00o
    public final void OooO0Oo() {
        super.OooO0Oo();
        this.f21811OooOO0.requestLayout();
    }

    @Override // com.twitter.sdk.android.tweetui.BaseTweetView
    public final void OooO0o() {
        super.OooO0o();
        setPadding(0, getResources().getDimensionPixelSize(o0Oo0oo.tw__compact_tweet_container_padding_top), 0, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(o0Oo0oo.tw__media_view_radius);
        this.f21813OooOO0o.OooO0o0(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public int getLayout() {
        return o0O0O00.tw__tweet_compact;
    }

    public CompactTweetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
