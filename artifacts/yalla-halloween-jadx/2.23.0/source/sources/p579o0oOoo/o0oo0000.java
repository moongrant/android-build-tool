package p579o0oOoo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o0oo0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f56520OooO00o = true;

    @JvmStatic
    public static final boolean OooO00o() {
        OooOOO0.OooO0OO("AppComplianceCheck", "legitimate = " + Intrinsics.areEqual(o00Ooo.OooO0O0(), "com.weieyu.yalla") + ", packageName = " + o00Ooo.OooO0O0());
        Lazy lazy = oo000o.f44310OooO0o;
        boolean zOooO0o = StringsKt.OooO0o((String) lazy.getValue(), "x86") ^ true;
        OooOOO0.OooO0OO("AppComplianceCheck", "supported = " + zOooO0o + ", BUILD_TYPE = release, CPUABI = " + ((String) lazy.getValue()));
        return zOooO0o && f56520OooO00o;
    }
}
