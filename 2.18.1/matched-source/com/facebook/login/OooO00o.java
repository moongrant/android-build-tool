package com.facebook.login;

import android.os.Bundle;
import p310o0O0o0oo.o00O000o;
import p310o0O0o0oo.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Object f12853Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12854Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12855Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12856Oooo0oo;

    public /* synthetic */ OooO00o(Object obj, Object obj2, Object obj3, int i) {
        this.f12854Oooo0o = i;
        this.f12855Oooo0oO = obj;
        this.f12856Oooo0oo = obj2;
        this.f12853Oooo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12854Oooo0o) {
            case 0:
                CustomTabLoginMethodHandler.m217onCustomTabComplete$lambda0((CustomTabLoginMethodHandler) this.f12855Oooo0oO, (LoginClient.Request) this.f12856Oooo0oo, (Bundle) this.f12853Oooo);
                break;
            default:
                o00O0O00.OooO00o oooO00o = (o00O0O00.OooO00o) this.f12855Oooo0oO;
                ((o00O0O00) this.f12856Oooo0oo).OoooO0(oooO00o.f36343OooO00o, oooO00o.f36344OooO0O0, (o00O000o) this.f12853Oooo);
                break;
        }
    }
}
