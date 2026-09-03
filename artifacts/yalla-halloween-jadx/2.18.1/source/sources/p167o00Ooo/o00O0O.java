package p167o00Ooo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends OooO {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O() {
        super("Generic XYZ", OooO0o.f32563OooO0OO, 14);
        Intrinsics.checkNotNullParameter("Generic XYZ", "name");
        OooO0o.OooO00o oooO00o = OooO0o.f32561OooO00o;
        OooO0o.OooO00o oooO00o2 = OooO0o.f32561OooO00o;
    }

    @Override // p167o00Ooo.OooO
    @NotNull
    public final float[] OooO00o(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = OooO0o(v[0]);
        v[1] = OooO0o(v[1]);
        v[2] = OooO0o(v[2]);
        return v;
    }

    @Override // p167o00Ooo.OooO
    public final float OooO0O0(int i) {
        return 2.0f;
    }

    @Override // p167o00Ooo.OooO
    public final float OooO0OO(int i) {
        return -2.0f;
    }

    public final float OooO0o(float f) {
        return RangesKt.coerceIn(f, -2.0f, 2.0f);
    }

    @Override // p167o00Ooo.OooO
    @NotNull
    public final float[] OooO0o0(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = OooO0o(v[0]);
        v[1] = OooO0o(v[1]);
        v[2] = OooO0o(v[2]);
        return v;
    }
}
