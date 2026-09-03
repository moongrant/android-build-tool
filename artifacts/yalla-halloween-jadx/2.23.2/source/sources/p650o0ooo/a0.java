package p650o0ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class a0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f58140OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f58141OooO0O0;

    public a0(int i, @NotNull String strUnit) {
        Intrinsics.checkNotNullParameter(strUnit, "strUnit");
        this.f58140OooO00o = i;
        this.f58141OooO0O0 = strUnit;
    }

    @NotNull
    public final String toString() {
        return "PickerViewItem(position=" + this.f58140OooO00o + ", strUnit='" + this.f58141OooO0O0 + "')";
    }
}
