package o0OO0OoO;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzlc;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO00 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f37696Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f37697Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37698Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzq f37699Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzjs f37700OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzcf f37701OoooO00;

    public o00OOO00(zzjs zzjsVar, String str, String str2, zzq zzqVar, boolean z, zzcf zzcfVar) {
        this.f37700OoooO0 = zzjsVar;
        this.f37697Oooo0o = str;
        this.f37698Oooo0oO = str2;
        this.f37699Oooo0oo = zzqVar;
        this.f37696Oooo = z;
        this.f37701OoooO00 = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            try {
                zzjs zzjsVar = this.f37700OoooO0;
                zzee zzeeVar = zzjsVar.f16268OooO0Oo;
                if (zzeeVar == null) {
                    zzjsVar.f37615OooO00o.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.f37697Oooo0o, this.f37698Oooo0oO);
                    this.f37700OoooO0.f37615OooO00o.zzv().zzR(this.f37701OoooO00, bundle2);
                    return;
                }
                Preconditions.checkNotNull(this.f37699Oooo0oo);
                List<zzlc> listZzh = zzeeVar.zzh(this.f37697Oooo0o, this.f37698Oooo0oO, this.f37696Oooo, this.f37699Oooo0oo);
                bundle = new Bundle();
                if (listZzh != null) {
                    for (zzlc zzlcVar : listZzh) {
                        String str = zzlcVar.zze;
                        if (str != null) {
                            bundle.putString(zzlcVar.zzb, str);
                        } else {
                            Long l = zzlcVar.zzd;
                            if (l != null) {
                                bundle.putLong(zzlcVar.zzb, l.longValue());
                            } else {
                                Double d = zzlcVar.zzg;
                                if (d != null) {
                                    bundle.putDouble(zzlcVar.zzb, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f37700OoooO0.OooO();
                    this.f37700OoooO0.f37615OooO00o.zzv().zzR(this.f37701OoooO00, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f37700OoooO0.f37615OooO00o.zzay().zzd().zzc("Failed to get user properties; remote exception", this.f37697Oooo0o, e);
                    this.f37700OoooO0.f37615OooO00o.zzv().zzR(this.f37701OoooO00, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.f37700OoooO0.f37615OooO00o.zzv().zzR(this.f37701OoooO00, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            this.f37700OoooO0.f37615OooO00o.zzv().zzR(this.f37701OoooO00, bundle2);
            throw th;
        }
    }
}
