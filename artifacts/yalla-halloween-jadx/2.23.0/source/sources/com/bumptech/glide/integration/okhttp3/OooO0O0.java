package com.bumptech.glide.integration.okhttp3;

import androidx.annotation.NonNull;
import java.io.InputStream;
import o00OO00O.OooOOO0;
import o00OO00O.o00O0O;
import o00OO00O.o0OoOo0;
import o00OO00O.oo000o;
import p125o00O0oOO.oo0o0Oo;
import p126o00O0oOo.o00000;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements o0OoOo0<OooOOO0, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00o0.OooO00o f9940OooO00o;

    public OooO0O0(@NonNull o00O00o0.OooO00o oooO00o) {
        this.f9940OooO00o = oooO00o;
    }

    @Override // o00OO00O.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull OooOOO0 oooOOO0) {
        return true;
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o<InputStream> OooO0O0(@NonNull OooOOO0 oooOOO0, int i, int i2, @NonNull o00000 o00000Var) {
        OooOOO0 oooOOO1 = oooOOO0;
        return new o0OoOo0.OooO00o<>(oooOOO1, new oo0o0Oo(this.f9940OooO00o, oooOOO1));
    }

    public static class OooO00o implements o00O0O<OooOOO0, InputStream> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static volatile o00OOOO0 f9941OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O00o0.OooO00o f9942OooO00o;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OooO00o() {
            this(f9941OooO0O0);
            if (f9941OooO0O0 == null) {
                synchronized (OooO00o.class) {
                    if (f9941OooO0O0 == null) {
                        f9941OooO0O0 = new o00OOOO0();
                    }
                }
            }
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<OooOOO0, InputStream> OooO0OO(oo000o oo000oVar) {
            return new OooO0O0(this.f9942OooO00o);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }

        public OooO00o(@NonNull o00OOOO0 o00oooo1) {
            this.f9942OooO00o = o00oooo1;
        }
    }
}
