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
public final class n implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40527OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f40528OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40529OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzq f40530OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzjz f40531OooO0oo;

    public n(zzjz zzjzVar, AtomicReference atomicReference, String str, String str2, zzq zzqVar) {
        this.f40531OooO0oo = zzjzVar;
        this.f40527OooO0Oo = atomicReference;
        this.f40529OooO0o0 = str;
        this.f40528OooO0o = str2;
        this.f40530OooO0oO = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f40527OooO0Oo) {
            try {
                try {
                    zzjz zzjzVar = this.f40531OooO0oo;
                    zzej zzejVar = zzjzVar.f15588OooO0Oo;
                    if (zzejVar == null) {
                        zzjzVar.f40788OooO00o.zzaA().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.f40529OooO0o0, this.f40528OooO0o);
                        this.f40527OooO0Oo.set(Collections.emptyList());
                        this.f40527OooO0Oo.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.f40530OooO0oO);
                        this.f40527OooO0Oo.set(zzejVar.zzf(this.f40529OooO0o0, this.f40528OooO0o, this.f40530OooO0oO));
                    } else {
                        this.f40527OooO0Oo.set(zzejVar.zzg(null, this.f40529OooO0o0, this.f40528OooO0o));
                    }
                    this.f40531OooO0oo.OooO();
                    atomicReference = this.f40527OooO0Oo;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f40531OooO0oo.f40788OooO00o.zzaA().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.f40529OooO0o0, e);
                    this.f40527OooO0Oo.set(Collections.emptyList());
                    atomicReference = this.f40527OooO0Oo;
                }
            } catch (Throwable th) {
                this.f40527OooO0Oo.notify();
                throw th;
            }
        }
    }
}
