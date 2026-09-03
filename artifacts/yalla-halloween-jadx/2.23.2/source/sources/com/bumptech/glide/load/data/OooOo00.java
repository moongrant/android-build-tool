package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import p160o00OoOOO.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements OooO<InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O f13057OooO00o;

    public static final class OooO00o implements OooO.OooO00o<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final p156o00OoO00.OooO0o f13058OooO00o;

        public OooO00o(p156o00OoO00.OooO0o oooO0o) {
            this.f13058OooO00o = oooO0o;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final Class<InputStream> OooO00o() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final OooO<InputStream> build(InputStream inputStream) {
            return new OooOo00(inputStream, this.f13058OooO00o);
        }
    }

    public OooOo00(InputStream inputStream, p156o00OoO00.OooO0o oooO0o) {
        o00000O o00000o = new o00000O(inputStream, oooO0o);
        this.f13057OooO00o = o00000o;
        o00000o.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.OooO
    @NonNull
    public final InputStream OooO00o() throws IOException {
        o00000O o00000o = this.f13057OooO00o;
        o00000o.reset();
        return o00000o;
    }

    @Override // com.bumptech.glide.load.data.OooO
    public final void OooO0O0() {
        this.f13057OooO00o.release();
    }
}
