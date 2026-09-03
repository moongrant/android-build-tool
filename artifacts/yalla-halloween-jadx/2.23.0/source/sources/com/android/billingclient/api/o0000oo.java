package com.android.billingclient.api;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000oo {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        double d = 0.0f - f;
        double d2 = 0.0f - f2;
        float fHypot = (float) Math.hypot(d, d2);
        double d3 = f3 - f;
        float fHypot2 = (float) Math.hypot(d3, d2);
        double d4 = f4 - f2;
        float fHypot3 = (float) Math.hypot(d3, d4);
        float fHypot4 = (float) Math.hypot(d, d4);
        if (fHypot > fHypot2 && fHypot > fHypot3 && fHypot > fHypot4) {
            return fHypot;
        }
        if (fHypot2 <= fHypot3 || fHypot2 <= fHypot4) {
            return fHypot3 > fHypot4 ? fHypot3 : fHypot4;
        }
        return fHypot2;
    }
}
