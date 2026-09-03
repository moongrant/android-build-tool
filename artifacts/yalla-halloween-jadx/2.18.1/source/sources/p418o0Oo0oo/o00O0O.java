package p418o0Oo0oo;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OOo<o0OoOo0> f39722OooO00o = new o000OOo<>(new o0OoOo0[16]);

    public boolean OooO00o(@NotNull Map<o0OOO0o, o0Oo0oo> changes, @NotNull Oooo000 parentCoordinates, @NotNull Oooo000 internalPointerEvent, boolean z) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        o000OOo<o0OoOo0> o000ooo2 = this.f39722OooO00o;
        int i = o000ooo2.f3664Oooo0oo;
        if (i <= 0) {
            return false;
        }
        o0OoOo0[] o0oooo0Arr = o000ooo2.f3662Oooo0o;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = o0oooo0Arr[i2].OooO00o(changes, parentCoordinates, internalPointerEvent, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    public void OooO0O0(@NotNull Oooo000 internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        for (int i = this.f39722OooO00o.f3664Oooo0oo - 1; -1 < i; i--) {
            if (this.f39722OooO00o.f3662Oooo0o[i].f39754OooO0OO.OooO()) {
                this.f39722OooO00o.OooOOO0(i);
            }
        }
    }

    public final void OooO0OO() {
        int i = 0;
        while (true) {
            o000OOo<o0OoOo0> o000ooo2 = this.f39722OooO00o;
            if (i >= o000ooo2.f3664Oooo0oo) {
                return;
            }
            o0OoOo0 o0oooo1 = o000ooo2.f3662Oooo0o[i];
            if (o0oooo1.f39753OooO0O0.f39669Oooo0oO) {
                i++;
                o0oooo1.OooO0OO();
            } else {
                o000ooo2.OooOOO0(i);
                o0oooo1.OooO0Oo();
            }
        }
    }
}
