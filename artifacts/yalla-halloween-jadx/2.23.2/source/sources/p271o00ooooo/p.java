package p271o00ooooo;

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
public final class p implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f40815OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzq f40816OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40817OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzcf f40818OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzjz f40819OooO0oo;

    public p(zzjz zzjzVar, String str, String str2, zzq zzqVar, zzcf zzcfVar) {
        this.f40819OooO0oo = zzjzVar;
        this.f40815OooO0Oo = str;
        this.f40817OooO0o0 = str2;
        this.f40816OooO0o = zzqVar;
        this.f40818OooO0oO = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd zzgdVar;
        zzq zzqVar = this.f40816OooO0o;
        String str = this.f40817OooO0o0;
        String str2 = this.f40815OooO0Oo;
        zzcf zzcfVar = this.f40818OooO0oO;
        zzjz zzjzVar = this.f40819OooO0oo;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzej zzejVar = zzjzVar.f15588OooO0Oo;
                if (zzejVar == null) {
                    zzjzVar.f40788OooO00o.zzaA().zzd().zzc("Failed to get conditional properties; not connected to service", str2, str);
                    zzgdVar = zzjzVar.f40788OooO00o;
                } else {
                    Preconditions.checkNotNull(zzqVar);
                    arrayList = zzlp.zzH(zzejVar.zzf(str2, str, zzqVar));
                    zzjzVar.OooO();
                    zzgdVar = zzjzVar.f40788OooO00o;
                }
            } catch (RemoteException e) {
                zzjzVar.f40788OooO00o.zzaA().zzd().zzd("Failed to get conditional properties; remote exception", str2, str, e);
                zzgdVar = zzjzVar.f40788OooO00o;
            }
            zzlp zzlpVarZzv = zzgdVar.zzv();
        } finally {
            zzjzVar.f40788OooO00o.zzv().zzR(zzcfVar, arrayList);
        }
    }
}
