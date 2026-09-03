package com.google.android.exoplayer2;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeoutException;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f12886OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f12887OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f12888OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O00OO f12889OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f12890OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Looper f12891OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Object f12892OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f12893OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f12894OooO0oo;

    public interface OooO00o {
    }

    public interface OooO0O0 {
        void OooOO0O(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public oo000o(OooOo00 oooOo00, OooO0O0 oooO0O0, oo0o0Oo oo0o0oo, int i, o00O00OO o00o00oo2, Looper looper) {
        this.f12888OooO0O0 = oooOo00;
        this.f12887OooO00o = oooO0O0;
        this.f12891OooO0o = looper;
        this.f12889OooO0OO = o00o00oo2;
    }

    public final synchronized void OooO00o(long j) throws InterruptedException, TimeoutException {
        boolean z;
        o00O000o.OooO0Oo(this.f12893OooO0oO);
        o00O000o.OooO0Oo(this.f12891OooO0o.getThread() != Thread.currentThread());
        long jElapsedRealtime = this.f12889OooO0OO.elapsedRealtime() + j;
        while (true) {
            z = this.f12886OooO;
            if (z || j <= 0) {
                break;
            }
            this.f12889OooO0OO.OooO0OO();
            wait(j);
            j = jElapsedRealtime - this.f12889OooO0OO.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void OooO0O0(boolean z) {
        this.f12894OooO0oo = z | this.f12894OooO0oo;
        this.f12886OooO = true;
        notifyAll();
    }

    @CanIgnoreReturnValue
    public final void OooO0OO() {
        o00O000o.OooO0Oo(!this.f12893OooO0oO);
        this.f12893OooO0oO = true;
        OooOo00 oooOo00 = (OooOo00) this.f12888OooO0O0;
        synchronized (oooOo00) {
            if (!oooOo00.f11290OooOoo && oooOo00.f11276OooOOO0.getThread().isAlive()) {
                oooOo00.f11273OooOO0O.OooO0o0(14, this).OooO00o();
                return;
            }
            Log.OooO0o("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            OooO0O0(false);
        }
    }
}
