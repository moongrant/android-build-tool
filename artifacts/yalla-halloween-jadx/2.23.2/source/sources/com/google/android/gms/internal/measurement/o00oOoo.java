package com.google.android.gms.internal.measurement;

import com.google.firebase.perf.FirebasePerformance;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oOoo implements p407o0Oo0Oo.OooOo00 {
    public static boolean OooO00o(String str) {
        return str.equals("POST") || str.equals(FirebasePerformance.HttpMethod.PATCH) || str.equals("PUT") || str.equals(FirebasePerformance.HttpMethod.DELETE);
    }

    public static boolean OooO0O0(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals(FirebasePerformance.HttpMethod.PATCH);
    }
}
