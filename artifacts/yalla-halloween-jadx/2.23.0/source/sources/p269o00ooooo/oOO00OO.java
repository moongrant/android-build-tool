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
public final class oOO00OO implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzjz f41444OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41445OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f41446OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41447OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzq f41448OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f41449OooO0oo;

    public oOO00OO(zzjz zzjzVar, AtomicReference atomicReference, String str, String str2, zzq zzqVar, boolean z) {
        this.f41444OooO = zzjzVar;
        this.f41445OooO0Oo = atomicReference;
        this.f41447OooO0o0 = str;
        this.f41446OooO0o = str2;
        this.f41448OooO0oO = zzqVar;
        this.f41449OooO0oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f41445OooO0Oo) {
            try {
                try {
                    zzjz zzjzVar = this.f41444OooO;
                    zzej zzejVar = zzjzVar.f16064OooO0Oo;
                    if (zzejVar == null) {
                        zzjzVar.f41276OooO00o.zzaA().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.f41447OooO0o0, this.f41446OooO0o);
                        this.f41445OooO0Oo.set(Collections.emptyList());
                        this.f41445OooO0Oo.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.f41448OooO0oO);
                        this.f41445OooO0Oo.set(zzejVar.zzh(this.f41447OooO0o0, this.f41446OooO0o, this.f41449OooO0oo, this.f41448OooO0oO));
                    } else {
                        this.f41445OooO0Oo.set(zzejVar.zzi(null, this.f41447OooO0o0, this.f41446OooO0o, this.f41449OooO0oo));
                    }
                    this.f41444OooO.OooO();
                    atomicReference = this.f41445OooO0Oo;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f41444OooO.f41276OooO00o.zzaA().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.f41447OooO0o0, e);
                    this.f41445OooO0Oo.set(Collections.emptyList());
                    atomicReference = this.f41445OooO0Oo;
                }
            } catch (Throwable th) {
                this.f41445OooO0Oo.notify();
                throw th;
            }
        }
    }
}
