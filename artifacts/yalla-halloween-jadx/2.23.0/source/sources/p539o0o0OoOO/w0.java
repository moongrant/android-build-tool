package p539o0o0OoOO;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class w0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f55735OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f55736OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f55737OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final v0 f55738OooO0Oo;

    public /* synthetic */ w0(int i, String str) {
        this(i, str, 0, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f55735OooO00o == w0Var.f55735OooO00o && Intrinsics.areEqual(this.f55736OooO0O0, w0Var.f55736OooO0O0) && this.f55737OooO0OO == w0Var.f55737OooO0OO && Intrinsics.areEqual(this.f55738OooO0Oo, w0Var.f55738OooO0Oo);
    }

    public final int hashCode() {
        int iOooO00o = (o0OO00O.OooO00o(this.f55736OooO0O0, this.f55735OooO00o * 31, 31) + this.f55737OooO0OO) * 31;
        v0 v0Var = this.f55738OooO0Oo;
        return iOooO00o + (v0Var == null ? 0 : v0Var.hashCode());
    }

    @NotNull
    public final String toString() {
        return "FacePanelIndicatorAndData(type=" + this.f55735OooO00o + ", img=" + this.f55736OooO0O0 + ", buyType=" + this.f55737OooO0OO + ", data=" + this.f55738OooO0Oo + ")";
    }

    public w0(int i, @NotNull String img, int i2, @Nullable v0 v0Var) {
        Intrinsics.checkNotNullParameter(img, "img");
        this.f55735OooO00o = i;
        this.f55736OooO0O0 = img;
        this.f55737OooO0OO = i2;
        this.f55738OooO0Oo = v0Var;
    }
}
