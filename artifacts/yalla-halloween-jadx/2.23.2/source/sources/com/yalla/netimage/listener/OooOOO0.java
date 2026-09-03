package com.yalla.netimage.listener;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00oO0;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oO00000o;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends o0O00oO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Handler f22142OooO = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O00oO0 f22143OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0o0000 f22144OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f22145OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOO0O f22146OooO0oo;

    public class OooO00o extends oo0ooO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f22147OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f22148OooO0o0;

        /* JADX INFO: renamed from: com.yalla.netimage.listener.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0283OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ int f22150OooO0Oo;

            public RunnableC0283OooO00o(int i) {
                this.f22150OooO0Oo = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOO0O oooOO0O = OooOOO0.this.f22146OooO0oo;
                if (oooOO0O != null) {
                    int i = this.f22150OooO0Oo;
                    oooOO0O.OooO0O0(i, false);
                    Log.w("ProgressSource", "progress = " + i);
                }
            }
        }

        public OooO00o(o0O0o0 o0o0o0) {
            super(o0o0o0);
            this.f22148OooO0o0 = 0L;
        }

        @Override // p662o0oooO0O.oo0ooO, p662o0oooO0O.oO00000
        public final long OooOO0O(oo0OOoo oo0oooo, long j) throws IOException {
            String str;
            long jOooOO0O = super.OooOO0O(oo0oooo, j);
            OooOOO0 oooOOO0 = OooOOO0.this;
            long jOooO0OO = oooOOO0.f22143OooO0o.OooO0OO();
            if (jOooOO0O == -1) {
                this.f22148OooO0o0 = jOooO0OO;
            } else {
                this.f22148OooO0o0 += jOooOO0O;
            }
            int i = (int) ((this.f22148OooO0o0 * 100.0f) / jOooO0OO);
            if (i != this.f22147OooO0o) {
                OooOOO0.f22142OooO.post(new RunnableC0283OooO00o(i));
            }
            if (this.f22148OooO0o0 == jOooO0OO && (str = oooOOO0.f22145OooO0oO) != null) {
                OooOO0.f22141OooO00o.remove(str);
            }
            this.f22147OooO0o = i;
            return jOooOO0O;
        }

        @Override // p662o0oooO0O.oo0ooO, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
        }

        @Override // p662o0oooO0O.oo0ooO, p662o0oooO0O.oO00000
        public final oO00000o timeout() {
            OooOOO0 oooOOO0 = OooOOO0.this;
            OooOO0O oooOO0O = oooOOO0.f22146OooO0oo;
            if (oooOO0O != null) {
                oooOO0O.OooO00o();
                oooOOO0.f22146OooO0oo = null;
            }
            String str = oooOOO0.f22145OooO0oO;
            if (str != null) {
                OooOO0.f22141OooO00o.remove(str);
            }
            return super.timeout();
        }
    }

    public OooOOO0(String str, o0O00oO0 o0o00oo1) {
        this.f22145OooO0oO = str;
        this.f22143OooO0o = o0o00oo1;
        this.f22146OooO0oo = (OooOO0O) OooOO0.f22141OooO00o.get(str);
    }

    @Override // p641o0ooOO0o.o0O00oO0
    public final long OooO0OO() {
        return this.f22143OooO0o.OooO0OO();
    }

    @Override // p641o0ooOO0o.o0O00oO0
    @Nullable
    public final o0O000Oo OooO0oO() {
        return this.f22143OooO0o.OooO0oO();
    }

    @Override // p641o0ooOO0o.o0O00oO0
    public final o0O0o0 OooOOo() {
        if (this.f22144OooO0o0 == null) {
            this.f22144OooO0o0 = o0OO.OooO0O0(new OooO00o(this.f22143OooO0o.OooOOo()));
        }
        return this.f22144OooO0o0;
    }
}
