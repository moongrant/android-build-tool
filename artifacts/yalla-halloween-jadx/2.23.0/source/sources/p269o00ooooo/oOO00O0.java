package p269o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzlp;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f41439OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzq f41440OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41441OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzcf f41442OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzjz f41443OooO0oo;

    public oOO00O0(zzjz zzjzVar, String str, String str2, zzq zzqVar, zzcf zzcfVar) {
        this.f41443OooO0oo = zzjzVar;
        this.f41439OooO0Oo = str;
        this.f41441OooO0o0 = str2;
        this.f41440OooO0o = zzqVar;
        this.f41442OooO0oO = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd zzgdVar;
        zzq zzqVar = this.f41440OooO0o;
        String str = this.f41441OooO0o0;
        String str2 = this.f41439OooO0Oo;
        zzcf zzcfVar = this.f41442OooO0oO;
        zzjz zzjzVar = this.f41443OooO0oo;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzej zzejVar = zzjzVar.f16064OooO0Oo;
                if (zzejVar == null) {
                    zzjzVar.f41276OooO00o.zzaA().zzd().zzc("Failed to get conditional properties; not connected to service", str2, str);
                    zzgdVar = zzjzVar.f41276OooO00o;
                } else {
                    Preconditions.checkNotNull(zzqVar);
                    arrayList = zzlp.zzH(zzejVar.zzf(str2, str, zzqVar));
                    zzjzVar.OooO();
                    zzgdVar = zzjzVar.f41276OooO00o;
                }
            } catch (RemoteException e) {
                zzjzVar.f41276OooO00o.zzaA().zzd().zzd("Failed to get conditional properties; remote exception", str2, str, e);
                zzgdVar = zzjzVar.f41276OooO00o;
            }
            zzlp zzlpVarZzv = zzgdVar.zzv();
        } finally {
            zzjzVar.f41276OooO00o.zzv().zzR(zzcfVar, arrayList);
        }
    }
}
