package p054o00000oo;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o00O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27176OooO00o;

    @NotNull
    public static String OooO00o(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        return i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00O000o) && this.f27176OooO00o == ((o00O000o) obj).f27176OooO00o;
    }

    public final int hashCode() {
        return this.f27176OooO00o;
    }

    @NotNull
    public final String toString() {
        return OooO00o(this.f27176OooO00o);
    }
}
