package p116o00O0O0o;

import android.os.Build;
import androidx.work.NetworkType;
import kotlin.jvm.internal.Intrinsics;
import o00O0O0O.OooO0O0;
import o00O0OO.o00Ooo;
import o00O0OO0.OooOO0O;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends OooOOO0<OooO0O0> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final String f36190OooO0o;

    static {
        String strOooO0o = o0Oo0oo.OooO0o("NetworkNotRoamingCtrlr");
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f36190OooO0o = strOooO0o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(@NotNull OooOO0O<OooO0O0> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // p116o00O0O0o.OooOOO0
    public final boolean OooO0O0(@NotNull o00Ooo workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f36224OooOO0.f36131OooO00o == NetworkType.NOT_ROAMING;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[ORIG_RETURN, RETURN] */
    @Override // p116o00O0O0o.OooOOO0
    public final boolean OooO0OO(OooO0O0 oooO0O0) {
        OooO0O0 value = oooO0O0;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT < 24) {
            o0Oo0oo.OooO0Oo().OooO00o(f36190OooO0o, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (value.f36177OooO00o) {
                return false;
            }
            return true;
        }
        if (value.f36177OooO00o && value.f36180OooO0Oo) {
            return false;
        }
        return true;
    }
}
