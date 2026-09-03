package p587o0oOooOO;

import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class r {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f56939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f56940OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f56941OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final q f56942OooO0Oo;

    public /* synthetic */ r(int i, String str) {
        this(i, str, 0, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f56939OooO00o == rVar.f56939OooO00o && Intrinsics.areEqual(this.f56940OooO0O0, rVar.f56940OooO0O0) && this.f56941OooO0OO == rVar.f56941OooO0OO && Intrinsics.areEqual(this.f56942OooO0Oo, rVar.f56942OooO0Oo);
    }

    public final int hashCode() {
        int iOooO00o = (OooO0O0.OooO00o(this.f56940OooO0O0, this.f56939OooO00o * 31, 31) + this.f56941OooO0OO) * 31;
        q qVar = this.f56942OooO0Oo;
        return iOooO00o + (qVar == null ? 0 : qVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "FacePanelIndicatorAndData(type=" + this.f56939OooO00o + ", img=" + this.f56940OooO0O0 + ", buyType=" + this.f56941OooO0OO + ", data=" + this.f56942OooO0Oo + ")";
    }

    public r(int i, @NotNull String img, int i2, @Nullable q qVar) {
        Intrinsics.checkNotNullParameter(img, "img");
        this.f56939OooO00o = i;
        this.f56940OooO0O0 = img;
        this.f56941OooO0OO = i2;
        this.f56942OooO0Oo = qVar;
    }
}
