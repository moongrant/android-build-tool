package com.google.firebase.perf.util;

import com.google.firebase.perf.metrics.Trace;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O0O00 f20003OooO00o = o0O0O00.OooO0Oo();

    public static void OooO00o(Trace trace, p308o0O0oO.OooO0o oooO0o) {
        int i = oooO0o.f41778OooO00o;
        if (i > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_TOTAL.toString(), i);
        }
        int i2 = oooO0o.f41779OooO0O0;
        if (i2 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_SLOW.toString(), i2);
        }
        int i3 = oooO0o.f41780OooO0OO;
        if (i3 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_FROZEN.toString(), i3);
        }
        f20003OooO00o.OooO00o("Screen trace: " + trace.f19973OooO0oO + " _fr_tot:" + i + " _fr_slo:" + i2 + " _fr_fzn:" + i3);
    }
}
