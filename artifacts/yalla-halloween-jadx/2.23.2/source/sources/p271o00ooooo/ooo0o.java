package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzgv;

/* JADX INFO: loaded from: classes3.dex */
public final class ooo0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzau f40807OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzgv f40808OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40809OooO0o0;

    public ooo0o(zzgv zzgvVar, zzau zzauVar, String str) {
        this.f40808OooO0o = zzgvVar;
        this.f40807OooO0Oo = zzauVar;
        this.f40809OooO0o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzgv zzgvVar = this.f40808OooO0o;
        zzgvVar.f15545OooO0Oo.OooO00o();
        zzgvVar.f15545OooO0Oo.OooO0o0(this.f40807OooO0Oo, this.f40809OooO0o0);
    }
}
