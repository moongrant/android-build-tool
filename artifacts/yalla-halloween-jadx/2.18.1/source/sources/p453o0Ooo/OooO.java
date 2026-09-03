package p453o0Ooo;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f40343OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f40344OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f40345OooO0OO;

    public OooO(@NotNull String fileName, @NotNull String faceTag) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(faceTag, "faceTag");
        this.f40343OooO00o = fileName;
        this.f40344OooO0O0 = faceTag;
        this.f40345OooO0OO = "";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return Intrinsics.areEqual(this.f40343OooO00o, oooO.f40343OooO00o) && Intrinsics.areEqual(this.f40344OooO0O0, oooO.f40344OooO0O0);
    }

    public final int hashCode() {
        return this.f40344OooO0O0.hashCode() + (this.f40343OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("EmojiFace(fileName=");
        sbOooO0o0.append(this.f40343OooO00o);
        sbOooO0o0.append(", faceTag=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.f40344OooO0O0, ')');
    }
}
