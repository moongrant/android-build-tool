package p269o00ooooo;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzlp;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo0o00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f41513OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oo000000 f41514OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Bundle f41515OooO0o0;

    public oOo0o00(oo000000 oo000000Var, String str, Bundle bundle) {
        this.f41514OooO0o = oo000000Var;
        this.f41513OooO0Oo = str;
        this.f41515OooO0o0 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        oo000000 oo000000Var = this.f41514OooO0o;
        zzlp zzlpVarZzv = oo000000Var.f41529OooO00o.zzv();
        Bundle bundle = this.f41515OooO0o0;
        zzlh zzlhVar = oo000000Var.f41529OooO00o;
        zzlhVar.OooO0o0((zzau) Preconditions.checkNotNull(zzlpVarZzv.OoooO0O("_err", bundle, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, zzlhVar.zzax().currentTimeMillis(), false)), this.f41513OooO0Oo);
    }
}
