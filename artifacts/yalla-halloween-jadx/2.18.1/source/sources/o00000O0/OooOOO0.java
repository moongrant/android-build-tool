package o00000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function0<Float> f26931OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<Float> f26932OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f26933OooO0OO;

    public OooOOO0(@NotNull Function0<Float> value, @NotNull Function0<Float> maxValue, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.f26931OooO00o = value;
        this.f26932OooO0O0 = maxValue;
        this.f26933OooO0OO = z;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ScrollAxisRange(value=");
        sbOooO0o0.append(this.f26931OooO00o.invoke().floatValue());
        sbOooO0o0.append(", maxValue=");
        sbOooO0o0.append(this.f26932OooO0O0.invoke().floatValue());
        sbOooO0o0.append(", reverseScrolling=");
        return Oooo000.Oooo0.OooO0O0(sbOooO0o0, this.f26933OooO0OO, ')');
    }
}
