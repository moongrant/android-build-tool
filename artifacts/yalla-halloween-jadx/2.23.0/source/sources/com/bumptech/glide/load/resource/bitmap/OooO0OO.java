package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import o00OO0O0.o0ooOOo;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p129o00O0ooo.o0000;
import p129o00O0ooo.o0000oo;
import p532o0o0Oo.o000000;
import p532o0o0Oo.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements o00000O0<InputStream, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.OooO00o f10013OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000 f10014OooO0O0;

    public static class OooO00o implements com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0ooOOo f10015OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000000 f10016OooO0O0;

        public OooO00o(o0ooOOo o0ooooo, o000000 o000000Var) {
            this.f10015OooO00o = o0ooooo;
            this.f10016OooO0O0 = o000000Var;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO00o(Bitmap bitmap, o0000oo o0000ooVar) throws IOException {
            IOException iOException = this.f10016OooO0O0.f54560OooO0o0;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                o0000ooVar.OooO0Oo(bitmap);
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO0O0() {
            o0ooOOo o0ooooo = this.f10015OooO00o;
            synchronized (o0ooooo) {
                o0ooooo.f37247OooO0o = o0ooooo.f37246OooO0Oo.length;
            }
        }
    }

    public OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o, o0000 o0000Var) {
        this.f10013OooO00o = oooO00o;
        this.f10014OooO0O0 = o0000Var;
    }

    @Override // p126o00O0oOo.o00000O0
    public final p127o00O0oo.o0000<Bitmap> OooO00o(@NonNull InputStream inputStream, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        boolean z;
        o0ooOOo o0ooooo;
        o000000 o000000Var;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof o0ooOOo) {
            o0ooooo = (o0ooOOo) inputStream2;
            z = false;
        } else {
            z = true;
            o0ooooo = new o0ooOOo(inputStream2, this.f10014OooO0O0);
        }
        ArrayDeque arrayDeque = o000000.f54558OooO0o;
        synchronized (arrayDeque) {
            o000000Var = (o000000) arrayDeque.poll();
        }
        if (o000000Var == null) {
            o000000Var = new o000000();
        }
        o000000Var.f54559OooO0Oo = o0ooooo;
        o0000Ooo o0000ooo = new o0000Ooo(o000000Var);
        OooO00o oooO00o = new OooO00o(o0ooooo, o000000Var);
        try {
            com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o2 = this.f10013OooO00o;
            return oooO00o2.OooO00o(new OooO0O0.C0175OooO0O0(oooO00o2.f10001OooO0OO, o0000ooo, oooO00o2.f10002OooO0Oo), i, i2, o00000Var, oooO00o);
        } finally {
            o000000Var.release();
            if (z) {
                o0ooooo.release();
            }
        }
    }

    @Override // p126o00O0oOo.o00000O0
    public final boolean OooO0O0(@NonNull InputStream inputStream, @NonNull o00000 o00000Var) throws IOException {
        this.f10013OooO00o.getClass();
        return true;
    }
}
