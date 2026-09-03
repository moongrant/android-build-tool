package p269o00ooooo;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41422OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f41423OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41424OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzq f41425OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzjz f41426OooO0oo;

    public oOO00(zzjz zzjzVar, AtomicReference atomicReference, String str, String str2, zzq zzqVar) {
        this.f41426OooO0oo = zzjzVar;
        this.f41422OooO0Oo = atomicReference;
        this.f41424OooO0o0 = str;
        this.f41423OooO0o = str2;
        this.f41425OooO0oO = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f41422OooO0Oo) {
            try {
                try {
                    zzjz zzjzVar = this.f41426OooO0oo;
                    zzej zzejVar = zzjzVar.f16064OooO0Oo;
                    if (zzejVar == null) {
                        zzjzVar.f41276OooO00o.zzaA().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.f41424OooO0o0, this.f41423OooO0o);
                        this.f41422OooO0Oo.set(Collections.emptyList());
                        this.f41422OooO0Oo.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.f41425OooO0oO);
                        this.f41422OooO0Oo.set(zzejVar.zzf(this.f41424OooO0o0, this.f41423OooO0o, this.f41425OooO0oO));
                    } else {
                        this.f41422OooO0Oo.set(zzejVar.zzg(null, this.f41424OooO0o0, this.f41423OooO0o));
                    }
                    this.f41426OooO0oo.OooO();
                    atomicReference = this.f41422OooO0Oo;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f41426OooO0oo.f41276OooO00o.zzaA().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.f41424OooO0o0, e);
                    this.f41422OooO0Oo.set(Collections.emptyList());
                    atomicReference = this.f41422OooO0Oo;
                }
            } catch (Throwable th) {
                this.f41422OooO0Oo.notify();
                throw th;
            }
        }
    }
}
