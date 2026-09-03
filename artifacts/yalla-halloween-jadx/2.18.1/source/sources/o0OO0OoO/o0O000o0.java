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
public final class o0O000o0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzq f37743Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37744Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37745Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37746Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzjs f37747OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ boolean f37748OoooO00;

    public o0O000o0(zzjs zzjsVar, AtomicReference atomicReference, String str, String str2, zzq zzqVar, boolean z) {
        this.f37747OoooO0 = zzjsVar;
        this.f37744Oooo0o = atomicReference;
        this.f37745Oooo0oO = str;
        this.f37746Oooo0oo = str2;
        this.f37743Oooo = zzqVar;
        this.f37748OoooO00 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f37744Oooo0o) {
            try {
                try {
                    zzjs zzjsVar = this.f37747OoooO0;
                    zzee zzeeVar = zzjsVar.f16268OooO0Oo;
                    if (zzeeVar == null) {
                        zzjsVar.f37615OooO00o.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.f37745Oooo0oO, this.f37746Oooo0oo);
                        this.f37744Oooo0o.set(Collections.emptyList());
                        this.f37744Oooo0o.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.f37743Oooo);
                        this.f37744Oooo0o.set(zzeeVar.zzh(this.f37745Oooo0oO, this.f37746Oooo0oo, this.f37748OoooO00, this.f37743Oooo));
                    } else {
                        this.f37744Oooo0o.set(zzeeVar.zzi(null, this.f37745Oooo0oO, this.f37746Oooo0oo, this.f37748OoooO00));
                    }
                    this.f37747OoooO0.OooO();
                    atomicReference = this.f37744Oooo0o;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f37747OoooO0.f37615OooO00o.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.f37745Oooo0oO, e);
                    this.f37744Oooo0o.set(Collections.emptyList());
                    atomicReference = this.f37744Oooo0o;
                }
            } catch (Throwable th) {
                this.f37744Oooo0o.notify();
                throw th;
            }
        }
    }
}
