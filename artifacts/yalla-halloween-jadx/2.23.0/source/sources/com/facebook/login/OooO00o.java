package com.facebook.login;

import android.os.Bundle;
import android.util.Pair;
import p200o00o0o.o00O0O;
import p226o00oOo00.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10682OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f10683OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10684OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f10685OooO0oO;

    public /* synthetic */ OooO00o(int i, Object obj, Object obj2, Object obj3) {
        this.f10682OooO0Oo = i;
        this.f10684OooO0o0 = obj;
        this.f10683OooO0o = obj2;
        this.f10685OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10682OooO0Oo;
        Object obj = this.f10685OooO0oO;
        Object obj2 = this.f10683OooO0o;
        Object obj3 = this.f10684OooO0o0;
        switch (i) {
            case 0:
                CustomTabLoginMethodHandler.m4162onCustomTabComplete$lambda0((CustomTabLoginMethodHandler) obj3, (LoginClient.Request) obj2, (Bundle) obj);
                break;
            default:
                Pair pair = (Pair) obj2;
                o00O0O o00o0o2 = ((com.google.android.exoplayer2.o00O0O.OooO00o) obj3).f12812OooO0o0.f12807OooO0oo;
                int iIntValue = ((Integer) pair.first).intValue();
                com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = (com.google.android.exoplayer2.source.OooOOOO.OooO0O0) pair.second;
                oooO0O0.getClass();
                o00o0o2.OooOoo0(iIntValue, oooO0O0, (o0000O00) obj);
                break;
        }
    }
}
