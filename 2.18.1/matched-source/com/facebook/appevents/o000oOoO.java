package com.facebook.appevents;

import p294o0O0Oo0o.o0O0O00;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12763Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12764Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12765Oooo0oo;

    public /* synthetic */ o000oOoO(Object obj, Object obj2, int i) {
        this.f12763Oooo0o = i;
        this.f12764Oooo0oO = obj;
        this.f12765Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12763Oooo0o) {
            case 0:
                UserDataStore.m127writeDataIntoCache$lambda0((String) this.f12764Oooo0oO, (String) this.f12765Oooo0oo);
                break;
            default:
                com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = (com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o) this.f12764Oooo0oO;
                o0O0O00 o0o0o00 = (o0O0O00) this.f12765Oooo0oo;
                com.google.android.exoplayer2.audio.OooO00o oooO00o = c0096OooO00o.f13553OooO0O0;
                int i = o000OOo0.f36740OooO00o;
                oooO00o.OooOo0(o0o0o00);
                break;
        }
    }
}
