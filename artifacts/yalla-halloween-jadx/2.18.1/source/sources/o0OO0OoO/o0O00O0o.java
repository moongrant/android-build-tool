package o0OO0OoO;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.measurement.internal.zzjr;
import com.google.android.gms.measurement.internal.zzjs;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzjr f37750Oooo0o;

    public o0O00O0o(zzjr zzjrVar) {
        this.f37750Oooo0o = zzjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f37750Oooo0o.f16265OooO0OO;
        Context contextZzau = zzjsVar.f37615OooO00o.zzau();
        this.f37750Oooo0o.f16265OooO0OO.f37615OooO00o.zzaw();
        zzjs.OooOOO0(zzjsVar, new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
