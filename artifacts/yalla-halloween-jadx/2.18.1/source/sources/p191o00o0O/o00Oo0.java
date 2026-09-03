package p191o00o0O;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import o0000O0O.OooO;
import o0000O0O.OooO0o;
import o0000O0O.OooOO0;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.Oooo0;
import p145o00Oo0.o000;
import p145o00Oo0.o00000O;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o0000oo;
import p145o00Oo0.o000O0o;
import p145o00Oo0.o000Oo0;
import p145o00Oo0.o0O0O00;
import p145o00Oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements o0Oo0oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Oooo0 f33066Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final OooO00o f33067Oooo0o = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f33068Oooo0oO = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Oooo0 f33069Oooo0oo;

    @PublishedApi
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public OooO f33070OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public LayoutDirection f33071OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public o0O0O00 f33072OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f33073OooO0Oo;

        public OooO00o() {
            OooOO0 oooOO1 = oo000o.f33079OooO00o;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            o0O0O00 o0o0o00 = new o0O0O00();
            OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
            long j = OooOo00.f30417OooO0OO;
            this.f33070OooO00o = oooOO1;
            this.f33071OooO0O0 = layoutDirection;
            this.f33072OooO0OO = o0o0o00;
            this.f33073OooO0Oo = j;
        }

        public final void OooO00o(@NotNull o0O0O00 o0o0o00) {
            Intrinsics.checkNotNullParameter(o0o0o00, "<set-?>");
            this.f33072OooO0OO = o0o0o00;
        }

        public final void OooO0O0(@NotNull OooO oooO) {
            Intrinsics.checkNotNullParameter(oooO, "<set-?>");
            this.f33070OooO00o = oooO;
        }

        public final void OooO0OO(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.f33071OooO0O0 = layoutDirection;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f33070OooO00o, oooO00o.f33070OooO00o) && this.f33071OooO0O0 == oooO00o.f33071OooO0O0 && Intrinsics.areEqual(this.f33072OooO0OO, oooO00o.f33072OooO0OO) && OooOo00.OooO00o(this.f33073OooO0Oo, oooO00o.f33073OooO0Oo);
        }

        public final int hashCode() {
            return OooOo00.OooO0o0(this.f33073OooO0Oo) + ((this.f33072OooO0OO.hashCode() + ((this.f33071OooO0O0.hashCode() + (this.f33070OooO00o.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DrawParams(density=");
            sbOooO0o0.append(this.f33070OooO00o);
            sbOooO0o0.append(", layoutDirection=");
            sbOooO0o0.append(this.f33071OooO0O0);
            sbOooO0o0.append(", canvas=");
            sbOooO0o0.append(this.f33072OooO0OO);
            sbOooO0o0.append(", size=");
            sbOooO0o0.append((Object) OooOo00.OooO0oO(this.f33073OooO0Oo));
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
    }

    public static final class OooO0O0 implements o0ooOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o00Ooo f33074OooO00o = new o00Ooo(this);

        public OooO0O0() {
        }

        @Override // p191o00o0O.o0ooOOo
        public final long OooO0OO() {
            return o00Oo0.this.f33067Oooo0o.f33073OooO0Oo;
        }

        @Override // p191o00o0O.o0ooOOo
        @NotNull
        public final oo0o0Oo OooO0Oo() {
            return this.f33074OooO00o;
        }

        @Override // p191o00o0O.o0ooOOo
        @NotNull
        public final o0O0O00 OooO0o() {
            return o00Oo0.this.f33067Oooo0o.f33072OooO0OO;
        }

        @Override // p191o00o0O.o0ooOOo
        public final void OooO0o0(long j) {
            o00Oo0.this.f33067Oooo0o.f33073OooO0Oo = j;
        }
    }

    public static o000 OooOOO(o00Oo0 o00oo1, long j, o0OO00O o0oo00o2, float f, o00000O o00000o, int i) {
        o000 o000VarOooOooO = o00oo1.OooOooO(o0oo00o2);
        long jOooOoO = o00oo1.OooOoO(j, f);
        Oooo0 oooo0 = (Oooo0) o000VarOooOooO;
        if (!o00000O0.OooO0Oo(oooo0.OooO00o(), jOooOoO)) {
            oooo0.OooOO0(jOooOoO);
        }
        if (oooo0.f32053OooO0OO != null) {
            oooo0.OooO0o(null);
        }
        if (!Intrinsics.areEqual(oooo0.f32054OooO0Oo, o00000o)) {
            oooo0.OooOO0o(o00000o);
        }
        if (!(oooo0.f32052OooO0O0 == i)) {
            oooo0.OooO0OO(i);
        }
        if (!(oooo0.OooO() == 1)) {
            oooo0.OooO0oo(1);
        }
        return o000VarOooOooO;
    }

    public static /* synthetic */ o000 OooOo0o(o00Oo0 o00oo1, o0Oo0oo o0oo0oo2, o0OO00O o0oo00o2, float f, o00000O o00000o, int i) {
        return o00oo1.OooOOoo(o0oo0oo2, o0oo00o2, f, o00000o, i, 1);
    }

    @Override // p191o00o0O.o0Oo0oo
    public final long OooO0OO() {
        int i = o0OOO0o.f33077OooO00o;
        return ((OooO0O0) Ooooo0o()).OooO0OO();
    }

    @Override // o0000O0O.OooO
    public final float OooO0o0(int i) {
        return i / getDensity();
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void OooO0oO(@NotNull o0Oo0oo brush, long j, long j2, long j3, float f, @NotNull o0OO00O style, @Nullable o00000O o00000o, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooOO0o(o00O0O.OooO.OooO0OO(j), o00O0O.OooO.OooO0Oo(j), o00O0O.OooO.OooO0OO(j) + OooOo00.OooO0Oo(j2), o00O0O.OooO.OooO0Oo(j) + OooOo00.OooO0O0(j2), o00O0O.OooO00o.OooO0O0(j3), o00O0O.OooO00o.OooO0OO(j3), OooOo0o(this, brush, style, f, o00000o, i));
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void OooOO0O(long j, long j2, long j3, float f, @NotNull o0OO00O style, @Nullable o00000O o00000o, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooO0o(o00O0O.OooO.OooO0OO(j2), o00O0O.OooO.OooO0Oo(j2), OooOo00.OooO0Oo(j3) + o00O0O.OooO.OooO0OO(j2), OooOo00.OooO0O0(j3) + o00O0O.OooO.OooO0Oo(j2), OooOOO(this, j, style, f, o00000o, i));
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void OooOOOO(@NotNull o0000oo image, long j, long j2, long j3, long j4, float f, @NotNull o0OO00O style, @Nullable o00000O o00000o, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooOO0O(image, j, j2, j3, j4, OooOOoo(null, style, f, o00000o, i, i2));
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void OooOOo(long j, long j2, long j3, long j4, @NotNull o0OO00O style, float f, @Nullable o00000O o00000o, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooOO0o(o00O0O.OooO.OooO0OO(j2), o00O0O.OooO.OooO0Oo(j2), OooOo00.OooO0Oo(j3) + o00O0O.OooO.OooO0OO(j2), OooOo00.OooO0O0(j3) + o00O0O.OooO.OooO0Oo(j2), o00O0O.OooO00o.OooO0O0(j4), o00O0O.OooO00o.OooO0OO(j4), OooOOO(this, j, style, f, o00000o, i));
    }

    public final o000 OooOOoo(o0Oo0oo o0oo0oo2, o0OO00O o0oo00o2, float f, o00000O o00000o, int i, int i2) {
        o000 o000VarOooOooO = OooOooO(o0oo00o2);
        if (o0oo0oo2 != null) {
            o0oo0oo2.OooO00o(OooO0OO(), o000VarOooOooO, f);
        } else {
            if (!(o000VarOooOooO.OooOOOO() == f)) {
                o000VarOooOooO.OooO0O0(f);
            }
        }
        if (!Intrinsics.areEqual(o000VarOooOooO.OooO0Oo(), o00000o)) {
            o000VarOooOooO.OooOO0o(o00000o);
        }
        if (!(o000VarOooOooO.OooOO0O() == i)) {
            o000VarOooOooO.OooO0OO(i);
        }
        if (!(o000VarOooOooO.OooO() == i2)) {
            o000VarOooOooO.OooO0oo(i2);
        }
        return o000VarOooOooO;
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void OooOo(long j, long j2, long j3, float f, int i, @Nullable o000Oo0 o000oo1, float f2, @Nullable o00000O o00000o, int i2) {
        o0O0O00 o0o0o00 = this.f33067Oooo0o.f33072OooO0OO;
        o000 o000VarOooOoo = OooOoo();
        long jOooOoO = OooOoO(j, f2);
        Oooo0 oooo0 = (Oooo0) o000VarOooOoo;
        if (!o00000O0.OooO0Oo(oooo0.OooO00o(), jOooOoO)) {
            oooo0.OooOO0(jOooOoO);
        }
        if (oooo0.f32053OooO0OO != null) {
            oooo0.OooO0o(null);
        }
        if (!Intrinsics.areEqual(oooo0.f32054OooO0Oo, o00000o)) {
            oooo0.OooOO0o(o00000o);
        }
        if (!(oooo0.f32052OooO0O0 == i2)) {
            oooo0.OooO0OO(i2);
        }
        if (!(oooo0.OooOOo0() == f)) {
            oooo0.OooOo0O(f);
        }
        if (!(oooo0.OooOOOo() == 4.0f)) {
            oooo0.OooOo0(4.0f);
        }
        if (!(oooo0.OooOOO0() == i)) {
            oooo0.OooOOoo(i);
        }
        if (!(oooo0.OooOOO() == 0)) {
            oooo0.OooOo00(0);
        }
        if (!Intrinsics.areEqual(oooo0.f32055OooO0o0, o000oo1)) {
            oooo0.OooOOo(o000oo1);
        }
        if (!(oooo0.OooO() == 1)) {
            oooo0.OooO0oo(1);
        }
        o0o0o00.OooO(j2, j3, o000VarOooOoo);
    }

    public final long OooOoO(long j, float f) {
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? o00000O0.OooO0OO(j, o00000O0.OooO0o0(j) * f) : j;
    }

    @Override // o0000O0O.OooO
    public final long OooOoOO(float f) {
        return o0000O0O.o00Oo0.OooO0O0(f / OoooOOo());
    }

    public final o000 OooOoo() {
        Oooo0 oooo0 = this.f33066Oooo;
        if (oooo0 != null) {
            return oooo0;
        }
        Oooo0 oooo1 = new Oooo0();
        oooo1.OooOo0o(1);
        this.f33066Oooo = oooo1;
        return oooo1;
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ long OooOoo0(long j) {
        return OooO0o.OooO0O0(this, j);
    }

    public final o000 OooOooO(o0OO00O o0oo00o2) {
        if (Intrinsics.areEqual(o0oo00o2, o000OOo.f33065OooO00o)) {
            Oooo0 oooo0 = this.f33069Oooo0oo;
            if (oooo0 != null) {
                return oooo0;
            }
            Oooo0 oooo1 = new Oooo0();
            oooo1.OooOo0o(0);
            this.f33069Oooo0oo = oooo1;
            return oooo1;
        }
        if (!(o0oo00o2 instanceof o000000)) {
            throw new NoWhenBranchMatchedException();
        }
        o000 o000VarOooOoo = OooOoo();
        Oooo0 oooo2 = (Oooo0) o000VarOooOoo;
        float fOooOOo0 = oooo2.OooOOo0();
        o000000 o000000Var = (o000000) o0oo00o2;
        float f = o000000Var.f33060OooO00o;
        if (!(fOooOOo0 == f)) {
            oooo2.OooOo0O(f);
        }
        int iOooOOO0 = oooo2.OooOOO0();
        int i = o000000Var.f33062OooO0OO;
        if (!(iOooOOO0 == i)) {
            oooo2.OooOOoo(i);
        }
        float fOooOOOo = oooo2.OooOOOo();
        float f2 = o000000Var.f33061OooO0O0;
        if (!(fOooOOOo == f2)) {
            oooo2.OooOo0(f2);
        }
        int iOooOOO = oooo2.OooOOO();
        int i2 = o000000Var.f33063OooO0Oo;
        if (!(iOooOOO == i2)) {
            oooo2.OooOo00(i2);
        }
        if (!Intrinsics.areEqual(oooo2.f32055OooO0o0, o000000Var.f33064OooO0o0)) {
            oooo2.OooOOo(o000000Var.f33064OooO0o0);
        }
        return o000VarOooOoo;
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void Oooo0(@NotNull o0000oo image, long j, float f, @NotNull o0OO00O style, @Nullable o00000O o00000o, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooOOo(image, j, OooOo0o(this, null, style, f, o00000o, i));
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void Oooo0O0(@NotNull o000O0o path, @NotNull o0Oo0oo brush, float f, @NotNull o0OO00O style, @Nullable o00000O o00000o, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooOOOO(path, OooOo0o(this, brush, style, f, o00000o, i));
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void Oooo0oO(@NotNull o000O0o path, long j, float f, @NotNull o0OO00O style, @Nullable o00000O o00000o, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooOOOO(path, OooOOO(this, j, style, f, o00000o, i));
    }

    @Override // o0000O0O.OooO
    public final float OoooOO0(float f) {
        return f / getDensity();
    }

    @Override // o0000O0O.OooO
    public final float OoooOOo() {
        return this.f33067Oooo0o.f33070OooO00o.OoooOOo();
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void OoooOo0(long j, float f, float f2, long j2, long j3, float f3, @NotNull o0OO00O style, @Nullable o00000O o00000o, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooOo0(o00O0O.OooO.OooO0OO(j2), o00O0O.OooO.OooO0Oo(j2), OooOo00.OooO0Oo(j3) + o00O0O.OooO.OooO0OO(j2), OooOo00.OooO0O0(j3) + o00O0O.OooO.OooO0Oo(j2), f, f2, OooOOO(this, j, style, f3, o00000o, i));
    }

    @Override // o0000O0O.OooO
    public final float OoooOoo(float f) {
        return getDensity() * f;
    }

    @Override // p191o00o0O.o0Oo0oo
    @NotNull
    public final o0ooOOo Ooooo0o() {
        return this.f33068Oooo0oO;
    }

    @Override // o0000O0O.OooO
    public final int OooooOO(long j) {
        return MathKt.roundToInt(oo000o(j));
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ int OoooooO(float f) {
        return OooO0o.OooO00o(this, f);
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f33067Oooo0o.f33070OooO00o.getDensity();
    }

    @Override // p191o00o0O.o0Oo0oo
    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.f33067Oooo0o.f33071OooO0O0;
    }

    @Override // p191o00o0O.o0Oo0oo
    public final long o00Oo0() {
        int i = o0OOO0o.f33077OooO00o;
        return OooOo.OooO0O0(((OooO0O0) Ooooo0o()).OooO0OO());
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void o00o0O(@NotNull o0Oo0oo brush, long j, long j2, float f, @NotNull o0OO00O style, @Nullable o00000O o00000o, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooO0o(o00O0O.OooO.OooO0OO(j), o00O0O.OooO.OooO0Oo(j), OooOo00.OooO0Oo(j2) + o00O0O.OooO.OooO0OO(j), OooOo00.OooO0O0(j2) + o00O0O.OooO.OooO0Oo(j), OooOo0o(this, brush, style, f, o00000o, i));
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void o00oO0O(long j, float f, long j2, float f2, @NotNull o0OO00O style, @Nullable o00000O o00000o, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f33067Oooo0o.f33072OooO0OO.OooOOO(j2, f, OooOOO(this, j, style, f2, o00000o, i));
    }

    @Override // p191o00o0O.o0Oo0oo
    public final void o00oO0o(@NotNull o0Oo0oo brush, long j, long j2, float f, int i, @Nullable o000Oo0 o000oo1, float f2, @Nullable o00000O o00000o, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        o0O0O00 o0o0o00 = this.f33067Oooo0o.f33072OooO0OO;
        o000 o000VarOooOoo = OooOoo();
        if (brush != null) {
            brush.OooO00o(OooO0OO(), o000VarOooOoo, f2);
        } else {
            Oooo0 oooo0 = (Oooo0) o000VarOooOoo;
            if (!(oooo0.OooOOOO() == f2)) {
                oooo0.OooO0O0(f2);
            }
        }
        Oooo0 oooo1 = (Oooo0) o000VarOooOoo;
        if (!Intrinsics.areEqual(oooo1.f32054OooO0Oo, o00000o)) {
            oooo1.OooOO0o(o00000o);
        }
        if (!(oooo1.f32052OooO0O0 == i2)) {
            oooo1.OooO0OO(i2);
        }
        if (!(oooo1.OooOOo0() == f)) {
            oooo1.OooOo0O(f);
        }
        if (!(oooo1.OooOOOo() == 4.0f)) {
            oooo1.OooOo0(4.0f);
        }
        if (!(oooo1.OooOOO0() == i)) {
            oooo1.OooOOoo(i);
        }
        if (!(oooo1.OooOOO() == 0)) {
            oooo1.OooOo00(0);
        }
        if (!Intrinsics.areEqual(oooo1.f32055OooO0o0, o000oo1)) {
            oooo1.OooOOo(o000oo1);
        }
        if (!(oooo1.OooO() == 1)) {
            oooo1.OooO0oo(1);
        }
        o0o0o00.OooO(j, j2, o000VarOooOoo);
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ long o00ooo(long j) {
        return OooO0o.OooO0Oo(this, j);
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ float oo000o(long j) {
        return OooO0o.OooO0OO(this, j);
    }
}
