package p053o00000oO;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27110OooO00o;

    @NotNull
    public static String OooO00o(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "All";
        }
        if (i == 2) {
            return "Weight";
        }
        return i == 3 ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0000) && this.f27110OooO00o == ((o0000) obj).f27110OooO00o;
    }

    public final int hashCode() {
        return this.f27110OooO00o;
    }

    @NotNull
    public final String toString() {
        return OooO00o(this.f27110OooO00o);
    }
}
