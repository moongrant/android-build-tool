package com.code.android.util;

import com.google.firebase.perf.FirebasePerfRegistrar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O00 implements com.google.firebase.components.OooO {
    public static o000Oo0 OooO00o(String str, String str2) {
        o000Oo0 o000oo1 = new o000Oo0(str);
        Intrinsics.checkNotNullParameter(o000oo1, str2);
        return o000oo1;
    }

    @Override // com.google.firebase.components.OooO
    public Object OooO0OO(com.google.firebase.components.oo000o oo000oVar) {
        return FirebasePerfRegistrar.providesFirebasePerformance(oo000oVar);
    }
}
