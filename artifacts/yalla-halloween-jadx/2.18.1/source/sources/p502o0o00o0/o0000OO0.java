package p502o0o00o0;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f41575OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f41576OooO0O0;

    public o0000OO0(int i, @NotNull String strUnit) {
        Intrinsics.checkNotNullParameter(strUnit, "strUnit");
        this.f41575OooO00o = i;
        this.f41576OooO0O0 = strUnit;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("PickerViewItem(position=");
        sbOooO0o0.append(this.f41575OooO00o);
        sbOooO0o0.append(", strUnit='");
        return OooO.OooO00o(sbOooO0o0, this.f41576OooO0O0, "')");
    }
}
