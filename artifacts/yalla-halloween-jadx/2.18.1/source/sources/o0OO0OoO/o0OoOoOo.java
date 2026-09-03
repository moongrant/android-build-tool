package o0OO0OoO;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOoOo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzq f37859Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37860Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37861Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37862Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzjs f37863OoooO00;

    public o0OoOoOo(zzjs zzjsVar, AtomicReference atomicReference, String str, String str2, zzq zzqVar) {
        this.f37863OoooO00 = zzjsVar;
        this.f37860Oooo0o = atomicReference;
        this.f37861Oooo0oO = str;
        this.f37862Oooo0oo = str2;
        this.f37859Oooo = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f37860Oooo0o) {
            try {
                try {
                    zzjs zzjsVar = this.f37863OoooO00;
                    zzee zzeeVar = zzjsVar.f16268OooO0Oo;
                    if (zzeeVar == null) {
                        zzjsVar.f37615OooO00o.zzay().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.f37861Oooo0oO, this.f37862Oooo0oo);
                        this.f37860Oooo0o.set(Collections.emptyList());
                        this.f37860Oooo0o.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.f37859Oooo);
                        this.f37860Oooo0o.set(zzeeVar.zzf(this.f37861Oooo0oO, this.f37862Oooo0oo, this.f37859Oooo));
                    } else {
                        this.f37860Oooo0o.set(zzeeVar.zzg(null, this.f37861Oooo0oO, this.f37862Oooo0oo));
                    }
                    this.f37863OoooO00.OooO();
                    atomicReference = this.f37860Oooo0o;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f37863OoooO00.f37615OooO00o.zzay().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.f37861Oooo0oO, e);
                    this.f37860Oooo0o.set(Collections.emptyList());
                    atomicReference = this.f37860Oooo0o;
                }
            } catch (Throwable th) {
                this.f37860Oooo0o.notify();
                throw th;
            }
        }
    }
}
