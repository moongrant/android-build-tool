package p269o00ooooo;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzjz f41342OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f41343OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzq f41344OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41345OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f41346OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f41347OooO0oo;

    public oO0O0Oo0(zzjz zzjzVar, String str, String str2, zzq zzqVar, boolean z, zzcf zzcfVar) {
        this.f41342OooO = zzjzVar;
        this.f41343OooO0Oo = str;
        this.f41345OooO0o0 = str2;
        this.f41344OooO0o = zzqVar;
        this.f41346OooO0oO = z;
        this.f41347OooO0oo = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzq zzqVar = this.f41344OooO0o;
        String str = this.f41343OooO0Oo;
        zzcf zzcfVar = this.f41347OooO0oo;
        zzjz zzjzVar = this.f41342OooO;
        Bundle bundle = new Bundle();
        try {
            try {
                zzej zzejVar = zzjzVar.f16064OooO0Oo;
                String str2 = this.f41345OooO0o0;
                if (zzejVar == null) {
                    zzjzVar.f41276OooO00o.zzaA().zzd().zzc("Failed to get user properties; not connected to service", str, str2);
                    zzjzVar.f41276OooO00o.zzv().zzS(zzcfVar, bundle);
                    return;
                }
                Preconditions.checkNotNull(zzqVar);
                List<zzlk> listZzh = zzejVar.zzh(str, str2, this.f41346OooO0oO, zzqVar);
                Bundle bundle2 = new Bundle();
                if (listZzh != null) {
                    for (zzlk zzlkVar : listZzh) {
                        String str3 = zzlkVar.zze;
                        if (str3 != null) {
                            bundle2.putString(zzlkVar.zzb, str3);
                        } else {
                            Long l = zzlkVar.zzd;
                            if (l != null) {
                                bundle2.putLong(zzlkVar.zzb, l.longValue());
                            } else {
                                Double d = zzlkVar.zzg;
                                if (d != null) {
                                    bundle2.putDouble(zzlkVar.zzb, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    zzjzVar.OooO();
                    zzjzVar.f41276OooO00o.zzv().zzS(zzcfVar, bundle2);
                } catch (RemoteException e) {
                    e = e;
                    bundle = bundle2;
                    zzjzVar.f41276OooO00o.zzaA().zzd().zzc("Failed to get user properties; remote exception", str, e);
                    zzjzVar.f41276OooO00o.zzv().zzS(zzcfVar, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle = bundle2;
                    zzjzVar.f41276OooO00o.zzv().zzS(zzcfVar, bundle);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (RemoteException e2) {
            e = e2;
        }
    }
}
