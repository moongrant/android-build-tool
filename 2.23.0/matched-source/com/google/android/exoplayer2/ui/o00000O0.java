package com.google.android.exoplayer2.ui;

import android.view.View;
import com.twitter.sdk.android.tweetcomposer.ComposerView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f14079OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f14080OooO0o0;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f14079OooO0Oo = i;
        this.f14080OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f14079OooO0Oo;
        Object obj = this.f14080OooO0o0;
        switch (i) {
            case 0:
                o0000.OooO00o((o0000) obj, view);
                break;
            default:
                ComposerView composerView = (ComposerView) obj;
                ((com.twitter.sdk.android.tweetcomposer.OooO00o.OooO0O0) composerView.f22247OooOOO0).OooO00o(composerView.getTweetText());
                break;
        }
    }
}
