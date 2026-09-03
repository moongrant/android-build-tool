package p111o000oooO;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f35923OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0O0ooO f35924OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0ooO f35925OooO0O0;

    static {
        o0O0ooO.OooO0O0 oooO0O0 = o0O0ooO.OooO0O0.f35938OooO00o;
        f35923OooO0OO = new o00O00(oooO0O0, oooO0O0);
    }

    public o00O00(@NotNull o0O0ooO o0o0ooo, @NotNull o0O0ooO o0o0ooo2) {
        this.f35924OooO00o = o0o0ooo;
        this.f35925OooO0O0 = o0o0ooo2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O00)) {
            return false;
        }
        o00O00 o00o01 = (o00O00) obj;
        return Intrinsics.areEqual(this.f35924OooO00o, o00o01.f35924OooO00o) && Intrinsics.areEqual(this.f35925OooO0O0, o00o01.f35925OooO0O0);
    }

    public final int hashCode() {
        return this.f35925OooO0O0.hashCode() + (this.f35924OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Size(width=" + this.f35924OooO00o + ", height=" + this.f35925OooO0O0 + ')';
    }
}
