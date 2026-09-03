package p271o00ooooo;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzjy f40845OooO0Oo;

    public u(zzjy zzjyVar) {
        this.f40845OooO0Oo = zzjyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjy zzjyVar = this.f40845OooO0Oo;
        zzjz zzjzVar = zzjyVar.f15585OooO0OO;
        Context contextZzaw = zzjzVar.f40788OooO00o.zzaw();
        zzjyVar.f15585OooO0OO.f40788OooO00o.zzay();
        zzjz.OooOO0O(zzjzVar, new ComponentName(contextZzaw, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
