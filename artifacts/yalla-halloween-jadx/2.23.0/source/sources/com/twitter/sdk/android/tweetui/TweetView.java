package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import com.twitter.sdk.android.core.models.User;

/* JADX INFO: loaded from: classes4.dex */
public class TweetView extends BaseTweetView {
    public TweetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setVerifiedCheck(com.twitter.sdk.android.core.models.OooOo oooOo) {
        User user;
        if (oooOo == null || (user = oooOo.f22093OooOooO) == null || !user.f22193OoooO00) {
            this.f22278OooO.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            this.f22278OooO.setCompoundDrawablesWithIntrinsicBounds(0, 0, o0OO00O.tw__ic_tweet_verified, 0);
        }
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public final double OooO0OO(int i) {
        return i == 4 ? 1.0d : 1.5d;
    }

    @Override // com.twitter.sdk.android.tweetui.BaseTweetView, com.twitter.sdk.android.tweetui.OooO00o
    public final void OooO0Oo() {
        super.OooO0Oo();
        setVerifiedCheck(this.f22282OooO0oO);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public int getLayout() {
        return o0O0O00.tw__tweet;
    }

    public TweetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
