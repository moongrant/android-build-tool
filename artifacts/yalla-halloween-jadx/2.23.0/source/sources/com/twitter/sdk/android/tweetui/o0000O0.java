package com.twitter.sdk.android.tweetui;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends p347o0OOOOoo.Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f22444OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f22445OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(int i, int i2, Oooo000 oooo000, OooOOO0 oooOOO0) {
        super(i, i2);
        this.f22444OooO = oooo000;
        this.f22445OooOO0 = oooOOO0;
    }

    @Override // android.text.style.ClickableSpan, p347o0OOOOoo.o000oOoO
    public final void onClick(View view) {
        Oooo000 oooo000 = this.f22444OooO;
        if (oooo000 == null) {
            return;
        }
        String str = this.f22445OooOO0.f22312OooO0Oo;
        OooO00o oooO00o = (OooO00o) ((p671oo0oOOo.OooOo00) oooo000).f60922OooO0Oo;
        int i = OooO00o.f22277OooOo0;
        oooO00o.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (com.twitter.sdk.android.core.OooOO0.OooO00o(oooO00o.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str)))) {
            return;
        }
        com.twitter.sdk.android.core.o00Oo0.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to open URL");
    }
}
