package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import p219o00oO0O0.o0O00o0;
import p224o00oOOOo.oOO00000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements OooO<InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOO00000 f12487OooO00o;

    public static final class OooO00o implements OooO.OooO00o<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O00o0 f12488OooO00o;

        public OooO00o(o0O00o0 o0o00o1) {
            this.f12488OooO00o = o0o00o1;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final Class<InputStream> OooO00o() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final OooO<InputStream> OooO0O0(InputStream inputStream) {
            return new OooOo00(inputStream, this.f12488OooO00o);
        }
    }

    public OooOo00(InputStream inputStream, o0O00o0 o0o00o1) {
        oOO00000 ooo00000 = new oOO00000(inputStream, o0o00o1);
        this.f12487OooO00o = ooo00000;
        ooo00000.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.OooO
    public final void OooO0O0() {
        this.f12487OooO00o.release();
    }

    @Override // com.bumptech.glide.load.data.OooO
    @NonNull
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final InputStream OooO00o() throws IOException {
        this.f12487OooO00o.reset();
        return this.f12487OooO00o;
    }
}
