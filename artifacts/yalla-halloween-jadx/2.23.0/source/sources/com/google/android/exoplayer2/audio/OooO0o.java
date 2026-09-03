package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.OooO0o;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import p206o00o0oOO.o0;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface OooO0o {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Handler f11610OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooO0o f11611OooO0O0;

        public OooO00o(@Nullable Handler handler, @Nullable com.google.android.exoplayer2.OooOOO.OooO0O0 oooO0O0) {
            this.f11610OooO00o = handler;
            this.f11611OooO0O0 = oooO0O0;
        }

        public final void OooO00o(final o0 o0Var) {
            synchronized (o0Var) {
            }
            Handler handler = this.f11610OooO00o;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o00o0oO0.o0000O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO0o.OooO00o oooO00o = this.f39330OooO0Oo;
                        o0 o0Var2 = o0Var;
                        oooO00o.getClass();
                        synchronized (o0Var2) {
                        }
                        OooO0o oooO0o = oooO00o.f11611OooO0O0;
                        int i = o0O00.f40595OooO00o;
                        oooO0o.OooOOOo(o0Var2);
                    }
                });
            }
        }
    }

    void OooO0Oo(String str);

    void OooO0o0(Exception exc);

    void OooO0oO(long j);

    @Deprecated
    void OooOO0();

    void OooOO0o(long j, long j2, String str);

    void OooOOOO(com.google.android.exoplayer2.OooOo oooOo, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void OooOOOo(o0 o0Var);

    void OooOOo(o0 o0Var);

    void OooOOo0(Exception exc);

    void OooOo0O(int i, long j, long j2);

    void onSkipSilenceEnabledChanged(boolean z);
}
