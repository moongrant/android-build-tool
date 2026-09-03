package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooO0o;
import p156o00OoO00.OooOO0;
import p160o00OoOOO.o00000O;
import p174o00OooOo.o00O;
import p174o00OooOo.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements o0O0O00<InputStream, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.OooO00o f13104OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o f13105OooO0O0;

    public static class OooO00o implements com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00000O f13106OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O0O0O f13107OooO0O0;

        public OooO00o(o00000O o00000o, o00O0O0O o00o0o0o2) {
            this.f13106OooO00o = o00000o;
            this.f13107OooO0O0 = o00o0o0o2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO00o(Bitmap bitmap, OooOO0 oooOO1) throws IOException {
            IOException iOException = this.f13107OooO0O0.f38343OooO0o0;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                oooOO1.OooO0Oo(bitmap);
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO0O0() {
            o00000O o00000o = this.f13106OooO00o;
            synchronized (o00000o) {
                o00000o.f38065OooO0o = o00000o.f38064OooO0Oo.length;
            }
        }
    }

    public OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o, OooO0o oooO0o) {
        this.f13104OooO00o = oooO00o;
        this.f13105OooO0O0 = oooO0o;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final boolean OooO00o(@NonNull InputStream inputStream, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        this.f13104OooO00o.getClass();
        return true;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final o00oOoo<Bitmap> OooO0O0(@NonNull InputStream inputStream, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        boolean z;
        o00000O o00000o;
        o00O0O0O o00o0o0o2;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof o00000O) {
            o00000o = (o00000O) inputStream2;
            z = false;
        } else {
            z = true;
            o00000o = new o00000O(inputStream2, this.f13105OooO0O0);
        }
        ArrayDeque arrayDeque = o00O0O0O.f38341OooO0o;
        synchronized (arrayDeque) {
            o00o0o0o2 = (o00O0O0O) arrayDeque.poll();
        }
        if (o00o0o0o2 == null) {
            o00o0o0o2 = new o00O0O0O();
        }
        o00o0o0o2.f38342OooO0Oo = o00000o;
        o00O o00o2 = new o00O(o00o0o0o2);
        OooO00o oooO00o = new OooO00o(o00000o, o00o0o0o2);
        try {
            com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o2 = this.f13104OooO00o;
            return oooO00o2.OooO00o(new OooO0O0.C0193OooO0O0(oooO00o2.f13092OooO0OO, o00o2, oooO00o2.f13093OooO0Oo), i, i2, oo0o0oo, oooO00o);
        } finally {
            o00o0o0o2.release();
            if (z) {
                o00000o.release();
            }
        }
    }
}
