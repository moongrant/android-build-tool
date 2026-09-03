package p271o00ooooo;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zziz;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOOOo0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f40749OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzir f40750OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzir f40751OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f40752OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zziz f40753OooO0oo;

    public oOOOOo0O(zziz zzizVar, Bundle bundle, zzir zzirVar, zzir zzirVar2, long j) {
        this.f40753OooO0oo = zzizVar;
        this.f40749OooO0Oo = bundle;
        this.f40751OooO0o0 = zzirVar;
        this.f40750OooO0o = zzirVar2;
        this.f40752OooO0oO = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzir zzirVar = this.f40751OooO0o0;
        zzir zzirVar2 = this.f40750OooO0o;
        long j = this.f40752OooO0oO;
        Bundle bundle = this.f40749OooO0Oo;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zziz zzizVar = this.f40753OooO0oo;
        zzizVar.OooO0OO(zzirVar, zzirVar2, j, true, zzizVar.f40788OooO00o.zzv().OoooO0("screen_view", bundle, null, false));
    }
}
