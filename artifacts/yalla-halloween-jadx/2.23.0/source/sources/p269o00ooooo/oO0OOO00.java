package p269o00ooooo;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzik;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OOO00 implements O0OO00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static oO0OOO00 f41389OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f41390OooO00o;

    public oO0OOO00(zzik zzikVar) {
        this.f41390OooO00o = zzikVar;
    }

    @Override // p269o00ooooo.O0OO00
    public final void OooO00o(Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            ((zzik) this.f41390OooO00o).zzD(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        } else {
            ((zzik) this.f41390OooO00o).zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle, str);
        }
    }
}
