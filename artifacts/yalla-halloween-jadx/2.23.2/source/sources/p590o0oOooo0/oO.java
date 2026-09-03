package p590o0oOooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p386o0OOooO.o000000;
import p386o0OOooO.oo0o0Oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f57153OooO00o = true;

    @JvmStatic
    public static final boolean OooO00o() {
        o0000O00.OooO0OO("AppComplianceCheck", "legitimate = " + Intrinsics.areEqual(oo0o0Oo.OooO0O0(), "com.weieyu.yalla") + ", packageName = " + oo0o0Oo.OooO0O0());
        Lazy lazy = o000000.f43489OooO0oo;
        boolean zContains$default = StringsKt__StringsKt.contains$default((String) lazy.getValue(), "x86", false, 2, (Object) null) ^ true;
        o0000O00.OooO0OO("AppComplianceCheck", "supported = " + zContains$default + ", BUILD_TYPE = release, CPUABI = " + ((String) lazy.getValue()));
        return zContains$default && f57153OooO00o;
    }
}
