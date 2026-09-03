package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f37873Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzcf f37874Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzaw f37875Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37876Oooo0oo;

    public o0oOO(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, zzaw zzawVar, String str) {
        this.f37873Oooo = appMeasurementDynamiteService;
        this.f37874Oooo0o = zzcfVar;
        this.f37875Oooo0oO = zzawVar;
        this.f37876Oooo0oo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37873Oooo.f16073OooO00o.zzt().zzB(this.f37874Oooo0o, this.f37875Oooo0oO, this.f37876Oooo0oo);
    }
}
