package com.bumptech.glide.integration.okhttp3;

import androidx.annotation.NonNull;
import java.io.InputStream;
import p216o00oO00O.o0O0O00;
import p217o00oO00o.o00000;
import p221o00oOO.o0000;
import p221o00oOO.o00000O;
import p221o00oOO.o00000O0;
import p221o00oOO.o0Oo0oo;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements o00000O0<o0Oo0oo, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0ooO.OooO00o f12457OooO00o;

    public OooO0O0(@NonNull o0O0ooO.OooO00o oooO00o) {
        this.f12457OooO00o = oooO00o;
    }

    @Override // p221o00oOO.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull o0Oo0oo o0oo0oo2) {
        return true;
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o<InputStream> OooO0O0(@NonNull o0Oo0oo o0oo0oo2, int i, int i2, @NonNull o00000 o00000Var) {
        o0Oo0oo o0oo0oo3 = o0oo0oo2;
        return new o00000O0.OooO00o<>(o0oo0oo3, new o0O0O00(this.f12457OooO00o, o0oo0oo3));
    }

    public static class OooO00o implements o00000O<o0Oo0oo, InputStream> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static volatile o00OO f12458OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0ooO.OooO00o f12459OooO00o;

        public OooO00o() {
            if (f12458OooO0O0 == null) {
                synchronized (OooO00o.class) {
                    if (f12458OooO0O0 == null) {
                        f12458OooO0O0 = new o00OO();
                    }
                }
            }
            this.f12459OooO00o = f12458OooO0O0;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<o0Oo0oo, InputStream> OooO00o(o0000 o0000Var) {
            return new OooO0O0(this.f12459OooO00o);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }

        public OooO00o(@NonNull o0O0ooO.OooO00o oooO00o) {
            this.f12459OooO00o = oooO00o;
        }
    }
}
