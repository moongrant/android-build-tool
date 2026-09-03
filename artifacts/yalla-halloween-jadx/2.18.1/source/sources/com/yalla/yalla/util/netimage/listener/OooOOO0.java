package com.yalla.yalla.util.netimage.listener;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOOo;
import p674o0oooo0.o0O00000;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends o00OOOOo {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final Handler f26302OoooO0O = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o00OOOOo f26303Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o0O00OO f26304Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooOO0O f26305OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f26306OoooO00;

    public class OooO00o extends o0O00000 {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public long f26308Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f26309Oooo0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.util.netimage.listener.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0266OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ int f26310Oooo0o;

            public RunnableC0266OooO00o(int i) {
                this.f26310Oooo0o = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOO0O oooOO0O = OooOOO0.this.f26305OoooO0;
                if (oooOO0O != null) {
                    oooOO0O.OooO0Oo(this.f26310Oooo0o, false);
                    Log.w("ProgressSource", "progress = " + this.f26310Oooo0o);
                }
            }
        }

        public OooO00o(o0O0O0O o0o0o0o) {
            super(o0o0o0o);
            this.f26308Oooo0oO = 0L;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.yalla.yalla.util.netimage.listener.OooOO0O>] */
        @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O
        public final long Oooo0O0(o0oOO o0ooo2, long j) throws IOException {
            String str;
            long jOooo0O0 = super.Oooo0O0(o0ooo2, j);
            long jOooO0Oo = OooOOO0.this.f26303Oooo.OooO0Oo();
            if (jOooo0O0 == -1) {
                this.f26308Oooo0oO = jOooO0Oo;
            } else {
                this.f26308Oooo0oO += jOooo0O0;
            }
            int i = (int) ((this.f26308Oooo0oO * 100.0f) / jOooO0Oo);
            if (i != this.f26309Oooo0oo) {
                OooOOO0.f26302OoooO0O.post(new RunnableC0266OooO00o(i));
            }
            if (this.f26308Oooo0oO == jOooO0Oo && (str = OooOOO0.this.f26306OoooO00) != null) {
                OooOO0.f26301OooO00o.remove(str);
            }
            this.f26309Oooo0oo = i;
            return jOooo0O0;
        }

        @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.yalla.yalla.util.netimage.listener.OooOO0O>] */
        @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O
        public final o0oO0O0o timeout() {
            OooOO0O oooOO0O = OooOOO0.this.f26305OoooO0;
            if (oooOO0O != null) {
                oooOO0O.OooO0OO();
                OooOOO0.this.f26305OoooO0 = null;
            }
            String str = OooOOO0.this.f26306OoooO00;
            if (str != null) {
                OooOO0.f26301OooO00o.remove(str);
            }
            return super.timeout();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.yalla.yalla.util.netimage.listener.OooOO0O>] */
    public OooOOO0(String str, o00OOOOo o00ooooo2) {
        this.f26306OoooO00 = str;
        this.f26303Oooo = o00ooooo2;
        this.f26305OoooO0 = (OooOO0O) OooOO0.f26301OooO00o.get(str);
    }

    @Override // p660o0ooo0o0.o00OOOOo
    public final long OooO0Oo() {
        return this.f26303Oooo.OooO0Oo();
    }

    @Override // p660o0ooo0o0.o00OOOOo
    @Nullable
    public final o00OO0O0 OooO0o() {
        return this.f26303Oooo.OooO0o();
    }

    @Override // p660o0ooo0o0.o00OOOOo
    public final o0oOOo OooO0oo() {
        if (this.f26304Oooo0oo == null) {
            this.f26304Oooo0oo = (o0O00OO) o0O000Oo.OooO0OO(new OooO00o(this.f26303Oooo.OooO0oo()));
        }
        return this.f26304Oooo0oo;
    }
}
