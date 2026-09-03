package o0OO0OoO;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzaw;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0oo00 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f37802Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Bundle f37803Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O f37804Oooo0oo;

    public o0O0oo00(o0O o0o, String str, Bundle bundle) {
        this.f37804Oooo0oo = o0o;
        this.f37802Oooo0o = str;
        this.f37803Oooo0oO = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37804Oooo0oo.f37723OooO00o.OooO0o((zzaw) Preconditions.checkNotNull(this.f37804Oooo0oo.f37723OooO00o.zzv().OoooOO0(this.f37802Oooo0o, "_err", this.f37803Oooo0oO, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, this.f37804Oooo0oo.f37723OooO00o.zzav().currentTimeMillis(), false)), this.f37802Oooo0o);
    }
}
