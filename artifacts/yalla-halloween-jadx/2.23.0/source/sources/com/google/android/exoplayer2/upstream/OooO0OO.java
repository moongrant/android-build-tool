package com.google.android.exoplayer2.upstream;

import android.content.Context;
import androidx.annotation.Nullable;
import p244o00oo0Oo.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0OO implements OooO00o.InterfaceC0215OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14223OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00O0OO0 f14224OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o.InterfaceC0215OooO00o f14225OooO0OO;

    public OooO0OO(Context context, OooO0o.OooO00o oooO00o) {
        this.f14223OooO00o = context.getApplicationContext();
        this.f14225OooO0OO = oooO00o;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o
    public final OooO00o OooO00o() {
        OooO0O0 oooO0O0 = new OooO0O0(this.f14223OooO00o, this.f14225OooO0OO.OooO00o());
        o00O0OO0 o00o0oo1 = this.f14224OooO0O0;
        if (o00o0oo1 != null) {
            oooO0O0.OooO0OO(o00o0oo1);
        }
        return oooO0O0;
    }
}
