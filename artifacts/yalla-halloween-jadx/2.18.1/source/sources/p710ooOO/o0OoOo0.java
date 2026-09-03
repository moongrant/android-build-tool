package p710ooOO;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f53495OooO00o;

    public final boolean equals(Object obj) {
        return (obj instanceof o0OoOo0) && this.f53495OooO00o == ((o0OoOo0) obj).f53495OooO00o;
    }

    public final int hashCode() {
        return this.f53495OooO00o;
    }

    @NotNull
    public final String toString() {
        int i = this.f53495OooO00o;
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "In";
        }
        return i == 8 ? "Out" : "Invalid FocusDirection";
    }
}
