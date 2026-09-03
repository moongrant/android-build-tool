package p708oo000o;

import OooO00o.OooO00o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o0000O;
import p145o00Oo0.o000O0o;
import p145o00Oo0.o00Ooo;
import p145o00Oo0.o0OoOo0;
import p191o00o0O.o0Oo0oo;
import p191o00o0O.o0ooOOo;
import p191o00o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends OooOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public float[] f53059OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0OoOo0 f53062OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooOo00 f53064OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f53065OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f53066OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f53067OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f53068OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f53071OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f53072OooOOOo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<OooOo> f53060OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public List<? extends OooOOOO> f53061OooO0Oo = o00Oo0.f53217OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f53063OooO0o0 = true;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public String f53058OooO = "";

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f53070OooOOO0 = 1.0f;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f53069OooOOO = 1.0f;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f53073OooOOo0 = true;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p708oo000o.OooOo
    public final void OooO00o(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        if (this.f53073OooOOo0) {
            float[] fArrOooO00o = this.f53059OooO0O0;
            if (fArrOooO00o == null) {
                fArrOooO00o = o0000O.OooO00o();
                this.f53059OooO0O0 = fArrOooO00o;
            } else {
                o0000O.OooO0Oo(fArrOooO00o);
            }
            o0000O.OooO0o0(fArrOooO00o, this.f53067OooOO0O + this.f53071OooOOOO, this.f53068OooOO0o + this.f53072OooOOOo);
            double d = (((double) this.f53066OooOO0) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            float f = fArrOooO00o[0];
            float f2 = fArrOooO00o[4];
            float f3 = (fSin * f2) + (fCos * f);
            float f4 = -fSin;
            float f5 = (f2 * fCos) + (f * f4);
            float f6 = fArrOooO00o[1];
            float f7 = fArrOooO00o[5];
            float f8 = (fSin * f7) + (fCos * f6);
            float f9 = fArrOooO00o[2];
            float f10 = fArrOooO00o[6];
            float f11 = (fSin * f10) + (fCos * f9);
            float f12 = fArrOooO00o[3];
            float f13 = fArrOooO00o[7];
            fArrOooO00o[0] = f3;
            fArrOooO00o[1] = f8;
            fArrOooO00o[2] = f11;
            fArrOooO00o[3] = (fSin * f13) + (fCos * f12);
            fArrOooO00o[4] = f5;
            fArrOooO00o[5] = (f7 * fCos) + (f6 * f4);
            fArrOooO00o[6] = (f10 * fCos) + (f9 * f4);
            fArrOooO00o[7] = (fCos * f13) + (f4 * f12);
            float f14 = this.f53070OooOOO0;
            float f15 = this.f53069OooOOO;
            fArrOooO00o[0] = fArrOooO00o[0] * f14;
            fArrOooO00o[1] = fArrOooO00o[1] * f14;
            fArrOooO00o[2] = fArrOooO00o[2] * f14;
            fArrOooO00o[3] = fArrOooO00o[3] * f14;
            fArrOooO00o[4] = fArrOooO00o[4] * f15;
            fArrOooO00o[5] = fArrOooO00o[5] * f15;
            fArrOooO00o[6] = fArrOooO00o[6] * f15;
            fArrOooO00o[7] = fArrOooO00o[7] * f15;
            fArrOooO00o[8] = fArrOooO00o[8] * 1.0f;
            fArrOooO00o[9] = fArrOooO00o[9] * 1.0f;
            fArrOooO00o[10] = fArrOooO00o[10] * 1.0f;
            fArrOooO00o[11] = fArrOooO00o[11] * 1.0f;
            o0000O.OooO0o0(fArrOooO00o, -this.f53067OooOO0O, -this.f53068OooOO0o);
            this.f53073OooOOo0 = false;
        }
        if (this.f53063OooO0o0) {
            if (!this.f53061OooO0Oo.isEmpty()) {
                OooOo00 oooOo00 = this.f53064OooO0oO;
                if (oooOo00 == null) {
                    oooOo00 = new OooOo00();
                    this.f53064OooO0oO = oooOo00;
                } else {
                    oooOo00.f53187OooO00o.clear();
                }
                o000O0o o000o0oOooO00o = this.f53062OooO0o;
                if (o000o0oOooO00o == null) {
                    o000o0oOooO00o = o00Ooo.OooO00o();
                    this.f53062OooO0o = (o0OoOo0) o000o0oOooO00o;
                } else {
                    o000o0oOooO00o.OooO00o();
                }
                List<? extends OooOOOO> nodes = this.f53061OooO0Oo;
                Intrinsics.checkNotNullParameter(nodes, "nodes");
                oooOo00.f53187OooO00o.addAll(nodes);
                oooOo00.OooO0OO(o000o0oOooO00o);
            }
            this.f53063OooO0o0 = false;
        }
        o0ooOOo o0oooooOoooo0o = o0oo0oo2.Ooooo0o();
        long jOooO0OO = o0oooooOoooo0o.OooO0OO();
        o0oooooOoooo0o.OooO0o().OooO0oo();
        oo0o0Oo oo0o0ooOooO0Oo = o0oooooOoooo0o.OooO0Oo();
        float[] fArr = this.f53059OooO0O0;
        if (fArr != null) {
            oo0o0ooOooO0Oo.OooO0Oo(fArr);
        }
        o0OoOo0 o0oooo1 = this.f53062OooO0o;
        if ((!this.f53061OooO0Oo.isEmpty()) && o0oooo1 != null) {
            oo0o0ooOooO0Oo.OooO0OO(o0oooo1, 1);
        }
        List<OooOo> list = this.f53060OooO0OO;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).OooO00o(o0oo0oo2);
        }
        o0oooooOoooo0o.OooO0o().OooOOo0();
        o0oooooOoooo0o.OooO0o0(jOooO0OO);
    }

    @Override // p708oo000o.OooOo
    @Nullable
    public final Function0<Unit> OooO0O0() {
        return this.f53065OooO0oo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List, java.util.List<oo000o.OooOo>] */
    @Override // p708oo000o.OooOo
    public final void OooO0Oo(@Nullable Function0<Unit> function0) {
        this.f53065OooO0oo = function0;
        ?? r0 = this.f53060OooO0OO;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            ((OooOo) r0.get(i)).OooO0Oo(function0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<oo000o.OooOo>] */
    public final void OooO0o0(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.f53060OooO0OO.size()) {
                ((OooOo) this.f53060OooO0OO.get(i)).OooO0Oo(null);
                this.f53060OooO0OO.remove(i);
            }
        }
        OooO0OO();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List, java.util.List<oo000o.OooOo>] */
    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("VGroup: ");
        sbOooO0o0.append(this.f53058OooO);
        ?? r1 = this.f53060OooO0OO;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            OooOo oooOo = (OooOo) r1.get(i);
            sbOooO0o0.append("\t");
            sbOooO0o0.append(oooOo.toString());
            sbOooO0o0.append("\n");
        }
        String string = sbOooO0o0.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
