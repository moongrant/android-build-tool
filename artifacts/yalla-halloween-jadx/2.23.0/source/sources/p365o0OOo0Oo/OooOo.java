package p365o0OOo0Oo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f43951OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f43952OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f43953OooO0OO;

    public OooOo(@NotNull String fileName, @NotNull String faceTag) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(faceTag, "faceTag");
        this.f43951OooO00o = fileName;
        this.f43952OooO0O0 = faceTag;
        this.f43953OooO0OO = "";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return Intrinsics.areEqual(this.f43951OooO00o, oooOo.f43951OooO00o) && Intrinsics.areEqual(this.f43952OooO0O0, oooOo.f43952OooO0O0);
    }

    public final int hashCode() {
        return this.f43952OooO0O0.hashCode() + (this.f43951OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiFace(fileName=");
        sb.append(this.f43951OooO00o);
        sb.append(", faceTag=");
        return o0O00o0.OooO0O0(sb, this.f43952OooO0O0, ")");
    }
}
