package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.Nullable;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f13379OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f13380OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f13381OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000oOoO f13382OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f13383OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Handler f13384OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Object f13385OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13386OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f13387OooO0oo;

    public interface OooO00o {
    }

    public interface OooO0O0 {
        void OooOOOo(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public OooOo(OooO00o oooO00o, OooO0O0 oooO0O0, o000oOoO o000oooo2, int i, Handler handler) {
        this.f13381OooO0O0 = oooO00o;
        this.f13380OooO00o = oooO0O0;
        this.f13382OooO0OO = o000oooo2;
        this.f13384OooO0o = handler;
        this.f13386OooO0oO = i;
    }

    public final synchronized void OooO00o(boolean z) {
        this.f13379OooO = true;
        notifyAll();
    }

    public final OooOo OooO0O0() {
        o00000O0.OooO0Oo(!this.f13387OooO0oo);
        this.f13387OooO0oo = true;
        OooOOO0 oooOOO0 = (OooOOO0) this.f13381OooO0O0;
        synchronized (oooOOO0) {
            if (oooOOO0.f13326OoooooO || !oooOOO0.f13309OoooO.isAlive()) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                OooO00o(false);
            } else {
                oooOOO0.f13312OoooO0O.OooO00o(14, this).sendToTarget();
            }
        }
        return this;
    }
}
