package com.google.firebase.perf.util;

import com.google.firebase.perf.metrics.Trace;
import p308o0O0oO0O.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final p307o0O0oO0.OooOOO0 f20470OooO00o = p307o0O0oO0.OooOOO0.OooO0Oo();

    public static void OooO00o(Trace trace, o0OoOo0 o0oooo0) {
        int i = o0oooo0.f42490OooO00o;
        if (i > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_TOTAL.toString(), i);
        }
        int i2 = o0oooo0.f42491OooO0O0;
        if (i2 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_SLOW.toString(), i2);
        }
        int i3 = o0oooo0.f42492OooO0OO;
        if (i3 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_FROZEN.toString(), i3);
        }
        f20470OooO00o.OooO00o("Screen trace: " + trace.f20445OooO0oO + " _fr_tot:" + i + " _fr_slo:" + i2 + " _fr_fzn:" + i3);
    }
}
