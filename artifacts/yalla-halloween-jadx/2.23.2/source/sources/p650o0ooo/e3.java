package p650o0ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class e3 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f58199OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f58200OooO0O0;

    public e3(int i, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f58199OooO00o = i;
        this.f58200OooO0O0 = title;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return this.f58199OooO00o == e3Var.f58199OooO00o && Intrinsics.areEqual(this.f58200OooO0O0, e3Var.f58200OooO0O0);
    }

    public final int hashCode() {
        return this.f58200OooO0O0.hashCode() + (this.f58199OooO00o * 31);
    }

    @NotNull
    public final String toString() {
        return "ShareChannelInfo(icon=" + this.f58199OooO00o + ", title=" + this.f58200OooO0O0 + ")";
    }
}
