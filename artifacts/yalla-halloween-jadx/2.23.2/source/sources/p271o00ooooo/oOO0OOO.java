package p271o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f40719OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f40720OooO0o0;

    public oOO0OOO(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f40720OooO0o0 = appMeasurementDynamiteService;
        this.f40719OooO0Oo = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40720OooO0o0.f15394OooO0Oo.zzt().zzt(this.f40719OooO0Oo);
    }
}
