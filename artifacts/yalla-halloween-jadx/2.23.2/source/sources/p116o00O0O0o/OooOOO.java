package p116o00O0O0o;

import android.os.Build;
import androidx.work.NetworkType;
import kotlin.jvm.internal.Intrinsics;
import o00O0O0O.OooO0O0;
import o00O0OO.o00Ooo;
import o00O0OO0.OooOO0O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends OooOOO0<OooO0O0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(@NotNull OooOO0O<OooO0O0> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // p116o00O0O0o.OooOOO0
    public final boolean OooO0O0(@NotNull o00Ooo workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f36224OooOO0.f36131OooO00o == NetworkType.CONNECTED;
    }

    @Override // p116o00O0O0o.OooOOO0
    public final boolean OooO0OO(OooO0O0 oooO0O0) {
        OooO0O0 value = oooO0O0;
        Intrinsics.checkNotNullParameter(value, "value");
        return Build.VERSION.SDK_INT < 26 ? !value.f36177OooO00o : !(value.f36177OooO00o && value.f36178OooO0O0);
    }
}
