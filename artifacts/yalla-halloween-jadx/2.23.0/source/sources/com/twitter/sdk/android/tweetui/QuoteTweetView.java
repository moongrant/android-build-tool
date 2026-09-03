package com.twitter.sdk.android.tweetui;

import android.content.Context;
import com.twitter.sdk.android.core.models.MediaEntity;

/* JADX INFO: loaded from: classes4.dex */
public class QuoteTweetView extends OooO00o {
    public QuoteTweetView(Context context) {
        super(context, null, 0, new OooO00o.C0282OooO00o());
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

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public final void OooO0Oo() {
        super.OooO0Oo();
        this.f22284OooOO0.requestLayout();
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public int getLayout() {
        return o0O0O00.tw__tweet_quote;
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ com.twitter.sdk.android.core.models.OooOo getTweet() {
        return super.getTweet();
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ long getTweetId() {
        return super.getTweetId();
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ void setTweet(com.twitter.sdk.android.core.models.OooOo oooOo) {
        super.setTweet(oooOo);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ void setTweetLinkClickListener(o00000OO o00000oo2) {
        super.setTweetLinkClickListener(o00000oo2);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ void setTweetMediaClickListener(o0000Ooo o0000ooo) {
        super.setTweetMediaClickListener(o0000ooo);
    }
}
