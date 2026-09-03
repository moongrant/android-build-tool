package p334o0OO00o;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.measurement.internal.zzgz;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O extends zzch {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzgz f37283OooO00o;

    public o000O00O(zzgz zzgzVar) {
        this.f37283OooO00o = zzgzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.f37283OooO00o);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.f37283OooO00o.onEvent(str, str2, bundle, j);
    }
}
