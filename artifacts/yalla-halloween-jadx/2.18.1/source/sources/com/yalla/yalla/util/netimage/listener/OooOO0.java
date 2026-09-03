package com.yalla.yalla.util.netimage.listener;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Map<String, OooOO0O> f26301OooO00o = new HashMap();

    @Override // p660o0ooo0o0.o00OO00O
    public final o00OOOO0 intercept(o00OO00O.OooO00o oooO00o) throws IOException {
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(o00ooo01);
        o00OOOO0.OooO00o oooO00o2 = new o00OOOO0.OooO00o(o00oooo0OooO0O0);
        oooO00o2.f51458OooO0oO = new OooOOO0(o00ooo01.f51425OooO0O0.f51390OooOO0, o00oooo0OooO0O0.f51441OoooO);
        return oooO00o2.OooO00o();
    }
}
