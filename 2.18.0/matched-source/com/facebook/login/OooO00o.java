package com.facebook.login;

import android.os.Bundle;
import p311o0O0o0oo.o00O00;
import p311o0O0o0oo.o00O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12869Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12870OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12871OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Object f12872OoooO0O;

    public /* synthetic */ OooO00o(Object obj, Object obj2, Object obj3, int i) {
        this.f12869Oooo = i;
        this.f12871OoooO00 = obj;
        this.f12870OoooO0 = obj2;
        this.f12872OoooO0O = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12869Oooo) {
            case 0:
                CustomTabLoginMethodHandler.m217onCustomTabComplete$lambda0((CustomTabLoginMethodHandler) this.f12871OoooO00, (LoginClient.Request) this.f12870OoooO0, (Bundle) this.f12872OoooO0O);
                break;
            default:
                o00O0O0.OooO00o oooO00o = (o00O0O0.OooO00o) this.f12871OoooO00;
                ((o00O0O0) this.f12870OoooO0).OoooO0(oooO00o.f36351OooO00o, oooO00o.f36352OooO0O0, (o00O00) this.f12872OoooO0O);
                break;
        }
    }
}
