package p369o0OOo0o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f43163OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f43164OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f43165OooO0OO;

    public OooOOO0(@NotNull String fileName, @NotNull String faceTag) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(faceTag, "faceTag");
        this.f43163OooO00o = fileName;
        this.f43164OooO0O0 = faceTag;
        this.f43165OooO0OO = "";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return Intrinsics.areEqual(this.f43163OooO00o, oooOOO0.f43163OooO00o) && Intrinsics.areEqual(this.f43164OooO0O0, oooOOO0.f43164OooO0O0);
    }

    public final int hashCode() {
        return this.f43164OooO0O0.hashCode() + (this.f43163OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiFace(fileName=");
        sb.append(this.f43163OooO00o);
        sb.append(", faceTag=");
        return o0oOO.OooO0O0(sb, this.f43164OooO0O0, ")");
    }
}
