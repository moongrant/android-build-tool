package com.bumptech.glide.integration.okhttp3;

import androidx.annotation.NonNull;
import java.io.InputStream;
import o00OoO.OooOOO0;
import o00OoO.o00O0O;
import o00OoO.o0OoOo0;
import o00OoO.oo000o;
import p153o00Oo0oO.o00oO0o;
import p154o00Oo0oo.oo0o0Oo;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements o0OoOo0<OooOOO0, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OO.OooO00o f13031OooO00o;

    public OooO0O0(@NonNull o00OO.OooO00o oooO00o) {
        this.f13031OooO00o = oooO00o;
    }

    @Override // o00OoO.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull OooOOO0 oooOOO0) {
        return true;
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o<InputStream> OooO0O0(@NonNull OooOOO0 oooOOO0, int i, int i2, @NonNull oo0o0Oo oo0o0oo) {
        OooOOO0 oooOOO1 = oooOOO0;
        return new o0OoOo0.OooO00o<>(oooOOO1, new o00oO0o(this.f13031OooO00o, oooOOO1));
    }

    public static class OooO00o implements o00O0O<OooOOO0, InputStream> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static volatile o0OoO00O f13032OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00OO.OooO00o f13033OooO00o;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OooO00o() {
            this(f13032OooO0O0);
            if (f13032OooO0O0 == null) {
                synchronized (OooO00o.class) {
                    if (f13032OooO0O0 == null) {
                        f13032OooO0O0 = new o0OoO00O();
                    }
                }
            }
        }

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<OooOOO0, InputStream> OooO0Oo(oo000o oo000oVar) {
            return new OooO0O0(this.f13033OooO00o);
        }

        public OooO00o(@NonNull o0OoO00O o0ooo00o2) {
            this.f13033OooO00o = o0ooo00o2;
        }
    }
}
