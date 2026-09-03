package p551o0oOOOoo;

import android.annotation.SuppressLint;
import androidx.camera.core.CameraSelector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CameraSelector f56010OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<o00O000o> f56011OooO0O0;

    public o0o0000(@NotNull CameraSelector camSelector, @NotNull ArrayList qualities) {
        Intrinsics.checkNotNullParameter(camSelector, "camSelector");
        Intrinsics.checkNotNullParameter(qualities, "qualities");
        this.f56010OooO00o = camSelector;
        this.f56011OooO0O0 = qualities;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0o0000)) {
            return false;
        }
        o0o0000 o0o0000Var = (o0o0000) obj;
        return Intrinsics.areEqual(this.f56010OooO00o, o0o0000Var.f56010OooO00o) && Intrinsics.areEqual(this.f56011OooO0O0, o0o0000Var.f56011OooO0O0);
    }

    public final int hashCode() {
        return this.f56011OooO0O0.hashCode() + (this.f56010OooO00o.hashCode() * 31);
    }

    @SuppressLint({"RestrictedApi"})
    @NotNull
    public final String toString() {
        return "0:font 1:back  CameraCapability(camSelector={" + this.f56010OooO00o.OooO0OO() + "}, qualities=" + this.f56011OooO0O0 + ")";
    }
}
