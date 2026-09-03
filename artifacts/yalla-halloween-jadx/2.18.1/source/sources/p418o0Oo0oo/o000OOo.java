package p418o0Oo0oo;

import androidx.compose.ui.node.LayoutNode;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import o000000.OooOOO0;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LayoutNode f39716OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo f39717OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OO00O f39718OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOOO0<o000000> f39719OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f39720OooO0o0;

    public o000OOo(@NotNull LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f39716OooO00o = root;
        this.f39717OooO0O0 = new OooOo(root.f6165o00Ooo);
        this.f39718OooO0OO = new o0OO00O();
        this.f39719OooO0Oo = new OooOOO0<>();
    }

    public final int OooO00o(@NotNull oo0o0Oo pointerEvent, @NotNull o0000oo positionCalculator, boolean z) {
        boolean z2;
        o0Oo0oo o0oo0oo2;
        long jOooO0oo;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        if (this.f39720OooO0o0) {
            return o0000.OooO00o(false, false);
        }
        boolean z3 = true;
        try {
            this.f39720OooO0o0 = true;
            Oooo000 oooo000OooO00o = this.f39718OooO0OO.OooO00o(pointerEvent, positionCalculator);
            Collection<o0Oo0oo> collectionValues = oooo000OooO00o.f39665OooO00o.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    o0Oo0oo o0oo0oo3 = (o0Oo0oo) it.next();
                    if (o0oo0oo3.f39745OooO0Oo || o0oo0oo3.f39748OooO0oO) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            boolean z4 = !z2;
            for (o0Oo0oo o0oo0oo4 : oooo000OooO00o.f39665OooO00o.values()) {
                if (z4 || o00Ooo.OooO0O0(o0oo0oo4)) {
                    boolean z5 = o0oo0oo4.f39749OooO0oo == 1;
                    LayoutNode layoutNode = this.f39716OooO00o;
                    long j = o0oo0oo4.f39744OooO0OO;
                    OooOOO0<o000000> oooOOO0 = this.f39719OooO0Oo;
                    LayoutNode.OooOO0 oooOO1 = LayoutNode.f6131o000000o;
                    layoutNode.OooOo0O(j, oooOOO0, z5, true);
                    if (!this.f39719OooO0Oo.isEmpty()) {
                        this.f39717OooO0O0.OooO00o(o0oo0oo4.f39742OooO00o, this.f39719OooO0Oo);
                        this.f39719OooO0Oo.clear();
                    }
                }
            }
            this.f39717OooO0O0.f39656OooO0O0.OooO0OO();
            boolean zOooO0O0 = this.f39717OooO0O0.OooO0O0(oooo000OooO00o, z);
            if (!oooo000OooO00o.f39667OooO0OO) {
                Collection<o0Oo0oo> collectionValues2 = oooo000OooO00o.f39665OooO00o.values();
                if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                    Iterator<T> it2 = collectionValues2.iterator();
                    do {
                        if (it2.hasNext()) {
                            o0oo0oo2 = (o0Oo0oo) it2.next();
                            Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
                            jOooO0oo = o00Ooo.OooO0oo(o0oo0oo2, true);
                            OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
                        }
                    } while (!((OooO.OooO00o(jOooO0oo, OooO.f30392OooO0OO) ^ true) && o0oo0oo2.OooO0OO()));
                }
                z3 = false;
                break;
            }
            z3 = false;
            break;
            return o0000.OooO00o(zOooO0O0, z3);
        } finally {
            this.f39720OooO0o0 = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<o0Oo0oo.o0OOO0o, o0Oo0oo.o0OO00O$OooO00o>] */
    public final void OooO0O0() {
        this.f39718OooO0OO.f39736OooO00o.clear();
        OooOo oooOo = this.f39717OooO0O0;
        p036OoooOOO.o000OOo<o0OoOo0> o000ooo2 = oooOo.f39656OooO0O0.f39722OooO00o;
        int i = o000ooo2.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            o0OoOo0[] o0oooo0Arr = o000ooo2.f3662Oooo0o;
            do {
                o0oooo0Arr[i2].OooO0Oo();
                i2++;
            } while (i2 < i);
        }
        oooOo.f39656OooO0O0.f39722OooO00o.OooO0o0();
    }
}
