package o0OO0OoO;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000Oo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzcf f37738Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f37739Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37740Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzq f37741Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzjs f37742OoooO00;

    public o0O000Oo(zzjs zzjsVar, String str, String str2, zzq zzqVar, zzcf zzcfVar) {
        this.f37742OoooO00 = zzjsVar;
        this.f37739Oooo0o = str;
        this.f37740Oooo0oO = str2;
        this.f37741Oooo0oo = zzqVar;
        this.f37738Oooo = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjs zzjsVar = this.f37742OoooO00;
                zzee zzeeVar = zzjsVar.f16268OooO0Oo;
                if (zzeeVar == null) {
                    zzjsVar.f37615OooO00o.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.f37739Oooo0o, this.f37740Oooo0oO);
                    zzfyVar = this.f37742OoooO00.f37615OooO00o;
                } else {
                    Preconditions.checkNotNull(this.f37741Oooo0oo);
                    arrayList = zzlh.zzH(zzeeVar.zzf(this.f37739Oooo0o, this.f37740Oooo0oO, this.f37741Oooo0oo));
                    this.f37742OoooO00.OooO();
                    zzfyVar = this.f37742OoooO00.f37615OooO00o;
                }
            } catch (RemoteException e) {
                this.f37742OoooO00.f37615OooO00o.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.f37739Oooo0o, this.f37740Oooo0oO, e);
                zzfyVar = this.f37742OoooO00.f37615OooO00o;
            }
            zzlh zzlhVarZzv = zzfyVar.zzv();
        } finally {
            this.f37742OoooO00.f37615OooO00o.zzv().zzQ(this.f37738Oooo, arrayList);
        }
    }
}
