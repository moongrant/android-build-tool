package p053o00000oO;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27135OooO00o;

    @NotNull
    public static String OooO00o(int i) {
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0000Ooo) && this.f27135OooO00o == ((o0000Ooo) obj).f27135OooO00o;
    }

    public final int hashCode() {
        return this.f27135OooO00o;
    }

    @NotNull
    public final String toString() {
        return OooO00o(this.f27135OooO00o);
    }
}
