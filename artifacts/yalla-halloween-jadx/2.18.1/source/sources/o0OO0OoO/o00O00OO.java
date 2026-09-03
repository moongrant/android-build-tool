package o0OO0OoO;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzid;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO implements o0OO00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzid f37648OooO00o;

    public o00O00OO(zzid zzidVar) {
        this.f37648OooO00o = zzidVar;
    }

    @Override // o0OO0OoO.o0OO00OO
    public final void OooO00o(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f37648OooO00o.zzD(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        } else {
            this.f37648OooO00o.zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle, str);
        }
    }
}
