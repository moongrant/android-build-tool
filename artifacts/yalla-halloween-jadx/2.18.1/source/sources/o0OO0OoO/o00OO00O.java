package o0OO0OoO;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzis;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO00O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ long f37681Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Bundle f37682Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzik f37683Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzik f37684Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzis f37685OoooO00;

    public o00OO00O(zzis zzisVar, Bundle bundle, zzik zzikVar, zzik zzikVar2, long j) {
        this.f37685OoooO00 = zzisVar;
        this.f37682Oooo0o = bundle;
        this.f37683Oooo0oO = zzikVar;
        this.f37684Oooo0oo = zzikVar2;
        this.f37681Oooo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzis zzisVar = this.f37685OoooO00;
        Bundle bundle = this.f37682Oooo0o;
        zzik zzikVar = this.f37683Oooo0oO;
        zzik zzikVar2 = this.f37684Oooo0oo;
        long j = this.f37681Oooo;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzisVar.OooO0OO(zzikVar, zzikVar2, j, true, zzisVar.f37615OooO00o.zzv().OoooO(null, "screen_view", bundle, null, false));
    }
}
