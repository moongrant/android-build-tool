package p269o00ooooo;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzjy f41453OooO0Oo;

    public oOO0O00O(zzjy zzjyVar) {
        this.f41453OooO0Oo = zzjyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjy zzjyVar = this.f41453OooO0Oo;
        zzjz zzjzVar = zzjyVar.f16061OooO0OO;
        Context contextZzaw = zzjzVar.f41276OooO00o.zzaw();
        zzjyVar.f16061OooO0OO.f41276OooO00o.zzay();
        zzjz.OooOO0O(zzjzVar, new ComponentName(contextZzaw, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
