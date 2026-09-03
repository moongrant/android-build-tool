package com.twitter.sdk.android.tweetui;

import android.content.Context;
import com.twitter.sdk.android.core.models.MediaEntity;
import p436o0OoOOOO.o0O00OOO;
import p439o0OoOOo0.o00O0000;
import p439o0OoOOo0.o00O00OO;
import p439o0OoOOo0.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public class QuoteTweetView extends OooO00o {
    public QuoteTweetView(Context context) {
        super(context, null, 0, new OooO00o.C0182OooO00o());
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
        this.f20109OoooOO0.requestLayout();
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public int getLayout() {
        return o00O0000.tw__tweet_quote;
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ o0O00OOO getTweet() {
        return super.getTweet();
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ long getTweetId() {
        return super.getTweetId();
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ void setTweet(o0O00OOO o0o00ooo2) {
        super.setTweet(o0o00ooo2);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ void setTweetLinkClickListener(oOO00O ooo00o) {
        super.setTweetLinkClickListener(ooo00o);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ void setTweetMediaClickListener(o00O00OO o00o00oo2) {
        super.setTweetMediaClickListener(o00o00oo2);
    }
}
