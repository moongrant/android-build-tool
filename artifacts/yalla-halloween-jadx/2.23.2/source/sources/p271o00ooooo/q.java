package p271o00ooooo;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzjz f40822OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f40824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzq f40826OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f40827OooO0oo;

    public q(zzjz zzjzVar, AtomicReference atomicReference, String str, String str2, zzq zzqVar, boolean z) {
        this.f40822OooO = zzjzVar;
        this.f40823OooO0Oo = atomicReference;
        this.f40825OooO0o0 = str;
        this.f40824OooO0o = str2;
        this.f40826OooO0oO = zzqVar;
        this.f40827OooO0oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f40823OooO0Oo) {
            try {
                try {
                    zzjz zzjzVar = this.f40822OooO;
                    zzej zzejVar = zzjzVar.f15588OooO0Oo;
                    if (zzejVar == null) {
                        zzjzVar.f40788OooO00o.zzaA().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.f40825OooO0o0, this.f40824OooO0o);
                        this.f40823OooO0Oo.set(Collections.emptyList());
                        this.f40823OooO0Oo.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.f40826OooO0oO);
                        this.f40823OooO0Oo.set(zzejVar.zzh(this.f40825OooO0o0, this.f40824OooO0o, this.f40827OooO0oo, this.f40826OooO0oO));
                    } else {
                        this.f40823OooO0Oo.set(zzejVar.zzi(null, this.f40825OooO0o0, this.f40824OooO0o, this.f40827OooO0oo));
                    }
                    this.f40822OooO.OooO();
                    atomicReference = this.f40823OooO0Oo;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f40822OooO.f40788OooO00o.zzaA().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.f40825OooO0o0, e);
                    this.f40823OooO0Oo.set(Collections.emptyList());
                    atomicReference = this.f40823OooO0Oo;
                }
            } catch (Throwable th) {
                this.f40823OooO0Oo.notify();
                throw th;
            }
        }
    }
}
