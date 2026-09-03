package p643o0ooOO0;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f48882OooO00o;

    public final boolean equals(Object obj) {
        return (obj instanceof oo00o) && this.f48882OooO00o == ((oo00o) obj).f48882OooO00o;
    }

    public final int hashCode() {
        return this.f48882OooO00o;
    }

    @NotNull
    public final String toString() {
        int i = this.f48882OooO00o;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
