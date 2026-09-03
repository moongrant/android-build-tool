package com.yalla.netimage.listener;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o0O0o;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000OO0;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends o0O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Handler f22612OooO = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0o f22613OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00O0000 f22614OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f22615OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOO0O f22616OooO0oo;

    public class OooO00o extends o0000OO0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f22617OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f22618OooO0o0;

        /* JADX INFO: renamed from: com.yalla.netimage.listener.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0284OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ int f22620OooO0Oo;

            public RunnableC0284OooO00o(int i) {
                this.f22620OooO0Oo = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOO0O oooOO0O = OooOOO0.this.f22616OooO0oo;
                if (oooOO0O != null) {
                    int i = this.f22620OooO0Oo;
                    oooOO0O.OooO0O0(i, false);
                    Log.w("ProgressSource", "progress = " + i);
                }
            }
        }

        public OooO00o(o0000 o0000Var) {
            super(o0000Var);
            this.f22618OooO0o0 = 0L;
        }

        @Override // p659o0oooO00.o0000OO0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
        }

        @Override // p659o0oooO00.o0000OO0, p659o0oooO00.o00O00
        public final long o0000OO0(o00000O o00000o, long j) throws IOException {
            String str;
            long jO0000OO0 = super.o0000OO0(o00000o, j);
            OooOOO0 oooOOO0 = OooOOO0.this;
            long jOooO0OO = oooOOO0.f22613OooO0o.OooO0OO();
            if (jO0000OO0 == -1) {
                this.f22618OooO0o0 = jOooO0OO;
            } else {
                this.f22618OooO0o0 += jO0000OO0;
            }
            int i = (int) ((this.f22618OooO0o0 * 100.0f) / jOooO0OO);
            if (i != this.f22617OooO0o) {
                OooOOO0.f22612OooO.post(new RunnableC0284OooO00o(i));
            }
            if (this.f22618OooO0o0 == jOooO0OO && (str = oooOOO0.f22615OooO0oO) != null) {
                OooOO0.f22611OooO00o.remove(str);
            }
            this.f22617OooO0o = i;
            return jO0000OO0;
        }

        @Override // p659o0oooO00.o0000OO0, p659o0oooO00.o00O00
        public final o00O00O timeout() {
            OooOOO0 oooOOO0 = OooOOO0.this;
            OooOO0O oooOO0O = oooOOO0.f22616OooO0oo;
            if (oooOO0O != null) {
                oooOO0O.OooO00o();
                oooOOO0.f22616OooO0oo = null;
            }
            String str = oooOOO0.f22615OooO0oO;
            if (str != null) {
                OooOO0.f22611OooO00o.remove(str);
            }
            return super.timeout();
        }
    }

    public OooOOO0(String str, o0O0o o0o0o) {
        this.f22615OooO0oO = str;
        this.f22613OooO0o = o0o0o;
        this.f22616OooO0oo = (OooOO0O) OooOO0.f22611OooO00o.get(str);
    }

    @Override // p634o0ooO0oO.o0O0o
    public final long OooO0OO() {
        return this.f22613OooO0o.OooO0OO();
    }

    @Override // p634o0ooO0oO.o0O0o
    @Nullable
    public final o00OOO0 OooO0oO() {
        return this.f22613OooO0o.OooO0oO();
    }

    @Override // p634o0ooO0oO.o0O0o
    public final o0000 OooOOo0() {
        if (this.f22614OooO0o0 == null) {
            this.f22614OooO0o0 = o000O0Oo.OooO0O0(new OooO00o(this.f22613OooO0o.OooOOo0()));
        }
        return this.f22614OooO0o0;
    }
}
