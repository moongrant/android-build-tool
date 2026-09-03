package o0000O0;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27262OooO00o;

    public final boolean equals(Object obj) {
        return (obj instanceof OooOO0) && this.f27262OooO00o == ((OooOO0) obj).f27262OooO00o;
    }

    public final int hashCode() {
        return this.f27262OooO00o;
    }

    @NotNull
    public final String toString() {
        int i = this.f27262OooO00o;
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        return i == 5 ? "ContentOrRtl" : "Invalid";
    }
}
