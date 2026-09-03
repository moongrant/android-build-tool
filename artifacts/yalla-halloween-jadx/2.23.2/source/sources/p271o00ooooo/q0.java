package p271o00ooooo;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzlp;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f40828OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ r0 f40829OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Bundle f40830OooO0o0;

    public q0(r0 r0Var, String str, Bundle bundle) {
        this.f40829OooO0o = r0Var;
        this.f40828OooO0Oo = str;
        this.f40830OooO0o0 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        r0 r0Var = this.f40829OooO0o;
        zzlp zzlpVarZzv = r0Var.f40833OooO00o.zzv();
        Bundle bundle = this.f40830OooO0o0;
        zzlh zzlhVar = r0Var.f40833OooO00o;
        zzlhVar.OooO0o0((zzau) Preconditions.checkNotNull(zzlpVarZzv.OoooO0O("_err", bundle, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, zzlhVar.zzax().currentTimeMillis(), false)), this.f40828OooO0Oo);
    }
}
