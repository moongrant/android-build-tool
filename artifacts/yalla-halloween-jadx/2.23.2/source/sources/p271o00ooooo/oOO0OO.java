package p271o00ooooo;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzik;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OO implements v0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f40716OooO00o;

    public oOO0OO(zzik zzikVar) {
        this.f40716OooO00o = zzikVar;
    }

    @Override // p271o00ooooo.v0
    public final void OooO00o(Bundle bundle, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        Object obj = this.f40716OooO00o;
        if (zIsEmpty) {
            ((zzik) obj).zzD(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        } else {
            ((zzik) obj).zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle, str);
        }
    }
}
