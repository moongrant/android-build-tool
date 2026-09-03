package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import com.twitter.sdk.android.core.models.User;
import p436o0OoOOOO.o0O00OOO;
import p439o0OoOOo0.o000OOo0;
import p439o0OoOOo0.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public class TweetView extends BaseTweetView {
    public TweetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setVerifiedCheck(o0O00OOO o0o00ooo2) {
        User user;
        if (o0o00ooo2 == null || (user = o0o00ooo2.f40031OooOooO) == null || !user.f20045o0OO00O) {
            this.f20105OoooO.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            this.f20105OoooO.setCompoundDrawablesWithIntrinsicBounds(0, 0, o000OOo0.tw__ic_tweet_verified, 0);
        }
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public final double OooO0OO(int i) {
        return i == 4 ? 1.0d : 1.5d;
    }

    @Override // com.twitter.sdk.android.tweetui.BaseTweetView, com.twitter.sdk.android.tweetui.OooO00o
    public final void OooO0Oo() {
        super.OooO0Oo();
        setVerifiedCheck(this.f20106OoooO0);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public int getLayout() {
        return o00O0000.tw__tweet;
    }

    public TweetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
