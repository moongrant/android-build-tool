package o0000O0;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27261OooO00o;

    public final boolean equals(Object obj) {
        return (obj instanceof OooO0o) && this.f27261OooO00o == ((OooO0o) obj).f27261OooO00o;
    }

    public final int hashCode() {
        return this.f27261OooO00o;
    }

    @NotNull
    public final String toString() {
        int i = this.f27261OooO00o;
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        return i == 6 ? "End" : "Invalid";
    }
}
