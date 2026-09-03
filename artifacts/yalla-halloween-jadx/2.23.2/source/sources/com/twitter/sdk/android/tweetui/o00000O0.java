package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.twitter.sdk.android.core.models.User;
import p211o00o0oo0.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.twitter.sdk.android.core.models.OooOo f21966OooO0Oo;

    public o00000O0(com.twitter.sdk.android.core.models.OooOo oooOo) {
        this.f21966OooO0Oo = oooOo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        User user;
        Context context = view.getContext();
        Resources resources = view.getResources();
        com.twitter.sdk.android.core.models.OooOo oooOo = this.f21966OooO0Oo;
        if (oooOo == null || (user = oooOo.f21622OooOooO) == null) {
            return;
        }
        String string = resources.getString(o000000.tw__share_subject_format, user.f21701OooOo0O, user.f21715Oooo0O0);
        String string2 = resources.getString(o000000.tw__share_content_format, oooOo.f21622OooOooO.f21715Oooo0O0, Long.toString(oooOo.f21593OooO));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", string);
        intent.putExtra("android.intent.extra.TEXT", string2);
        intent.setType("text/plain");
        if (o000OOo0.OooO0O0(context, Intent.createChooser(intent, resources.getString(o000000.tw__share_tweet)))) {
            return;
        }
        com.twitter.sdk.android.core.o00O0O.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to handle share intent");
    }
}
