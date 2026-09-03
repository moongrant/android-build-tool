package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import o00OO0O0.o0ooOOo;
import p129o00O0ooo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements OooO<InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f9966OooO00o;

    public static final class OooO00o implements OooO.OooO00o<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000 f9967OooO00o;

        public OooO00o(o0000 o0000Var) {
            this.f9967OooO00o = o0000Var;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final Class<InputStream> OooO00o() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final OooO<InputStream> build(InputStream inputStream) {
            return new OooOo00(inputStream, this.f9967OooO00o);
        }
    }

    public OooOo00(InputStream inputStream, o0000 o0000Var) {
        o0ooOOo o0ooooo = new o0ooOOo(inputStream, o0000Var);
        this.f9966OooO00o = o0ooooo;
        o0ooooo.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.OooO
    @NonNull
    public final InputStream OooO00o() throws IOException {
        o0ooOOo o0ooooo = this.f9966OooO00o;
        o0ooooo.reset();
        return o0ooooo;
    }

    @Override // com.bumptech.glide.load.data.OooO
    public final void OooO0O0() {
        this.f9966OooO00o.release();
    }
}
