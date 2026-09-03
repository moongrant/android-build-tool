package p519o0o0O0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class x {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f53202OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f53203OooO0O0;

    public x(int i, @NotNull String strUnit) {
        Intrinsics.checkNotNullParameter(strUnit, "strUnit");
        this.f53202OooO00o = i;
        this.f53203OooO0O0 = strUnit;
    }

    @NotNull
    public final String toString() {
        return "PickerViewItem(position=" + this.f53202OooO00o + ", strUnit='" + this.f53203OooO0O0 + "')";
    }
}
