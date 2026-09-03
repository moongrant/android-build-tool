package p418o0Oo0oo;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Oooo000 f39655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O0O f39656OooO0O0;

    public OooOo(@NotNull Oooo000 rootCoordinates) {
        Intrinsics.checkNotNullParameter(rootCoordinates, "rootCoordinates");
        this.f39655OooO00o = rootCoordinates;
        this.f39656OooO0O0 = new o00O0O();
    }

    public final void OooO00o(long j, @NotNull List<? extends o000000> pointerInputFilters) {
        o0OoOo0 o0oooo1;
        Intrinsics.checkNotNullParameter(pointerInputFilters, "pointerInputFilters");
        o00O0O o00o0o2 = this.f39656OooO0O0;
        int size = pointerInputFilters.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            o000000 o000000Var = pointerInputFilters.get(i);
            if (z) {
                o000OOo<o0OoOo0> o000ooo2 = o00o0o2.f39722OooO00o;
                int i2 = o000ooo2.f3664Oooo0oo;
                if (i2 <= 0) {
                    o0oooo1 = null;
                    break;
                }
                o0OoOo0[] o0oooo0Arr = o000ooo2.f3662Oooo0o;
                int i3 = 0;
                while (true) {
                    o0oooo1 = o0oooo0Arr[i3];
                    if (Intrinsics.areEqual(o0oooo1.f39753OooO0O0, o000000Var)) {
                        break;
                    }
                    i3++;
                    if (i3 >= i2) {
                        o0oooo1 = null;
                        break;
                    }
                }
                o0OoOo0 o0oooo2 = o0oooo1;
                if (o0oooo2 != null) {
                    o0oooo2.f39759OooO0oo = true;
                    if (!o0oooo2.f39754OooO0OO.OooO0o(new o0OOO0o(j))) {
                        o0oooo2.f39754OooO0OO.OooO0O0(new o0OOO0o(j));
                    }
                    o00o0o2 = o0oooo2;
                } else {
                    z = false;
                    o0OoOo0 o0oooo3 = new o0OoOo0(o000000Var);
                    o0oooo3.f39754OooO0OO.OooO0O0(new o0OOO0o(j));
                    o00o0o2.f39722OooO00o.OooO0O0(o0oooo3);
                    o00o0o2 = o0oooo3;
                }
            } else {
                o0OoOo0 o0oooo4 = new o0OoOo0(o000000Var);
                o0oooo4.f39754OooO0OO.OooO0O0(new o0OOO0o(j));
                o00o0o2.f39722OooO00o.OooO0O0(o0oooo4);
                o00o0o2 = o0oooo4;
            }
        }
    }

    public final boolean OooO0O0(@NotNull Oooo000 internalPointerEvent, boolean z) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        if (!this.f39656OooO0O0.OooO00o(internalPointerEvent.f39665OooO00o, this.f39655OooO00o, internalPointerEvent, z)) {
            return false;
        }
        o00O0O o00o0o2 = this.f39656OooO0O0;
        Map<o0OOO0o, o0Oo0oo> changes = internalPointerEvent.f39665OooO00o;
        Oooo000 parentCoordinates = this.f39655OooO00o;
        Objects.requireNonNull(o00o0o2);
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        o000OOo<o0OoOo0> o000ooo2 = o00o0o2.f39722OooO00o;
        int i = o000ooo2.f3664Oooo0oo;
        if (i > 0) {
            o0OoOo0[] o0oooo0Arr = o000ooo2.f3662Oooo0o;
            int i2 = 0;
            z2 = false;
            do {
                z2 = o0oooo0Arr[i2].OooO0o(changes, parentCoordinates, internalPointerEvent, z) || z2;
                i2++;
            } while (i2 < i);
        } else {
            z2 = false;
        }
        o00O0O o00o0o3 = this.f39656OooO0O0;
        Objects.requireNonNull(o00o0o3);
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        o000OOo<o0OoOo0> o000ooo3 = o00o0o3.f39722OooO00o;
        int i3 = o000ooo3.f3664Oooo0oo;
        if (i3 > 0) {
            o0OoOo0[] o0oooo0Arr2 = o000ooo3.f3662Oooo0o;
            int i4 = 0;
            z3 = false;
            do {
                z3 = o0oooo0Arr2[i4].OooO0o0(internalPointerEvent) || z3;
                i4++;
            } while (i4 < i3);
        } else {
            z3 = false;
        }
        o00o0o3.OooO0O0(internalPointerEvent);
        return z3 || z2;
    }
}
