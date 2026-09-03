package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzir;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0oO000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f40640OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f40641OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40642OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f40643OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzgv f40644OooO0oo;

    public oO0oO000(zzgv zzgvVar, String str, String str2, String str3, long j) {
        this.f40644OooO0oo = zzgvVar;
        this.f40640OooO0Oo = str;
        this.f40642OooO0o0 = str2;
        this.f40641OooO0o = str3;
        this.f40643OooO0oO = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f40642OooO0o0;
        zzgv zzgvVar = this.f40644OooO0oo;
        String str2 = this.f40640OooO0Oo;
        if (str2 == null) {
            zzgvVar.f15545OooO0Oo.zzR(str, null);
        } else {
            zzgvVar.f15545OooO0Oo.zzR(str, new zzir(this.f40641OooO0o, str2, this.f40643OooO0oO));
        }
    }
}
