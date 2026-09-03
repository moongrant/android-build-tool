package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000Oo0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzee f37304Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f37305Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f37306Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f37307Oooo0oo;

    public o000Oo0(zzee zzeeVar, boolean z) {
        this.f37304Oooo = zzeeVar;
        this.f37305Oooo0o = zzeeVar.f15916OooO00o.currentTimeMillis();
        this.f37306Oooo0oO = zzeeVar.f15916OooO00o.elapsedRealtime();
        this.f37307Oooo0oo = z;
    }

    public abstract void OooO00o() throws RemoteException;

    public void OooO0O0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f37304Oooo.f15920OooO0o) {
            OooO0O0();
            return;
        }
        try {
            OooO00o();
        } catch (Exception e) {
            this.f37304Oooo.OooO00o(e, false, this.f37307Oooo0oo);
            OooO0O0();
        }
    }
}
