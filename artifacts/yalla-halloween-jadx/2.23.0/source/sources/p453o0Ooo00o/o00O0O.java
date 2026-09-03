package p453o0Ooo00o;

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
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CameraSelector f46487OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<o00O000o> f46488OooO0O0;

    public o00O0O(@NotNull CameraSelector camSelector, @NotNull ArrayList qualities) {
        Intrinsics.checkNotNullParameter(camSelector, "camSelector");
        Intrinsics.checkNotNullParameter(qualities, "qualities");
        this.f46487OooO00o = camSelector;
        this.f46488OooO0O0 = qualities;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        return Intrinsics.areEqual(this.f46487OooO00o, o00o0o2.f46487OooO00o) && Intrinsics.areEqual(this.f46488OooO0O0, o00o0o2.f46488OooO0O0);
    }

    public final int hashCode() {
        return this.f46488OooO0O0.hashCode() + (this.f46487OooO00o.hashCode() * 31);
    }

    @SuppressLint({"RestrictedApi"})
    @NotNull
    public final String toString() {
        return "0:font 1:back  CameraCapability(camSelector={" + this.f46487OooO00o.OooO0OO() + "}, qualities=" + this.f46488OooO0O0 + ")";
    }
}
