package com.twitter.sdk.android.tweetui;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import p211o00o0oo0.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O extends p353o0OOOo00.OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f21970OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f21971OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(int i, int i2, Oooo000 oooo000, OooOOO0 oooOOO0) {
        super(i, i2);
        this.f21970OooO = oooo000;
        this.f21971OooOO0 = oooOOO0;
    }

    @Override // android.text.style.ClickableSpan, p353o0OOOo00.OooO
    public final void onClick(View view) {
        Oooo000 oooo000 = this.f21970OooO;
        if (oooo000 == null) {
            return;
        }
        String str = this.f21971OooOO0.f21838OooO0Oo;
        OooO00o oooO00o = (OooO00o) ((p022Oooo00O.o000oOoO) oooo000).f603OooO0Oo;
        int i = OooO00o.f21804OooOo0;
        oooO00o.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (o000OOo0.OooO0O0(oooO00o.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str)))) {
            return;
        }
        com.twitter.sdk.android.core.o00O0O.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to open URL");
    }
}
