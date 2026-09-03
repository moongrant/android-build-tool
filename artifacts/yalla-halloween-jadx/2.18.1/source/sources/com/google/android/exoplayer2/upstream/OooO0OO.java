package com.google.android.exoplayer2.upstream;

import android.content.Context;
import p466o0OooO0.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements OooO00o.InterfaceC0104OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14852OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o.InterfaceC0104OooO00o f14853OooO0O0;

    public OooO0OO(Context context) {
        OooO oooO = new OooO(o0000O0.f40504OooO00o);
        this.f14852OooO00o = context.getApplicationContext();
        this.f14853OooO0O0 = oooO;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0104OooO00o
    public final OooO00o OooO00o() {
        return new OooO0O0(this.f14852OooO00o, this.f14853OooO0O0.OooO00o());
    }

    public OooO0OO(Context context, String str) {
        OooO oooO = new OooO(str);
        this.f14852OooO00o = context.getApplicationContext();
        this.f14853OooO0O0 = oooO;
    }
}
