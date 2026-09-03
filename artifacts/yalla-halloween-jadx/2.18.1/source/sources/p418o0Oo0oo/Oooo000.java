package p418o0Oo0oo;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<o0OOO0o, o0Oo0oo> f39665OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo f39666OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f39667OooO0OO;

    public Oooo000(@NotNull Map<o0OOO0o, o0Oo0oo> changes, @NotNull oo0o0Oo pointerInputEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        this.f39665OooO00o = changes;
        this.f39666OooO0O0 = pointerInputEvent;
    }

    public final boolean OooO00o(long j) {
        o0O0O00 o0o0o00;
        List<o0O0O00> list = this.f39666OooO0O0.f39760OooO00o;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                o0o0o00 = null;
                break;
            }
            o0o0o00 = list.get(i);
            if (o0OOO0o.OooO00o(o0o0o00.f39728OooO00o, j)) {
                break;
            }
            i++;
        }
        o0O0O00 o0o0o01 = o0o0o00;
        if (o0o0o01 != null) {
            return o0o0o01.f39734OooO0oO;
        }
        return false;
    }
}
