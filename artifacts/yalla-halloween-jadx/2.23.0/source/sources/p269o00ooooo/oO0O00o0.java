package p269o00ooooo;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zziz;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O00o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f41327OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzir f41328OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzir f41329OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f41330OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zziz f41331OooO0oo;

    public oO0O00o0(zziz zzizVar, Bundle bundle, zzir zzirVar, zzir zzirVar2, long j) {
        this.f41331OooO0oo = zzizVar;
        this.f41327OooO0Oo = bundle;
        this.f41329OooO0o0 = zzirVar;
        this.f41328OooO0o = zzirVar2;
        this.f41330OooO0oO = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzir zzirVar = this.f41329OooO0o0;
        zzir zzirVar2 = this.f41328OooO0o;
        long j = this.f41330OooO0oO;
        Bundle bundle = this.f41327OooO0Oo;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zziz zzizVar = this.f41331OooO0oo;
        zzizVar.OooO0OO(zzirVar, zzirVar2, j, true, zzizVar.f41276OooO00o.zzv().OoooO0("screen_view", bundle, null, false));
    }
}
