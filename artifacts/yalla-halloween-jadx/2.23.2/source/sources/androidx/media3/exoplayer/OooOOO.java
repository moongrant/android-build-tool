package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.Oooo0;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeoutException;
import p080o000OoO.o00Oo0;
import p080o000OoO.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f7298OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f7299OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f7300OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0ooOOo f7301OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f7302OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Looper f7303OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Object f7304OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f7305OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f7306OooO0oo;

    public interface OooO00o {
    }

    public interface OooO0O0 {
        void OooOO0o(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public OooOOO(OooOO0O oooOO0O, OooO0O0 oooO0O0, Oooo0 oooo0, int i, o0ooOOo o0ooooo, Looper looper) {
        this.f7300OooO0O0 = oooOO0O;
        this.f7299OooO00o = oooO0O0;
        this.f7303OooO0o = looper;
        this.f7301OooO0OO = o0ooooo;
    }

    public final synchronized void OooO00o(long j) throws InterruptedException, TimeoutException {
        boolean z;
        o00Oo0.OooO0Oo(this.f7305OooO0oO);
        o00Oo0.OooO0Oo(this.f7303OooO0o.getThread() != Thread.currentThread());
        long jElapsedRealtime = this.f7301OooO0OO.elapsedRealtime() + j;
        while (true) {
            z = this.f7298OooO;
            if (z || j <= 0) {
                break;
            }
            this.f7301OooO0OO.OooO0OO();
            wait(j);
            j = jElapsedRealtime - this.f7301OooO0OO.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void OooO0O0(boolean z) {
        this.f7306OooO0oo = z | this.f7306OooO0oo;
        this.f7298OooO = true;
        notifyAll();
    }

    @CanIgnoreReturnValue
    public final void OooO0OO() {
        o00Oo0.OooO0Oo(!this.f7305OooO0oO);
        this.f7305OooO0oO = true;
        OooOO0O oooOO0O = (OooOO0O) this.f7300OooO0O0;
        synchronized (oooOO0O) {
            if (!oooOO0O.f7260OooOoo && oooOO0O.f7246OooOOO0.getThread().isAlive()) {
                oooOO0O.f7243OooOO0O.OooO0o0(14, this).OooO00o();
                return;
            }
            Log.OooO0o("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            OooO0O0(false);
        }
    }
}
