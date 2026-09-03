package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzgv;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OoOO0 implements Callable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzgv f41405OooO00o;

    public oO0OoOO0(zzgv zzgvVar, zzau zzauVar, String str) {
        this.f41405OooO00o = zzgvVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        zzgv zzgvVar = this.f41405OooO00o;
        zzgvVar.f16021OooO0Oo.OooO00o();
        zzgvVar.f16021OooO0Oo.zzr().zzg();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
