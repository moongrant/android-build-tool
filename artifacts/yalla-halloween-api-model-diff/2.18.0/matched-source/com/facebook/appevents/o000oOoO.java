package com.facebook.appevents;

import p295o0O0Oo0o.o0O0O00;
import p319o0O0oOo.o00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12779Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12780OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12781OoooO00;

    public /* synthetic */ o000oOoO(Object obj, Object obj2, int i) {
        this.f12779Oooo = i;
        this.f12781OoooO00 = obj;
        this.f12780OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12779Oooo) {
            case 0:
                UserDataStore.m127writeDataIntoCache$lambda0((String) this.f12781OoooO00, (String) this.f12780OoooO0);
                break;
            default:
                com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = (com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o) this.f12781OoooO00;
                o0O0O00 o0o0o00 = (o0O0O00) this.f12780OoooO0;
                com.google.android.exoplayer2.audio.OooO00o oooO00o = c0096OooO00o.f13570OooO0O0;
                int i = o00.f36680OooO00o;
                oooO00o.OooOo0(o0o0o00);
                break;
        }
    }
}
