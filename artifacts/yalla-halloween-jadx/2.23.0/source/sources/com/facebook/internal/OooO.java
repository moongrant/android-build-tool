package com.facebook.internal;

import android.content.Context;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10648OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f10649OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10650OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f10651OooO0oO;

    public /* synthetic */ OooO(Context context, String str, String str2) {
        this.f10650OooO0o0 = str;
        this.f10651OooO0oO = context;
        this.f10649OooO0o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10648OooO0Oo;
        Object obj = this.f10649OooO0o;
        Object obj2 = this.f10651OooO0oO;
        Object obj3 = this.f10650OooO0o0;
        switch (i) {
            case 0:
                FetchedAppGateKeepersManager.m4124loadAppGateKeepersAsync$lambda0((String) obj3, (Context) obj2, (String) obj);
                break;
            default:
                com.google.android.exoplayer2.audio.OooO0o.OooO00o oooO00o = (com.google.android.exoplayer2.audio.OooO0o.OooO00o) obj3;
                oooO00o.getClass();
                int i2 = o0O00.f40595OooO00o;
                com.google.android.exoplayer2.audio.OooO0o oooO0o = oooO00o.f11611OooO0O0;
                oooO0o.OooOO0();
                oooO0o.OooOOOO((com.google.android.exoplayer2.OooOo) obj, (DecoderReuseEvaluation) obj2);
                break;
        }
    }

    public /* synthetic */ OooO(com.google.android.exoplayer2.audio.OooO0o.OooO00o oooO00o, com.google.android.exoplayer2.OooOo oooOo, DecoderReuseEvaluation decoderReuseEvaluation) {
        this.f10650OooO0o0 = oooO00o;
        this.f10649OooO0o = oooOo;
        this.f10651OooO0oO = decoderReuseEvaluation;
    }
}
