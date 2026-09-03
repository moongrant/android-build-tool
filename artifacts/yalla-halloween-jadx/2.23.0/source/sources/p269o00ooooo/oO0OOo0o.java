package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzir;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OOo0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f41391OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f41392OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41393OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f41394OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzgv f41395OooO0oo;

    public oO0OOo0o(zzgv zzgvVar, String str, String str2, String str3, long j) {
        this.f41395OooO0oo = zzgvVar;
        this.f41391OooO0Oo = str;
        this.f41393OooO0o0 = str2;
        this.f41392OooO0o = str3;
        this.f41394OooO0oO = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f41393OooO0o0;
        zzgv zzgvVar = this.f41395OooO0oo;
        String str2 = this.f41391OooO0Oo;
        if (str2 == null) {
            zzgvVar.f16021OooO0Oo.zzR(str, null);
        } else {
            zzgvVar.f16021OooO0Oo.zzR(str, new zzir(this.f41392OooO0o, str2, this.f41394OooO0oO));
        }
    }
}
