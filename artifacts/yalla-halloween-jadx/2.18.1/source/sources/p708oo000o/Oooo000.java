package p708oo000o;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 extends o00<OooOo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(@NotNull OooOo root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
    }

    @Override // p100o000oOoO.o00O000
    public final void OooO0O0(int i, Object obj) {
        OooOo instance = (OooOo) obj;
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p100o000oOoO.o00O000
    public final void OooO0o(int i, int i2) {
        OooOO0O((OooOo) this.f29326OooO0OO).OooO0o0(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    @Override // p100o000oOoO.o00O000
    public final void OooO0o0(int i, int i2, int i3) {
        OooOO0O OooOO0O2 = OooOO0O((OooOo) this.f29326OooO0OO);
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                OooOo oooOo = (OooOo) OooOO0O2.f53060OooO0OO.get(i);
                OooOO0O2.f53060OooO0OO.remove(i);
                OooOO0O2.f53060OooO0OO.add(i2, oooOo);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                OooOo oooOo2 = (OooOo) OooOO0O2.f53060OooO0OO.get(i);
                OooOO0O2.f53060OooO0OO.remove(i);
                OooOO0O2.f53060OooO0OO.add(i2 - 1, oooOo2);
                i4++;
            }
        }
        OooOO0O2.OooO0OO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    @Override // p100o000oOoO.o00O000
    public final void OooO0oo(int i, Object obj) {
        OooOo instance = (OooOo) obj;
        Intrinsics.checkNotNullParameter(instance, "instance");
        OooOO0O OooOO0O2 = OooOO0O((OooOo) this.f29326OooO0OO);
        Objects.requireNonNull(OooOO0O2);
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (i < OooOO0O2.f53060OooO0OO.size()) {
            OooOO0O2.f53060OooO0OO.set(i, instance);
        } else {
            OooOO0O2.f53060OooO0OO.add(instance);
        }
        instance.OooO0Oo(OooOO0O2.f53065OooO0oo);
        OooOO0O2.OooO0OO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    @Override // p100o000oOoO.o00
    public final void OooOO0() {
        OooOO0O OooOO0O2 = OooOO0O((OooOo) this.f29324OooO00o);
        OooOO0O2.OooO0o0(0, OooOO0O2.f53060OooO0OO.size());
    }

    public final OooOO0O OooOO0O(OooOo oooOo) {
        if (oooOo instanceof OooOO0O) {
            return (OooOO0O) oooOo;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }
}
