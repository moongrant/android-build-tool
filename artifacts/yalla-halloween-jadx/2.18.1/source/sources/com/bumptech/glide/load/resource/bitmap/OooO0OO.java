package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;
import p219o00oO0O0.o0O00o0;
import p219o00oO0O0.o0oOOo;
import p224o00oOOOo.oOO00000;
import p243o00oo00O.o0000O;
import p243o00oo00O.o0000oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements o00000O0<InputStream, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.OooO00o f12531OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00o0 f12532OooO0O0;

    public static class OooO00o implements com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oOO00000 f12533OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0000oo f12534OooO0O0;

        public OooO00o(oOO00000 ooo00000, o0000oo o0000ooVar) {
            this.f12533OooO00o = ooo00000;
            this.f12534OooO0O0 = o0000ooVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO00o(o0oOOo o0oooo2, Bitmap bitmap) throws IOException {
            IOException iOException = this.f12534OooO0O0.f34176Oooo0oO;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                o0oooo2.OooO0O0(bitmap);
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO0O0() {
            oOO00000 ooo00000 = this.f12533OooO00o;
            synchronized (ooo00000) {
                ooo00000.f33843Oooo0oo = ooo00000.f33841Oooo0o.length;
            }
        }
    }

    public OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o, o0O00o0 o0o00o1) {
        this.f12531OooO00o = oooO00o;
        this.f12532OooO0O0 = o0o00o1;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayDeque, java.util.Queue<o00oo00O.o0000oo>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayDeque, java.util.Queue<o00oo00O.o0000oo>] */
    @Override // p217o00oO00o.o00000O0
    public final o00OOOO0<Bitmap> OooO00o(@NonNull InputStream inputStream, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        oOO00000 ooo00000;
        boolean z;
        o0000oo o0000ooVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof oOO00000) {
            ooo00000 = (oOO00000) inputStream2;
            z = false;
        } else {
            ooo00000 = new oOO00000(inputStream2, this.f12532OooO0O0);
            z = true;
        }
        ?? r1 = o0000oo.f34174Oooo0oo;
        synchronized (r1) {
            o0000ooVar = (o0000oo) r1.poll();
        }
        if (o0000ooVar == null) {
            o0000ooVar = new o0000oo();
        }
        o0000ooVar.f34175Oooo0o = ooo00000;
        o0000O o0000o2 = new o0000O(o0000ooVar);
        OooO00o oooO00o = new OooO00o(ooo00000, o0000ooVar);
        try {
            com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o2 = this.f12531OooO00o;
            o00OOOO0<Bitmap> o00oooo0OooO00o = oooO00o2.OooO00o(new OooO0O0.OooO00o(o0000o2, oooO00o2.f12523OooO0Oo, oooO00o2.f12522OooO0OO), i, i2, o00000Var, oooO00o);
            o0000ooVar.f34176Oooo0oO = null;
            o0000ooVar.f34175Oooo0o = null;
            synchronized (r1) {
                r1.offer(o0000ooVar);
            }
            return o00oooo0OooO00o;
        } finally {
            o0000ooVar.f34176Oooo0oO = null;
            o0000ooVar.f34175Oooo0o = null;
            ?? r14 = o0000oo.f34174Oooo0oo;
            synchronized (r14) {
                r14.offer(o0000ooVar);
                if (z) {
                    ooo00000.release();
                }
            }
        }
    }

    @Override // p217o00oO00o.o00000O0
    public final boolean OooO0O0(@NonNull InputStream inputStream, @NonNull o00000 o00000Var) throws IOException {
        Objects.requireNonNull(this.f12531OooO00o);
        return true;
    }
}
